package cz.vanamir2.dp.solid.depinversion;

import org.javatuples.Triplet;

import java.util.List;

// WRONG - high level modules should not depend on low level modules.
// High-level module  - allows us on operations with some data (lower module) - user does not care how it is stored
public class Research {

    // WRONG - This constructor gets low level module as a dependency
    // if we perform changes in Relationships
    // for example, changing inner implementation of data - List to Set for example
    //      then we have to change this high-level module)
    public Research(Relationships relationships) {
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println(
                        "John has a child called " + ch.getValue2().name
                ));
    }

    // RIGHT
    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children) {
            System.out.println("John has a child called" + child.name);
        }
    }
}

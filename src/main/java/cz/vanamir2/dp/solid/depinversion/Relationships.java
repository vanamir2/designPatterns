package cz.vanamir2.dp.solid.depinversion;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

// low-level module ... it is related to data storage - simply provides a list (any business logic)
// single-responsibility - to allow manipulation with a list
public class Relationships {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }
}

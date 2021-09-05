package cz.vanamir2.dp.solid.depinversion;


/**
 * A. High-level modules should not depend on low-ledel modules. ... SQL parser should not depend on module to get 5 specific records from DB
 * Both should depend on abstractions.                           ... SQL parser and object getter - both should depend on abstractions
 * <p>
 * B. Abstractions should not depend on details.                 ... Abstraction = Interface or Abstract class (just signature)
 * Details should depend on abstractions.
 * <p>
 * Result .... you can substitute without breaking anything
 */
public class Main {

    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        // WRONG
        new Research(relationships);

        RelationshipsFixed relationshipsFixed = new RelationshipsFixed();
        relationshipsFixed.addParentAndChild(parent, child1);
        relationshipsFixed.addParentAndChild(parent, child2);
        new Research(relationshipsFixed);

    }
}

package cz.vanamir2.solid.depinversion.example;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}

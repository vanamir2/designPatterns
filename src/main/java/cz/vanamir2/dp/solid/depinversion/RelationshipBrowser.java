package cz.vanamir2.dp.solid.depinversion;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}

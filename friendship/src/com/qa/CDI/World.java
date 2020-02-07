package com.qa.CDI;

import javax.management.relation.Relation;

public class World {
private Relation relation;
public World(Relation relation);
this.relation = relation;
}
public void run() {
	System.out.println(relation.message());
}
}

package iplr.java;



class ItemBaseClass {
	static int count = 0;

	// index is set to current value of count when an object is created
	int index;

	// props common to all 3 items
	League league;
	int id;
	String fn, sn, path;

	ItemBaseClass() {
		index = count++;
		// System.out.println("ItemBaseClass was called!");
	}

	League getLeague() { return league; }
	String getClassname () { return "ItemBaseClass"; }

	public void print() {
		System.out.println("[#" + index + "] " + getClassname() + ": " + fn + " (" + path + ")");
	}
}

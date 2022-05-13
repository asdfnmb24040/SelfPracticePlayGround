package SelfPracticePlayGround;

import SelfPracticePlayGround.DataStructureAndAlgorithm.LinkedList;

public class Main {
	public static void main(String[] args) {
		var testStructure = new LinkedList();
		testStructure.addFirst(0);
		testStructure.addLast(12);
		System.out.println(testStructure.contains(12));
	}
}

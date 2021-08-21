package pkgB;

import pkgA.ClassA;
import pkgC.ClassC;

public class NewMain {
	public static void main(String[] args) {
		ClassA test = new ClassA();
		System.out.println(test.yearPublic); // Yes
		System.out.println(ClassC.transitiveVar);
		// System.out.println(test.yearProtected); // No
		// System.out.println(test.yearPackage); // No
		// System.out.println(test.yearPrivate); // No
	}
}
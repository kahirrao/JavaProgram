package samplePrograms;

public class TypeCasting {

	public static void main(String[] args) {

		// Widening Casting (automatically) - converting a smaller type to a larger type size
		// byte -> short -> char -> int -> long -> float -> double
		int myInt = 9;

		double myDouble = myInt; // Automatic casting: int to double
		float myFloat = myInt;
		String s = String.valueOf(myInt);
		long myLong = myInt;
		char myChar = (char) myInt;

		Integer i = myInt;
		byte myByte = i.byteValue();
		short myShort = i.shortValue();

		System.out.println("Int:" + myInt); // Outputs 9
		System.out.println("Double:" + myDouble); // Outputs 9.0
		System.out.println("Float:" + myFloat); //
		System.out.println("Sting s:" + s);
		System.out.println("Long:" + myLong);
		System.out.println("myChar:" + myChar);
		System.out.println("myChar:" + myByte);
		System.out.println("myChar:" + myShort);

		// Narrowing Casting (manually) - converting a larger type to a smaller size
		// type
		// double -> float -> long -> int -> char -> short -> byte
		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1; // Manual casting: double to int
		float myFloat1 = (float) myDouble1;
		long myLong1 = (long) myDouble1;
		int myInt2 = (int) myLong1;
		System.out.println(myDouble1); // Outputs 9.78
		System.out.println(myInt1); // Outputs 9
		System.out.println(myLong1);
		System.out.println("long to Int:" + myInt2);

		int myInteger = 10;
		char myCharacter = (char) myInteger;
		System.out.println("Int to Character:" + myCharacter);

	}
}

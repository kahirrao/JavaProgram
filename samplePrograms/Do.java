package samplePrograms;

public class Do {

	public static void main(String[] args) {
		
		int age=20;
		do {
			System.out.println("Age1: " +age);//20
			age++;
			System.out.println( "Age2: " +age);//21
			age++;
			System.out.println("Age3: " +age);//22
			++age;
			System.out.println("Age4: " +age);
		}
		while(age<20);
			System.out.println("Age5: " +age);
	}

}

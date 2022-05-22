package samplePrograms.Array;

public class ArrayComperasion {

	public static boolean eq(int a[], int b[]) {

		if (a.length != b.length) return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 6 };
		int b[] = { 1, 5, 3, 6 };
		int c[] = { 1, 8, 5, 3, 6 };
		int d[] = { 4, 8, 1, 9, 7 };

		System.out.println(eq(a, a));
		System.out.println(eq(a, b));
		System.out.println(eq(b, a));
		System.out.println(eq(a, d));

	}

}

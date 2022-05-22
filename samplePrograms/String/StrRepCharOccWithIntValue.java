package samplePrograms.String;

import java.util.Arrays;

public class StrRepCharOccWithIntValue {

	public static void main(String[] args) {

		String str = "kalpeshAhirrao";
		char charToReplace = 'a';

		/*
		 * if (str.indexOf(charToReplace) == -1) {
		 * System.out.println("Character is not Present in String"); System.exit(0); }
		 */
		char[] ch = str.toCharArray();// k a l p e s h a h i r r a o
		//int cnt = 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == charToReplace) {
				//ch[i] = String.valueOf(cnt).charAt(0);
				ch[i] = 'b';
				//cnt++;
			}
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(ch);
	}

}

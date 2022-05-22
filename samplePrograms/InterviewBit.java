package samplePrograms;

import java.util.HashMap;

public class InterviewBit {
	public static void main(String[] args) {
		InterviewBit b= new InterviewBit();
		int [] a = {1,14,2,6,3,8,12,5};
		int c = 1;
		System.out.println(b.twoSum(a, c));
	}
	public int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Integer diff = (Integer) (target - arr[i]);
			if (hash.containsKey(diff)) {
				int toReturn[] = { hash.get(diff) + 1, i + 1 };
				return toReturn;
			}
			hash.put(arr[i], i);
		}
		return null;
	}
}
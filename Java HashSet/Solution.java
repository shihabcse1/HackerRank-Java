//Problem Link : https://www.hackerrank.com/challenges/java-hashset/problem

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		
		for (int i = 0; i < t; i++) {
			pair_left[i] = sc.next();
			pair_right[i] = sc.next();
		}
		HashSet<String> pairs = new HashSet<String>(t);
		for (int i = 0; i < t; i++) {
			pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
			System.out.println(pairs.size());
		}

	}
}

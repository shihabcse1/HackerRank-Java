//Problem Link : https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
		} catch(InputMismatchException e){
			System.out.println(e.getClass().toString().substring(6));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
    }
}
//Problem link : https://www.hackerrank.com/challenges/java-generics/problem

import java.util.Scanner;
import java.security.MessageDigest;

public class Solution {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        sc.close();
        try {
        	/* Encode the String using MD5 */
			MessageDigest md = MessageDigest.getInstance("MD5");// Static getInstance method is called with hashing MD5 
			md.update(str.getBytes());
			byte[] digest = md.digest();// digest() method is called to calculate message digest and an input digest() return array of byte 
			
			/* Print the encoded value in hexadecimal */
			
			for (byte b : digest) {
				System.out.format("%02x", b);
			}
			//Here, "%02x" meaning
			//%[flags][width]conversion
			//Flag '0' - The result will be zero-padded
			//Width 2
			//Conversion 'X' - The result is formatted as a hexadecimal integer, uppercase
			
		} catch (Exception e) {
			
		}
    }
}
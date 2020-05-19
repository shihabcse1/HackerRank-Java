//Problem link : https://www.hackerrank.com/challenges/sha-256/problem

import java.util.Scanner;
import java.security.MessageDigest;

public class Solution {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        sc.close();
        try {
        	/* Encode the String using SHA-256 */
			MessageDigest md = MessageDigest.getInstance("SHA-256");// Static getInstance method is called with hashing SHA-256
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
			//Conversion 'x' - The result is formatted as a hexadecimal integer, Lower case 
			
		} catch (Exception e) {
			
		}
    }
}
//Problem Link : https://www.hackerrank.com/challenges/phone-book/problem
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		sc.nextLine();
		Map<String, String> phoneBook = new HashMap<>();
		for(int i = 0; i < n; i++) { //Taking Name and phone number of a person.
			String name = sc.nextLine();
			String phoneNumber = sc.nextLine();
			phoneBook.put(name, phoneNumber);
		}
		while(sc.hasNext()) {
			String name = sc.nextLine();
			if(phoneBook.containsKey(name)) {//Finding the name into phoneBook
				System.out.println(name + "=" + phoneBook.get(name));
			}else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}
}
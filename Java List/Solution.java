import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int query = sc.nextInt();
		for(int i = 0; i < query; i++) {
			String action = sc.next();
			if(action.equals("Insert")) {
				int index = sc.nextInt();
				int value = sc.nextInt();
				list.add(index, value);
			}else { //For Delete
				int index = sc.nextInt();
				list.remove(index);
			}			
		}
		for (Integer item : list) {
			System.out.print(item + " ");
		}
	}
}
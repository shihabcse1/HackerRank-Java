import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> arrLists = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int d = sc.nextInt();
			ArrayList<Integer> arrList = new ArrayList<>();
			for(int j = 0; j<d; j++) {
				arrList.add(sc.nextInt());
			}
			arrLists.add(arrList);
		}
		
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ArrayList<Integer> arrList = arrLists.get(x-1);
			if(y <= arrList.size()) {
				System.out.println(arrList.get(y-1));
			}else {
				System.out.println("ERROR!");
			}
		}
	}
}
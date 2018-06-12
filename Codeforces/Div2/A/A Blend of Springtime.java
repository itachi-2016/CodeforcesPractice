import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		boolean ans = true;
		String[] arr = { "ABC", "BCA", "ACB", "CAB", "CBA", "BAC" };
		for (String element : arr) {
			if (s.contains(element)) {
				System.out.println("Yes");
				ans=false;
				break;
			} 
			
		}
		if(ans)System.out.println("No");
	}
}

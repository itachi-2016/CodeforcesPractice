import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean a = true, b = true, ans = true;
		n = sc.nextInt();
		String s;
		int count = 0;
		s = sc.next();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '1') {
				if (ans) {
					count = 0;
					ans = false;
					b = false;
				} else {
					a = false;
					break;
				}
			} else {
				count++;
				ans = true;
				if (b && count >= 2) {
					a = false;
					break;
				}
				if (!b && count >= 3) {
					a = false;
					break;
				}
				if(!b && count>=2 && i==n-1) {
					a = false;
					break;
				}
			}
		}
		if (a && !b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

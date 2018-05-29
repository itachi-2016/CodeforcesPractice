import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k;
		String[] str = new String[n];
		int[][] arr = new int[n][m];
		int[] sum = new int[m];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
			for (int j = 0; j < m; j++) {
				if (str[i].charAt(j) == '1') {
					arr[i][j]++;
					sum[j]++;
				}
			}
		}
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			//k = sum[0] - arr[i][0];
			for (int j = 0; j < m; j++) {
				if (sum[j] <= arr[i][j]) {
					ans = false;
					break;
				}
			}
			if (ans) {
				System.out.println("YES");
				ans = false;
				break;
			}
			ans = true;
		}
		if (ans) {
			System.out.println("NO");
		}
	}
}

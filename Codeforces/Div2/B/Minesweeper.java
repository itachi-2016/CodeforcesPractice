import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] arr = new int[100][100];
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
			for (int j = 0; j < m; j++) {
				if (str[i].charAt(j) == '*') {
					if (j != m - 1) {
						arr[i][j + 1]++;
					}
					if (j != 0) {
						arr[i][j - 1]++;
					}
					if (i != n - 1) {
						arr[i + 1][j]++;
					}
					if (i != 0) {
						arr[i - 1][j]++;
					}
					if (i != 0 && j != 0) {
						arr[i - 1][j - 1]++;
					}
					if (i != n - 1 && j != 0) {
						arr[i + 1][j - 1]++;
					}
					if (i != 0 && j != m - 1) {
						arr[i - 1][j + 1]++;
					}
					if (i != m - 1 && j != m - 1) {
						arr[i + 1][j + 1]++;
					}
				}
			}
		}
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (str[i].charAt(j) == '*') {
					continue;
				} else if (str[i].charAt(j) == '.') {
					if (arr[i][j] != 0) {
						ans = false;
						break;
					}
				} else {
					if (str[i].charAt(j) - 48 != arr[i][j]) {
						ans = false;
						break;
					}
				}
			}
			if (!ans) {
				break;
			}
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

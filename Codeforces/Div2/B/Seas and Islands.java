import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		char[] c = new char[n * n];
		for (int i = 0; i < n * n; i++) {
			c[i] = 'S';
		}
		if (k > (n * n + 1) / 2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
			int i = 0, q = 1;
			while (k > 0) {

				c[i] = 'L';
				k--;
				if (i + 1 >= q * n - 1 && n % 2 == 0 && q % 2 != 0) {
					i += 3;
					q++;
					continue;
				}
				if (i + 1 >= q * n && n % 2 == 0 && q % 2 == 0) {
					i += 1;
					q++;
					continue;
				}
				i += 2;

			}
			for (int j = 0; j < n * n; j++) {
				System.out.print(c[j]);
				if ((j + 1) % n == 0) {
					System.out.println();
				}
			}
		}
	}
}

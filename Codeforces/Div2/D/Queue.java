import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] dummy = new int[n];
		for (int i = 0; i < n; i++) {
			dummy[i] = sc.nextInt();
		}
		Arrays.sort(dummy);
		int ans = 1;
		int sum = dummy[0];
		for (int i = 1; i < n; i++) {
			if (dummy[i] >= sum) {
				ans++;
				sum += dummy[i];
			}
		}
		System.out.println(ans);
	}
}

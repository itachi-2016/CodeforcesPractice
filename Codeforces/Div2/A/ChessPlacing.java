import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[] = new int[n / 2];
			for (int i = 0; i < n / 2; i++) {
				arr[i] = sc.nextInt();
			}
			int sum1, sum2, odd = 1, even = 2;
			sum1 = sum2 = 0;
			Arrays.sort(arr);
			for (int value : arr) {
				sum1 += Math.abs(value - odd);
				sum2 += Math.abs(value - even);
				odd += 2;
				even += 2;
			}
			System.out.println(Math.min(sum1, sum2));
	}
	}
}

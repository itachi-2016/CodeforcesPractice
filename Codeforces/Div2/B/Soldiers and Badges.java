import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] count = new int[50005];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			count[arr[i]]++;
		}
		Queue<Integer> unused = new LinkedList<Integer>();
		Arrays.sort(arr);
		for (int i = 1; i < count.length; i++) {
			if (count[i] == 0) {
				unused.add(i);
			}
		}
		int sum = 0, temp;
		for (int i = 1; i < n; i++) {
			if (count[arr[i]] > 1) {
				count[arr[i]]--;
				temp = unused.poll();
				while (temp <= arr[i]) {
					temp = unused.poll();
				}
				sum += (temp - arr[i]);
				count[temp]++;
			}
		}
		System.out.println(sum);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n, p;
		String s;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = sc.nextInt();
		s = sc.next();
		int vis;
		char[] c = new char[n];
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			c[i] = '.';
		}
		for (int i = 0; i < n; i++) {
			if (ans) {
				for (int j = p; j + i < n; j += p) {
					char one, two;
					one = s.charAt(i);
					two = s.charAt(j + i);
					c[i] = one;
					c[i + j] = two;
					if (one != two) {
						if ((one == '1' && two == '0') || (one == '0' && two == '1')) {
							ans = false;
							break;
						} else if (one == '1' && two == '.') {
							two = '0';
							c[j + i] = '0';
							vis = j + i;
							ans = false;
							break;
						} else if (one == '0' && two == '.') {
							c[j + i] = '1';
							vis = j + i;
							ans = false;
							break;
						} else if (one == '.' && two == '1') {
							c[i] = '0';
							vis = i;
							ans = false;
							break;
						} else if (one == '.' && two == '0') {
							c[i] = '1';
							vis = i;
							ans = false;
							break;
						}

					} else {
						if (one == '.' && two == '.') {
							c[i] = '1';
							c[i+j] = '0';
							ans = false;
							break;
						}
					}
				}
			} else {
				if (c[i] == '.') {
					if (s.charAt(i) == '.') {
						c[i] = '1';
					} else {
						c[i] = s.charAt(i);
					}
				}
			}
		}
		if (ans) {
			System.out.println("No");
		} else {
			for (int i = 0; i < n; i++) {
				//System.out.println(i+". "+c[i]+" "+c[i+p]);
			System.out.print(c[i]);
			}
		}
	}
}

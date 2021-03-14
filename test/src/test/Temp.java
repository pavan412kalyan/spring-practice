package test;

public class Temp {

	public static void main(String[] args) {
		int n = 11;
 
		System.out.println("#############################");
		System.out.println("Partitons of " + n);
		partitions(n);

	}

	public static void print(int[] a, int total) {
		for (int i = 0; i < total; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void partitions(int n) {
		int[] a = new int[n];
		a[0] = n;
		int remainder = 0;
		int p = 0;
 
		while (true) {
 
			if (remainder == 0) {
				print(a, p + 1);
			}
 
			if (a[p] == 1) {
				if (p == 0) {
					return;
				} else {
					remainder += a[p];
					p--;
				}
			} else {
				a[p]--;
				p++;
				while (remainder + 1 > a[p - 1]) {
					a[p] = a[p - 1];
					remainder -= a[p];
					p++;
				}
				a[p] = remainder + 1;
				remainder = 0;
			}
 
		}
 
	}
}

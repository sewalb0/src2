package algoritma;

import java.util.Scanner;

public class çalışma7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dizi Boyutunu Gir");
		int N = scanner.nextInt();
		int[]A = new int[N];
		int t = 0;
		for(int i = 0 ; i<N; i++) {
			System.out.println(i+".elamanı gir");
			A[i]=scanner.nextInt();
			t=t+A[i];
			System.out.println(t);
		}scanner.close();
		}

	}



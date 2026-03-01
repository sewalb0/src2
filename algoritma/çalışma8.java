package algoritma;

import java.util.Scanner;

public class çalışma8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("DİZİ BOYUTUNU GİR : ");
		int N = scanner.nextInt();
		
		int A []=new int[N];
		int B []=new int [N];
		int C []=new int [N];
		
		System.out.println("A DİZİSİ ELEMANLARINI GİR : ");
		for(int i =0 ; i<N;i++) {
			System.out.println("B[" + i + "] :");
			B[i]=scanner.nextInt();
			}
		System.out.println("C SONUÇALRI : ");
		for(int i = 0 ; i<N; i++) {
			C[i]=A[i]+B[i];
			System.out.println("C["+ i + "]= " + A[i] + "+" + B[i] + "=" C[i]);
		}

	}

}

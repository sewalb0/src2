package algoritma;


import java.util.Scanner;

public class çalışma5 {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in)	;
	System.out.println("N DEĞERİNİ GİRİN");
	
	int N = scanner.nextInt();
	
	int[]A = new int[N];
	
	for(int i = 0 ; i<N;i++) {
		System.out.println(i + ".elaman:");
		A[i]=scanner.nextInt();
	}
	System.out.println("DİZİ ELEMANLARI:");
	for (int i =0;i<N;i++) {
		System.out.println("A[" + i + "]=" + A[i]);
	}
	scanner.close();
	
		
	}

	}



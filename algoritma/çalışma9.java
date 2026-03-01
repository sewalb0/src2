package algoritma;

import java.util.Scanner;

public class çalışma9 {

	public static void main(String[] args) {
		
		Scanner notlar = new Scanner(System.in);
		System.out.println("ÖĞRENCİ SAYISINI GİR (N):");
		int N  = notlar.nextInt();
		int[] A = new int[N];
		int toplam = 0;
		
		System.out.println("NOTLARI GİR : ");
		for(int i = 0 ; i<N ; i++) {
			System.out.println("A[" + i +"] :");
			A[i] = notlar.nextInt();
			toplam =A[i];
		}
		double ort = (double) toplam /N;
		System.out.println("SINIF ORTALAMASI : " + ort);
		
		for (int i= 0; i<N; i++) {
			if (A[i]>=ort) {
				System.out.println("ÖĞRENCİ + (i+1)+"("+A[i] + GEÇTİ"):);
						
			
			} else {
				System.out.println("ÖĞRENCİ + (i+1)+"("+A[i] + KALDI"):);
				
			}
		}
		
			
		}
		
    notlar.close();
	}



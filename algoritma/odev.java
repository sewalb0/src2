 package algoritma;

import java.util.Scanner;
public class odev {

	public static void main(String[] args) {
     
		Scanner scanner = new Scanner(System.in);
		System.out.println("-Mevsim Bulma Programı-");
		
		for(int  i=1; i<=3; i++) {
			
			System.out.print(i + " . sorgu - Ay Numarası Girin (1-12):");
			int ay = scanner.nextInt();
			
		 	if (ay==1|| ay ==2|| ay ==12)
				System.out.println("KIŞ");
			
			else if (ay<=5)
			System.out.println("İLKBAHAR");
			
			else if (ay<=8)
			System.out.println("YAZ");
			
			else if (ay<=11)
				System.out.println("SONBAHAR");
			
			else {
				System.out.println("GEÇERSİZ AY");
				
				System.out.println("PROGRAM BİTTİ");
				scanner.close();
			}
		}
			
			 
	}

}

package algoritma;

import java.util.Scanner;

public class ödevtekrar {
	
public static void main(String[] args) {
	
	System.out.println("MEVSİM BULMA PROGRAMINA HOŞGELDİNİZ");
	Scanner scanner = new Scanner(System.in);
	
	for(int i =1;i<=3;i++) {
		System.out.print(i + " . sorgu -Ay Numarasını Giriniz: ");
		int ay = scanner.nextInt();
		
		if(ay==12||ay==1||ay==2)
			System.out.println("KIŞ");
		
		else if (ay<=5)
			System.out.println("İLKBAHAR");
		
		else if(ay<=8)
			System.out.println("YAZ");
		
		else if (ay<=11)
		System.out.println("SONBAHAR");
		 
		else {
		System.out.println("GEÇERLİ BİR SAYI GİRİN");
		}
	} scanner.close();
}

}

package algoritma;

import java.util.Scanner;

public class youtubeDers {

	public static void main(String[] args) {
   
		Scanner scanner =  new Scanner (System.in);
		
		System.out.print("Adınızı Girin :");
		String isim = scanner.nextLine();
		
		System.out.print("Soyadınızı Giriniz :");
		String soyad = scanner.nextLine();
		
		System.out.print("Dersi Giriniz :");
		String dersİsmi = scanner.nextLine();
		
		System.out.print("Vize1 Notunuzu Giriniz :");
		double Vize1 = scanner.nextDouble();
		
		System.out.print("Vize2 Notunuzu Giriniz :");
		double Vize2 = scanner.nextDouble();
		
		System.out.print("Final Notunuzu Giriniz :");
		double finalNot = scanner.nextDouble();
		
		double sonuc = (Vize1*0.3) + (Vize2*0.3) + (finalNot*0.4);
		
		if(sonuc>=50)
		{
			System.out.print("DERSTEN GEÇTİNİZ");
		}
		else {
			System.out.print("DERSTEN KALDINIZ");
		}
		}
	}



package algoritma;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
 
		Scanner Scanner =new Scanner(System.in);
		
		int sayi=0;
		int negatifSayac=0;
		int pozitifToplam = 0;
		
		for(int i = 1; i<=10 ;i++) {
			sayi = Scanner.nextInt();
			
			if (sayi < 0) {
                negatifSayac = negatifSayac + 1;
            } else if (sayi > 0) {
                pozitifToplam = pozitifToplam + sayi;
            }
        }

        System.out.println(negatifSayac);
        System.out.println(pozitifToplam);
    }

			
		}
		
	


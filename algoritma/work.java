package algoritma;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		
		int sayi= 0;
		int toplam = 0;
		int sayac = 0;
		
		sayi = input.nextInt();
		 
		while (sayi != 0) {
			if( sayi % 2 !=0) {
				toplam = toplam +sayi ;
			} else { 
				sayac= sayac + 1;
			}
			sayi=input.nextInt();
			
			System.out.println(toplam);
			System.out.println(sayac);
					
				}
			}
				
		
	}



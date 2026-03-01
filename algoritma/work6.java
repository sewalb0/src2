package algoritma;

import java.util.Scanner;

public class work6 {

public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("sayi1 giriniz: ");
	int sayi1 = input.nextInt();

	System.out.print("sayi2 giriniz: ");
	int sayi2 = input.nextInt();

	System.out.print("sayi3 giriniz: ");
	int sayi3 = input.nextInt();

	if (sayi1>sayi2 && sayi1>sayi3) {
	System.out.print("Birinci Sayi En Büyüktür");

	} else if (sayi2>sayi1 && sayi2>sayi3) {
	System.out.print("ikinci Sayi En Büyüktür");

	} else {
	System.out.print("Ücüncü Sayi En Büyüktür");
	}  
	input.close();
}
}



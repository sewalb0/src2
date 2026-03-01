package algoritma;

import java.util.Scanner;

public class work5 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("NOT HESAPLAMA PROGRAMINA HOSGELDİNİZ");

	System.out.print("Not 1 giriniz: ");
	int not1 = input.nextInt();

	System.out.print("Not 2 giriniz: ");
	int not2 = input.nextInt();

	System.out.print("Not 3 giriniz: ");
	int not3 = input.nextInt();
  
        int ort = (not1 + not2 + not3) / 3;
 	
	System.out.print("NOT ORTALAMANIZ: " + ort);

	input.close();
 
	}
}
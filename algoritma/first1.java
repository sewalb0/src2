package algoritma;
import java.util.Scanner;

public class first1 {

	public static void main(String[] args) {
		
		//Girilen vize ve final notlarına göre öğrencinin dersten geçip geçmediğini bulan
		//algoritma ve akış diyagramını tasarlayınız.
  
		Scanner input = new Scanner(System.in);
		
		System.out.print("VİZE NOTUNU GİRİNİZ :");
		double vize = input.nextDouble();
		
		System.out.print("FİNAL NOTUNU GİRİNİZ :");
		double finall = input.nextDouble();
		
		double ortalama = (vize*0.4)+(finall*0.6);
		System.out.println("ortalama : " + ortalama );
		
		if (ortalama >= 50) {
			System.out.println("Dersten Geçtiniz ");
		}else {
			System.out.println("Dersten Kaldınız ");
		}
		input.close();
		}
				
	}



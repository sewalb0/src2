package algoritma;

public class work9 {

	public static void main(String[] args) {
		
		    int N = 5;
		    int[] A = new int[N];
		    
		    // Önce kutulara bazı sayılar koyalım
		    A[0] = 10;
		    A[1] = 20;
		    A[2] = 5;
		    A[3] = 15;
		    A[4] = 10;

		    int toplam = 0; // Bizim kumbaramız

		    for(int i = 0; i < N; i++) {
		        toplam = toplam + A[i]; // Kumbaradaki eski paraya, kutudaki yeni parayı ekle
		        System.out.println(i + ". indeksteki sayı eklendi. Güncel Toplam: " + toplam);
		    }

		    System.out.println("--- SONUÇ ---");
		    System.out.println("Dizideki tüm sayıların toplamı: " + toplam);
		}

	}



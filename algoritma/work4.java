package algoritma;

public class work4 {

	public static void main(String[] args) {
	
		        int[] fiyatlar = {10, 25, 50, 100};

		        System.out.println("Kargo dahil fiyat listesi:");

		        for (int fiyat : fiyatlar) {
		            int yeniFiyat = fiyat + 2; // Her fiyatın üstüne 2 TL ekledik
		           System.out.println(yeniFiyat + " tl ");
		        }
		    }
		
	}



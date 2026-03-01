package algoritma;

public class çalışma1 {

	public static void main(String[] args) {
	  //DİZİLER
	int [] sayilar = new int [10];
	//değer atama(for döngüsü)
	for (int i = 0 ;i<sayilar.length ; i++) {
		sayilar[i] = i*10;
	}
	//
	for (int sayi : sayilar) {
		System.out.println(sayi);
	}
	
		

	}

}

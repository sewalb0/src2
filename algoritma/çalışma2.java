package algoritma;

public class çalışma2 {

	public static void main(String[] args) {
		//5 öğrencinin notları
		double[] notlar = {85.5,92.0,78.5,88.0,95.5};
		//toplam ve ortalama hesaplama
		double toplam =0;
		for (double not :notlar) {
			toplam += not;
		}
		double ortalama= toplam / notlar.length;
		System.out.println("sınıf ortalaması: " + ortalama);
		// en yüksek notu bulma
		double enYuksek = notlar[0];
		for (int i=1;i<notlar.length;i++) {
			if(notlar[i] >enYuksek) {
				enYuksek =notlar[i];
			}
	}
		System.out.println("enYuksek not " + enYuksek);

	}

}

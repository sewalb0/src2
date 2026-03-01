package algoritma;

public class çalışma3 {

	public static void main(String[] args) {
		//20 dizi tanımlama ve ilklendirme
		int[][]matris = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//matris boyutlarını yazdırma
		System.out.println("satır sayısı :" + matris.length);
		System.out.println("sütün sayısı :" + matris[0].length);
		// tüm elemanları yazdırma
		System.out.println("\nMatrsi elemanları:");
		
		for(int i =0 ; i< matris.length;i++) {
		for(int j =0; j< matris[i].length;j++) {
			System.out.println(matris[i][j] + "");
		
		}
		System.out.println();
		}
//belirli bir elemana erişim
		System.out.println("/matris[1][2] = " + matris[1][2]);
	}

}


public class Latihan3 {

	public static void main(String[] args) {
		/* Prioritas Operator Matematika
		 * Operator ++ -- memiliki prioritas pertama
		 * Operator * / % memiliki prioritas kedua
		 * Operator +   - memiliki prioritas ketiga
		 */
		
		int keliling, panjang, lebar;
		int hasil, x, y;
		
		panjang = 10;
		lebar = 5;
		
		x = 25;
		y = 5;
		
		keliling = 2 * panjang + 2 * lebar; // keliling = (2*panjang)+(2*lebar);
		hasil = 2 * x * y/4; // hasil = ((2*x)*y)/4;
		
		System.out.printf("Keliling = %d", keliling);
		System.out.printf("\nHasil = %d", hasil);

	}

}
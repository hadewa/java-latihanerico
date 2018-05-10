
public class EvaluasiNo6 {

	public static void main(String[] args) {
		/* Evaluasi nomor 6
		 * Berapakah nilai variabel a, b, c, dan d setelah kumpulan statement ini
		 * dijalankan?
		 * 
		 * float a, b, c;
		 * int d;
		 * 
		 * a = 1 + 3 * 5;
		 * b = --a / 3;
		 * c = a - b;
		 * d = (c + 2) / 2;
		 */
		
		int a, b, c;
		float d;
		
		a = 1 + 3*5;
		b = --a / 3;
		c = a - b;
		d = (c + 2) / 2;
		
		System.out.printf("a = %d\nb = %d\nc = %d\nd = %f", a, b, c, d);

	}

}

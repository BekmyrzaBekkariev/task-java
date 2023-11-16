public class day1 {
	public static void main(String[] args) {
		// 1
		System.out.println("Hello world");
		// 2
		int a = 3;
		// 3
		String str = "just string";
		// 4
		int i = 0;
		while(i < 10){
			System.out.println("Java1");
			i++;
		}

		for (int j = 0; j < 10; j++) {
			System.out.println("Java");
		}
		// 4 задача буууум!
		int year = 1980;
		while (year < 2020){
			System.out.println("Олимпиада " + year + " года");
			year +=4;
		}
		System.out.println(" ");
		// 5 
		for (int j = 1980; j < 2020; j +=4) {
			System.out.println("Олимпиада " + j + " года");
		}
		System.out.println(" ");
		// 6
		int k = 9;
		for (int j = 0; j <= 9; j++) {
			System.out.println(j + " * "  + k +  " = " + j * k);
		}

		System.out.println(" ------------- ");
		int i2 = 0;
		while (i2 <= 9){
			System.out.println(2 + " * "  + k +  " = " + i2 * k);
			i2++;
		}
	}
}

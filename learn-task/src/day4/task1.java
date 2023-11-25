package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/** 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
 указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 содержимое массива в консоль, а также вывести в консоль информацию о:
 а) Длине массива
 б) Количестве чисел больше 8
 в) Количестве чисел равных 1
 г) Количестве четных чисел
 д) Количестве нечетных чисел
 е) Сумме всех элементов массива
 Пример:
 Введено число 10. Сгенерирован следующий массив:
 [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 Информация о массиве:
 Длина массива: 10 */
public class task1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();

		Random random = new Random();
		int [] array = new int[arrayLength];

		for (int i = 0; i < array.length; i++ ){
			array[i] = random.nextInt(10);
		}

		System.out.println(Arrays.toString(array));

		int counter8 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 8){
				counter8++;
			}
		}

		int counter1 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 8){
				counter1++;
			}
		}

		int counterEven = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0){
				counterEven++;
			}
		}
		System.out.println(counterEven);

		int counterOdd = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0){
				counterOdd++;
			}
		}
		System.out.println(counterEven);

		int sum = 0;
		for (int i = 0; i < arrayLength; i++) {
			sum += array[i];
		}

		System.out.println(sum);
	}
}

package day4;

import java.util.Random;

/**4. Создать новый массив размера 100 и заполнить его случайными числами из
 диапазона от 0 до 10000.
 Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 Пример:
 *Для простоты пример показан на массиве размера 10

 Тройка с максимальной суммой: [2789, 4, 8742]
 Вывод в консоль:
 11535
 5
 */
public class test4 {
	public static void main(String[] args) {
//		int[] array = {1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254};
		int [] array = new int[100];
		Random random = new Random();

		for (int i = 0; i < args.length; i++)
			array[i] = random.nextInt(10000);

		int maxSum = 0;
		int maxSumInd = 0;
		for (int i = 0; i < array.length - 2; i++) {
			int sum = 0;
			for (int j = 0; j < i + 3; j++) {
				sum += array[j];
			}

			if (sum > maxSum){
				maxSum = sum;
				maxSumInd = i;
			}
		}
		int [] array2 = new int[5];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = random.nextInt(100);
			System.out.print(array2[i] + " ");
		}


		System.out.println(maxSum);
		System.out.println(maxSumInd );

	}
}

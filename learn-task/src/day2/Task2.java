package day2;

import java.util.Scanner;
/**
Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
 Используя цикл for, вывести все числа из диапазона между a и b,
которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка

 Пример:
 Вводим в консоли: 7 78
 Вывод: 15 25 35 45 55 65 75

 **/
public class Task2 {
	public static void main(String[] args){

		Scanner scanner	= new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		for (int i = a + 1; i < b; i++) {
			if (i % 5 == 0 && i % 10 != 0){
				System.out.print(i +" ");
			}
		}
	}
}

package day2;

import java.util.Scanner;

/** 1. #
 * Реализовать программу, которая принимает на вход через консоль с помощью
 класса Scanner, число, соответствующее количеству этажей в здании. Используя
 условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.

 Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
 - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
 отрицательное значение, в таком случае сообщить “Ошибка ввода”.**/

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
// ВОт он сканер
		int floorcoint = scanner.nextInt();

		if (floorcoint >= 1 && floorcoint <= 4) {
			System.out.println("Малоэтажный дом");
		} else if (floorcoint >= 5 && floorcoint <= 8) {
			System.out.println("Средне этажный дом");
		} else if (floorcoint >= 9){
			System.out.println("Много этажный дом");
		}else{
			System.out.println("Ошибка ввода");
		}
	}
}
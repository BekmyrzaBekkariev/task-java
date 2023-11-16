package day3;

/** 1. Реализовать программу, которая в консоль выводит название страны, принимая на
 вход название города. Программа должна работать до тех пор, пока не будет введено
 слово “Stop”.
 Реализовать, используя следующие данные:
 Москва, Владивосток, Ростов - Россия
 Рим, Милан, Турин - Италия **/


import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String counrty = scanner.next();

		while(true){
			String city = scanner.nextLine();

			if (city.equals("Stop"))
				break;

			switch (city){

				case "Бишкек":
				case "Балыкчы":
				case "Ыссык-Кол":
					System.out.println("Кыргызстан");
					break;

				case "Влодивосток":
				case "Ростов":
				case "Москва":
					System.out.println("Россия");
					break;

				case "Рим":
				case "Милан":
				case "Турин":
					System.out.println("Италия");
					break;

				case "Ливерпуль":
				case "Манчестер":
				case "Лондон":
					System.out.println("Великобритания");
					break;

				case "Берлин":
				case "Мюнхен":
				case "Кёлн":
					System.out.println("Германия");
					break;

				default:
					System.out.println("Не известная страна");
			}
		}
	}
}

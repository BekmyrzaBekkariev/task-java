package day7;
/** 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
 дня.
 В классе Самолет создать статический метод compareAirplanes, который в
 качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 сообщение в консоль о том, какой из самолетов длиннее. */
public class task7 {
	public static void main(String[] args) {
		Airplane airplane1 = new Airplane("Boieng", 2010,30, 40000);
		Airplane airplane2 = new Airplane("Boieng", 2010,30, 40000);

		Airplane.compareAirplane(airplane1,airplane2);
	}
}

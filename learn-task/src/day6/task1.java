package day6;
/** В классах Автомобиль и Мотоцикл реализовать два метода:
 info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 yearDifference() - принимает на вход число (год), и возвращает разницу между
 переданным годом и годом выпуска транспортного средства */
public class task1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("black");
		car.setModel("audi");
		car.setYear(2015);

		Motorbike motorbike = new Motorbike(2025, "blue", "kawasaki");

		car.info();
		motorbike.info();

		System.out.println(car.yeaerDifference(2020));
		System.out.println(motorbike.yeaerDifference(2020));

	}
}

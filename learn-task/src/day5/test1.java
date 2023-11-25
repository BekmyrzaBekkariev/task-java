package day5;
/**1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 Созданный вами класс должен отвечать принципам инкапсуляции */
public class test1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("black");
		car.setYear(2000);
		car.setModel("audi");

		System.out.println("Our car: " + car.getYear() + " year\n" +
						car.getModel() + " model\n" +
						car.getColor() + " color");
	}
}

class Car {
	private int year;
	private String color;
	private String model;

	// Правой кнопкой мыши потом Generate

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
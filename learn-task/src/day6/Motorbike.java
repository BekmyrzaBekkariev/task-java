package day6;

class Motorbike {
	private int year;
	private String color;
	private String model;

	// Alt + Insert = Хотим создать Конструктор


	public Motorbike(int year, String color, String model) {
		this.year = year;
		this.color = color;
		this.model = model;
	}

	// Правой кнопкой мыши потом Generate
	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public void info(){
		System.out.println("This is bike G");
	}

	public int yeaerDifference(int inputYear){
		// Убирает отрицательный знак
		return Math.abs(inputYear - year);
	}
}
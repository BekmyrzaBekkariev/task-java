public class if9 {
}
/** Вычислитель площади
 Напишите метод с именем area с одним двойным параметром radius.

 Метод должен возвращать двойное значение, представляющее площадь круга.

 Если параметр radius отрицательный, то верните значение -1.0 для представления недопустимого значения.

 Напишите другой перегруженный метод с 2 параметрами x и y (оба двойные), где x и y представляют стороны прямоугольника.

 Метод должен возвращать площадь прямоугольника.

 Если один из параметров или оба параметра имеют отрицательное значение, возвращает -1.0, указывая на недопустимое значение.

 Для получения формул и значения PI, пожалуйста, ознакомьтесь с приведенными ниже советами.

 Примеры ввода/вывода:

 область(5.0); должно возвращать 78.53981633974483 или 78.53981

 area(-1); должен возвращать значение -1, поскольку параметр отрицательный

 область(5.0, 4.0); должно возвращать 20.0 (5 * 4 = 20)

 область(-1.0, 4.0); должна возвращать значение -1, так как сначала параметр отрицательный



 ПРИМЕЧАНИЕ: Все методы должны быть определены как общедоступные статические, как мы делали до сих пор в курсе.
 ПРИМЕЧАНИЕ: Не добавляйте основной метод в код решения. **/

class AreaCalculator {
	public static double area(double radius) {
		if (radius < 0) {
			return -1.0;
		}
		return Math.PI * radius * radius;
	}

	public static double area(double x, double y) {
		if (x < 0 || y < 0) {
			return -1.0;
		}
		return x * y;
	}
}

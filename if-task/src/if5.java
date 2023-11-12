public class if5 {
}
/**Калькулятор високосного года
 Напишите метод isLeapYear с параметром типа int с именем year.

 Параметр должен быть больше или равен 1 и меньше или равен 9999. Если параметр не находится в этом диапазоне, верните значение false.

 В противном случае, если оно находится в допустимом диапазоне, вычислите, является ли год високосным, и верните true, если это високосный год, в противном случае верните false.



 Чтобы определить, является ли год високосным, выполните следующие действия:
 1. Если год делится поровну на 4, перейдите к шагу 2. В противном случае перейдите к шагу 5.
 2. Если год делится поровну на 100, перейдите к шагу 3. В противном случае перейдите к шагу 4.
 3. Если год делится поровну на 400, перейдите к шагу 4. В противном случае перейдите к шагу 5.
 4. Год является високосным (в нем 366 дней). Метод isLeapYear должен возвращать значение true.
 5. Год не является високосным (в нем 365 дней). Метод isLeapYear должен возвращать значение false.



 Другой способ выразить это так::

 Високосный год - это год, который делится на 4, но не на 100.

 Если оно делится на 100, оно должно делиться на 400.



 Последующие годы не являются високосными:
 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
 Это потому, что они равномерно делятся на 100, но не на 400.


 Следующие годы являются високосными:
 1600, 2000, 2400
 Это связано с тем, что они равномерно делятся как на 100, так и на 400.



 Примеры ввода/вывода:

 isLeapYear(-1600); → должно возвращать значение false, поскольку параметр не находится в диапазоне (1-9999)

 isLeapYear(1600); → должно возвращать значение true, поскольку 1600 - високосный год

 isLeapYear(2017); → должно возвращать значение false, поскольку 2017 год не является високосным

 isLeapYear(2000); → должно возвращать значение true, поскольку 2000 год - високосный

 ПРИМЕЧАНИЕ: Метод isLeapYear должен быть определен как общедоступный статический, как мы делали до сих пор в курсе.
 ПРИМЕЧАНИЕ: Не добавляйте основной метод в код решения. **/
class LeapYear {
	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		}

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}
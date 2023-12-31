public class if6 {
}
/**Десятичный компаратор
 Напишите метод areEqualByThreeDecimalPlaces с двумя параметрами типа double.

 Метод должен возвращать логическое значение, и он должен возвращать значение true, если два двойных числа совпадают с точностью до трех знаков после запятой. В противном случае верните значение false.



 ПРИМЕРЫ ВВОДА/ВЫВОДА:

 areEqualByThreeDecimalPlaces(-3.1756, -3.175); → должно возвращать значение true, поскольку числа равны с точностью до 3 знаков после запятой.

 areEqualByThreeDecimalPlaces(3.175, 3.176); → должно возвращать значение false, поскольку числа не равны до 3 знаков после запятой

 areEqualByThreeDecimalPlaces(3.0, 3.0); → должно возвращать значение true, поскольку числа равны с точностью до 3 знаков после запятой.

 areEqualByThreeDecimalPlaces(-3.123, 3.123); → должно возвращать значение false, поскольку числа не равны до 3 знаков после запятой.



 СОВЕТ: Используйте бумагу и карандаш.

 СОВЕТ: Используйте литье.

 ПРИМЕЧАНИЕ: Метод areEqualByThreeDecimalPlaces должен быть определен как общедоступный статический, как мы делали до сих пор в курсе.
 ПРИМЕЧАНИЕ: Не добавляйте основной метод в код решения. **/

class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
		int aInt = (int) (a * 1000);
		int bInt = (int) (b * 1000);

		if (aInt == bInt) {
			return true;
		}
		return false;
	}
}

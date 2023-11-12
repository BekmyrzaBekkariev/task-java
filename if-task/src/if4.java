public class if4 {
}
/** Лающая собака
 У нас есть собака, которая любит лаять.  Нам нужно проснуться, если собака лает ночью!

 Напишите метод shouldWakeUp, который имеет 2 параметра.

 1-й параметр должен иметь тип boolean и называться barking, который представляет, лает ли наша собака в данный момент.
 2-й параметр представляет час дня и имеет тип int с именем hourOfDay и имеет допустимый диапазон 0-23.

 Мы должны проснуться, если собака лает до 8 или после 22 часов, поэтому в этом случае верните значение true.

 Во всех остальных случаях возвращает значение false.

 Если параметр hourOfDay меньше 0 или больше 23, возвращает значение false.

 Примеры ввода/вывода:

 shouldWakeUp (true, 1); → должно возвращать значение true

 shouldWakeUp (false, 2); → должно возвращать значение false, поскольку собака не лает.

 shouldWakeUp (true, 8); → должно возвращать значение false, так как оно не раньше 8.

 shouldWakeUp (true, -1); → должно возвращать значение false, поскольку параметр hourOfDay должен находиться в диапазоне 0-23.



 СОВЕТ: Используйте оператор if else с несколькими условиями.

 ПРИМЕЧАНИЕ: Метод shouldWakeUp должен быть определен как общедоступный статический, как мы делали до сих пор в курсе.

 ПРИМЕЧАНИЕ: Не добавляйте основной метод в код решения.**/
class BarkingDog {
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay < 0 || hourOfDay > 23) {
			return false;
		}

		if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
			return true;
		}

		return false;
	}
}
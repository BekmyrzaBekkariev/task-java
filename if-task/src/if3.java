public class if3 {
}
/**
 * Конвертер мегабайт
 * Напишите метод с именем printMegaBytesAndKiloBytes, который имеет 1 параметр типа int с именем kiloBytes.
 * Метод не должен возвращать ничего (void), и ему необходимо вычислить мегабайты и оставшиеся килобайты по параметру kilobytes.
 * Затем ему нужно напечатать сообщение в формате "XX KB = YY MB и ZZ KB".
 * XX представляет исходное значение в килобайтах.
 * YY представляет вычисленные мегабайты.
 * ZZ представляет вычисленные оставшиеся килобайты.
 * Например, если параметр kiloBytes равен 2500, необходимо вывести "2500 КБ = 2 МБ и 452 КБ".
 * Если параметр kiloBytes меньше 0, то выведите текст "Недопустимое значение".
 * ПРИМЕР ВВОДА/ВЫВОДА
 * printMegaBytesAndKiloBytes(2500); → должен быть напечатан следующий текст: "2500 КБ = 2 МБ и 452 КБ"
 * printMegaBytesAndKiloBytes(-1024); → должен быть напечатан следующий текст: "Недопустимое значение", поскольку параметр меньше 0.*
 * printMegaBytesAndKiloBytes(5000); → должен быть напечатан следующий текст: "5000 КБ = 4 МБ и 904 КБ"
 * СОВЕТ: Будьте предельно осторожны с пробелами в печатном сообщении.
 * СОВЕТ: Используйте оператор остатка
 * СОВЕТ: 1 МБ = 1024 КБ
 *
 * ПРИМЕЧАНИЕ: Не устанавливайте значение параметра в килобайтах внутри вашего метода.
 *
 * ПРИМЕЧАНИЕ: Решение не будет принято, если есть лишние пробелы.
 *
 * ПРИМЕЧАНИЕ: Метод printMegaBytesAndKiloBytes должен быть определен как общедоступный статический, как мы делали до сих пор в курсе.
 * ПРИМЕЧАНИЕ: Не добавляйте основной метод в код решения.**/

class MegaBytesConverter {
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int megaBytes = kiloBytes / 1024;
			int remainingKiloBytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
		}
	}
}

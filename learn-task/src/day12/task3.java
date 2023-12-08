package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/** 3. *Выполнять в подпапке task3 в day12*
 Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 (название музыкальной группы и год основания). Создать 10 или более экземпляров
 класса MusicBand добавить их в список (выбирайте такие музыкальные группы,
 которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 список. Создать статический метод в классе Task3:
 public static List<MusicBand> groupsAfter2000(List<MusicBand>
 bands)
 Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 состоящий из групп, основанных после 2000 года. Вызвать метод
 groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 после 2000 года)*/
public class task3 {
	public static void main(String[] args) {
		MusicBand m1 = new MusicBand("Queen", 1987);
		MusicBand m2 = new MusicBand("dualipa", 2020);
		MusicBand m3 = new MusicBand("jouy", 2023);
		MusicBand m4 = new MusicBand("Per", 2021);
		MusicBand m5 = new MusicBand("Pir", 2010);
		MusicBand m6 = new MusicBand("Petr", 2011);
		MusicBand m7 = new MusicBand("Ira", 2010);
		MusicBand m8 = new MusicBand("Igor", 2011);
		MusicBand m9 = new MusicBand("rili", 2033);
		MusicBand m10 = new MusicBand("fifa", 2022);

		List<MusicBand> musicBands = new ArrayList<>();
		musicBands.add(m1);
		musicBands.add(m2);
		musicBands.add(m3);
		musicBands.add(m4);
		musicBands.add(m5);
		musicBands.add(m6);
		musicBands.add(m7);
		musicBands.add(m8);
		musicBands.add(m9);
		musicBands.add(m10);

		System.out.println(musicBands);

		Collections.shuffle(musicBands);

		System.out.println(musicBands);

		List<MusicBand> musicBandsAfter2000 = new ArrayList<>();

		for (MusicBand band : musicBands )
			if	(band.getYear() > 2000)
				musicBandsAfter2000.add(band);

		System.out.println(musicBandsAfter2000);
	}
}

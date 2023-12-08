package day12;

import java.util.List;

public class MusicBand {

	public MusicBand(String name, int year){
		this.name = name;
		this.year = year;
		this.members = members;
	}


	private List<String> members;

	private String name;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<String> getMembers() {
		return members;
	}

	public static void transfer(String[] args) {

	}


	public void setMembers(List<String> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "MusicBand{" +
						"name='" + name + '\'' +
						", year=" + year +
						'}';
	}
}

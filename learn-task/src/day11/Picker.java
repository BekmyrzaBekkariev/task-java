package day11;

public class Picker implements Worker{
	private int salary;
	private Warehouse warehouse;

	public Picker(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void doWork() {
		salary += 100;
		warehouse.setCountOrders(warehouse.getBalance() + 1);

	}

	@Override
	public void bonus() {
		if (warehouse.getBalance() > 1500){
			salary *= 3;
		}
	}

	@Override
	public String toString() {
		return "Picker{" +
						"salary=" + salary +
						'}';
	}


}

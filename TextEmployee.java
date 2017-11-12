package lab04.part1;

public class TextEmployee {

	public static void main(String[] args) {

		final int NUMBER_OF_EMPLOYEES = 4;
		Employee[] employees = new Employee[NUMBER_OF_EMPLOYEES];

		employees[0] = new FulltimeEmployee("John", 32000);
		employees[1] = new FulltimeEmployee("Jim", 28000);
		employees[2] = new PartTimeEmployee("Jack", 15);
		employees[3] = new PartTimeEmployee("Jerry", 14.5);

		for (Employee e: employees) {
			e.printStatus();
		}
	}
}

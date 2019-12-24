package O1_SHORTCUTS;

public class EmployeesObjects {
	
	public static void main(String[] args) {
		
	Person humanBeing = new Person("Rahwa", "007", 20, 123456, "CEO", 200000);
		print(humanBeing);

		Person anotherHumanBeing = new Person("Madina", "607487", 20, 4532671, "SDET", 850000);
		print(anotherHumanBeing);


	}

	private static void print(Person anotherHumanBeing) {
		anotherHumanBeing.getInfo();
	}

}

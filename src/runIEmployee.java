public class runIEmployee {
    public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee("Lam", 20000, 4);
		System.out.println("Name: " + employee1.getName());
		System.out.println("Salaryday: " + employee1.calculateSalary());

		IEmployee employee2 = new FullTimeEmployee("Thai", 20000);
		System.out.println("Name: " + employee2.getName());
		System.out.println("Salaryday: " + employee2.calculateSalary());
	}
}
    


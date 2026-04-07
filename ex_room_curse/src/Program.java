import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employe> employeesList = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");

			System.out.print("id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			employeesList.add(new Employe(id, name, salary));
		}
		
		
		sc.close();
	}

}

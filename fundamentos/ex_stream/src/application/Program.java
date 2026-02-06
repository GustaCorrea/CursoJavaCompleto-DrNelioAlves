package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			record Employe(String nome, String email, Double salario) {}
			
			List<Employe> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employe(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(x -> x.salario() > salary)
					.map(x -> x.email())
					.sorted()
					.toList();
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.nome().charAt(0) == 'M')
					.map(x -> x.salario())
					.reduce(0.0, Double::sum);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
					
			
			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}

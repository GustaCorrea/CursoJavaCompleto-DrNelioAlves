import java.util.Scanner;

import entities.Rent;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rent[] vet = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();

			if (room >= 1 && room <= 10) {
				vet[room - 1] = new Rent(name, email);
			} else {
				System.out.println("Invalid room number!");
			}
		}

		System.out.println();
		System.out.println("Busy rooms:");

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println((i + 1) + ": " + vet[i].getName() + ", " + vet[i].getEmail());
			}
		}

		sc.close();
	}
}
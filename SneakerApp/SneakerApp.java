package oopsdan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SneakerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LoginSystem loginSystem = new LoginSystem();
		boolean authenticated = false;
		while (!authenticated) {
			System.out.print("Enter username: ");
			String username = scanner.nextLine();
			System.out.print("Enter password: ");
			String password = scanner.nextLine();
			authenticated = loginSystem.authenticate(username, password);
			if (!authenticated) {
				System.out.println("\nInvalid username or password. Please try again.");
				System.out.println();
			}
		}
		System.out.println("\nAuthentication successful!");
		System.out.println();

		// Create an array of Sneaker objects
		Sneaker[] sneakers = {
				new Sneaker("Nike", "Air Max 90", "White/Black", 9.5, 150.0, LocalDateTime.of(2023, 6, 1, 10, 0)),
				new Sneaker("Adidas", "Yeezy Boost 350", "Pirate Black", 10.0, 220.0,
						LocalDateTime.of(2023, 6, 15, 10, 0)),
				new Sneaker("Jordan", "Air Jordan 1", "Bred", 9.0, 170.0, LocalDateTime.of(2023, 7, 1, 10, 0)),
				new Sneaker("New Balance", "990v5", "Grey", 10.5, 175.0, LocalDateTime.of(2023, 7, 15, 10, 0)) };

		// Create an empty shopping cart
		ArrayList<Sneaker> cart = new ArrayList<>();

		// Display the main menu
		while (true) {
			System.out.println("Main Menu:");
			System.out.println("1. View Upcoming Releases");
			System.out.println("2. View Shopping Cart");
			System.out.println("3. Add Sneaker to Shopping Cart");
			System.out.println("4. Remove Sneaker from Shopping Cart");
			System.out.println("5. Checkout");
			System.out.println("6. Exit");
			System.out.print("\nEnter your choice: ");
			int choice = scanner.nextInt();
			System.out.println();

			if (choice == 1) {

				// Display upcoming releases
				System.out.println("Upcoming Releases:");
				for (Sneaker sneaker : sneakers) {
					if (sneaker.getReleaseDate().isAfter(LocalDateTime.now())) {
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm a");
						String formattedDate = sneaker.getReleaseDate().format(formatter);
						System.out.println(sneaker.getBrand() + " " + sneaker.getModel() + " - " + formattedDate);
					}
				}
				System.out.println();
			} else if (choice == 2) {

				// Display shopping cart
				if (cart.isEmpty()) {
					System.out.println("Your shopping cart is empty.");
				} else {
					System.out.println("Your shopping cart:");
					for (Sneaker sneaker : cart) {
						System.out.println(sneaker.getBrand() + " " + sneaker.getModel() + " - $" + sneaker.getPrice());
					}
				}
				System.out.println();
			} else if (choice == 3) {

				// Add sneaker to shopping cart
				System.out.println("Available Sneakers:");
				for (int i = 0; i < sneakers.length; i++) {
					System.out.println((i + 1) + ". " + sneakers[i].getBrand() + " " + sneakers[i].getModel() + " - $"
							+ sneakers[i].getPrice());

				}
				System.out.print("Enter the number of the sneaker you want to add to your shopping cart: ");
				int sneakerIndex = scanner.nextInt() - 1;
				if (sneakerIndex >= 0 && sneakerIndex < sneakers.length) {
					cart.add(sneakers[sneakerIndex]);
					System.out.println("Sneaker added to shopping cart.");
				} else {
					System.out.println("Invalid sneaker number.");
				}
				System.out.println();
			} else if (choice == 4) {

				// Remove sneaker from shopping cart
				if (cart.isEmpty()) {
					System.out.println("Your shopping cart is empty.");
				} else {
					System.out.println("Your shopping cart:");
					for (int i = 0; i < cart.size(); i++) {
						System.out.println((i + 1) + ". " + cart.get(i).getBrand() + " " + cart.get(i).getModel()
								+ " - $" + cart.get(i).getPrice());
					}
					System.out.print("Enter the number of the sneaker you want to remove from your shopping cart: ");
					int sneakerIndex = scanner.nextInt() - 1;
					if (sneakerIndex >= 0 && sneakerIndex < cart.size()) {
						cart.remove(sneakerIndex);
						System.out.println("Sneaker removed from shopping cart.");
					} else {
						System.out.println("Invalid sneaker number.");
						System.out.println();
					}
				}
				System.out.println();
			} else if (choice == 5) {

				// Checkout
				if (cart.isEmpty()) {
					System.out.println("Your shopping cart is empty.");
				} else {
					double total = 0.0;
					for (Sneaker sneaker : cart) {
						total += sneaker.getPrice();
					}
					System.out.println("Thank you for your purchase! Your total is $" + total + ".");
					cart.clear();
				}
				System.out.println();
			} else if (choice == 6) {

				// Exit
				System.out.println("Thank you for using the SneakerApp. Have a nice day!");
				break;
			} else {
				System.out.println("Invalid choice. Please try again.");
				System.out.println();
			}
		}
	}
}

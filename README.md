# Sneaker App

This is a Java console application that allows users to view upcoming sneaker releases, add sneakers to a shopping cart, and checkout. Before accessing the app, the user must authenticate with a default username and password.

## How to Run 


To run the program, you will need to have Java installed on your machine. Once you have Java installed, follow these steps:

1. Clone this repository or download the source code as a zip file.
2. Open the project in your preferred Java IDE (such as Eclipse or IntelliJ IDEA).
3. Compile and run the `SneakerApp` class.

Alternatively, you can run the program from the command line by navigating to the root directory of the project and running the following commands:

```sh
javac oopsdan/SneakerApp.java
java oopsdan.SneakerApp
```

## Authentication

The default username and password are both "Admin". The application uses SHA-256 hashing to secure the password. 

## Usage

The application will display a main menu with the following options:

1. View Upcoming Releases
2. View Shopping Cart
3. Add Sneaker to Shopping Cart
4. Remove Sneaker from Shopping Cart
5. Checkout
6. Exit

To make a selection, enter the number corresponding to the option and press Enter.

### View Upcoming Releases

This option displays a list of upcoming sneaker releases. The release dates are hardcoded in the `Sneaker` objects in the `SneakerApp` class.

### View Shopping Cart

This option displays the items currently in the shopping cart, if any.

### Add Sneaker to Shopping Cart

This option displays a list of available sneakers and prompts the user to select a sneaker to add to the shopping cart.

### Remove Sneaker from Shopping Cart

This option displays the items currently in the shopping cart and prompts the user to select a sneaker to remove from the shopping cart.

### Checkout

This option displays the total price of the items in the shopping cart and prompts the user to confirm the purchase.

### Exit

This option exits the application.

## About the Code

The `LoginSystem` class handles user authentication by comparing the entered username and password to the default values. The `Sneaker` class defines the properties of a sneaker, and the `SneakerApp` class contains the main logic of the application.

The application uses an array to store the available sneakers and an `ArrayList` to store the items in the shopping cart.

The application uses Java's built-in `LocalDateTime` class to handle date and time calculations.

## Contributing

This program was created as a learning exercise and is not intended for production use. However, if you would like to contribute to the project, feel free to submit a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more information.

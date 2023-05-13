package oopsdan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sneaker {
	private String brand;
	private String model;
	private String colorway;
	private double size;
	private double price;
	private LocalDateTime releaseDate;

	public Sneaker(String brand, String model, String colorway, double size, double price, LocalDateTime releaseDate) {
		this.brand = brand;
		this.model = model;
		this.colorway = colorway;
		this.size = size;
		this.price = price;
		this.releaseDate = releaseDate;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColorway() {
		return colorway;
	}

	public double getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}
}

// 150117051 Metehan ERTAN
import java.util.Date;

public class Ticket {

	private Vehicle vehicle;
	private java.util.Date entryDate;
	private java.util.Date exitDate;
	private static double totalPrice;
	public int numberOfTickets;
	public double hourlyPrice;

	entryDate=new java.util.Date();
	Ticket ticket = new Ticket(vehicle, entryDate);

	public Ticket(Vehicle vehicle, java.util.Date entryDate) {
		this.vehicle = vehicle;
		this.entryDate = entryDate;
	}

	public static void CalculatePrice(double hourlyPrice, java.util.Date exitDate, java.util.Date entryDate) {
		exitDate = new java.util.Date();
		double price = ParkPlace.getSize() * (((int) (exitDate.getHours() - entryDate.getHours())) + 1) * hourlyPrice;
		totalPrice = price;
	}

	public String getTicketInfo(boolean carStatus, java.util.Date exitDate, java.util.Date entryDate,
			double totalPrice) {
		if (carStatus) {
			return "Ticket Info\nPlate Number : " + vehicle.getPlateNumber() + "\nEntry : " + entryDate;
		} else {
			CalculatePrice(hourlyPrice, exitDate, entryDate);
			return "Ticket Info\nPlate Number : " + vehicle.getPlateNumber() + "\nEntry : " + entryDate + "\nExit :"
					+ exitDate + "Hour : " + ((int) (exitDate.getHours() - entryDate.getHours())) + "\nFee : "
					+ totalPrice;
		}
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public double getPrice() {
		return totalPrice;
	}
}
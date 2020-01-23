// 150117051 Metehan ERTAN
public class CarPark {

	private int capacity;
	public boolean[] parkPlaceArray = new boolean[capacity];
	public String[] Ticket = new String[numberOfTickets];
	private double hourlyPrice;

	CarPark park = new CarPark(capacity, parkPlaceArray, Ticket, hourlyPrice);

	public CarPark(int capacity, boolean[] parkPlaceArray, String[] Ticket, double hourlyPrice) {
		this.capacity = capacity;
		this.parkPlaceArray = parkPlaceArray;
		this.Ticket = Ticket;
		this.hourlyPrice = hourlyPrice;
	}

	public String[] parkVehicle(Vehicle vehicle, Ticket entryDate, boolean[] parkPlaceArray){
			boolean empty;
			for(int i=0;i<=capacity;i++){
				int total=total+ParkPlace.getSize();
			}
			

		return Ticket;
	}
}
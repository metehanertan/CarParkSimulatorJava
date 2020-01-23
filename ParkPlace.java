// 150117051 Metehan ERTAN
public class ParkPlace {

	private int Size;
	private Vehicle vehicle;

	ParkPlace parkPlace = new ParkPlace(vehicle);

	public ParkPlace(Vehicle vehicle) {
		this.vehicle = vehicle;

	}

	public int getSize() {
		return this.Size;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
}
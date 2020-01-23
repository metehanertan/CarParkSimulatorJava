// 150117051 Metehan ERTAN
public class Vehicle {

	private String plateNumber;
	private int Size;

	Vehicle vehicle = new Vehicle(plateNumber, Size);

	public Vehicle(String plateNumber, int Size) {
		this.plateNumber = plateNumber;
		this.Size = Size;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public int getSize() {
		return Size;
	}

	public String getVehicleInfo() {
		return ("Vehicle Info\nPlate Number : " + plateNumber + "\nSize : " + Size);
	}
}
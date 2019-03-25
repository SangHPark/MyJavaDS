package section1;

public class Computer {
	public String manufacturer;
	public String processor;
	public int ramSize;
	public int diskSize;
	public double processorSpeed;
	
	public Computer(String man, String proc, int ram, int disk, double speed) {
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = speed;
	}
	
	public double computerPower() {
		return ramSize * processorSpeed;
	}
	
	public String toString() {
		String result = "Manufacturer: " + manufacturer +
						"\nCPU: " + processor +
						"\nRAM: " + ramSize + " megabytes" +
						"\nDisk: " + diskSize + " gigabytes" +
						"\nProcessor speed: " + processorSpeed + " gigahertz";
		return result;
	}
		

}

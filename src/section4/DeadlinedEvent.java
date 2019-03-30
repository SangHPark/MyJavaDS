package section4;

public class DeadlinedEvent extends Event {
	
	public MyDate deadline;
	
	public DeadlinedEvent(String title, MyDate date) {
		super(title);
		this.deadline = date;
	}
	
	public  boolean isRelevant(MyDate date) {
		return this.deadline.compareTo(date) >= 0;
	}	

	public String toString() {
		return title + ", " + deadline.toString();
	}
	
	public MyDate getRepresentativeDate() {
		return deadline;
	}	
}
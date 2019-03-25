package section4;

public class DurationEvent extends Event{
	
	public MyDate begin;
	public MyDate end;
	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		this.begin = b;
		this.end = e;
	}
	
	public  boolean isRelevant(MyDate date) { // begin <= date <= end
		return this.begin.compareTo(date) <= 0 && this.end.compareTo(date) >= 0 ;
	}
	
	public String toString() {
		return title + ", " + begin.toString() + "~" + end.toString();
	}	
}

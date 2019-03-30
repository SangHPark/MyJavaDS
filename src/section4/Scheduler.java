package section4;

import java.util.Arrays;
import java.util.Scanner;

public class Scheduler {
	private int capacity = 1;
	public Event [] events = new Event[capacity];
	public int n = 0;
	private Scanner kb;
	
	public void processCommand() {
		kb = new Scanner( System.in);
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("addevent")) {
				String type = kb.next();
				if (type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				} 
				else if (type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				} 
				else if (type.equalsIgnoreCase("deadline")) {
					handleAddDeadlinedEvent();
				}
				 
				
			} else if  (command.equals("list")) {
				handleList();
				
			} else if  (command.equals("show")) {
				handleShow();
			} else if  (command.equals("sort")) {
				Arrays.sort(events, 0, n);
				
			} else if  (command.equals("exit")) {
				break;
			}
		}
		kb.close();
	}
	private void handleShow() {
		String dateString = kb.next();
		MyDate theDate = parseDateString(dateString);
		for (int i = 0; i < n; i++) {
			// test if event[i] is relevant to the date, then print
			if (events[i].isRelevant( theDate )) {
				System.out.println(events[i].toString());
			}
		}
		
	}
	private void handleList() {
		for (int i =0; i <n; i++) {
			System.out.println("     " + events[i].toString()); //dynamic binding
		}
		
	}
	private void handleAddDeadlinedEvent() {
		// TODO Auto-generated method stub
		
	}
	private void handleAddDurationEvent() {
		// TODO Auto-generated method stub
		
	}
	private void handleAddOneDayEvent() {
		System.out.print("   when:  ");
		String dateString = kb.next();
		
		System.out.print("   title:  ");
		String title = kb.next();

		MyDate date = parseDateString( dateString );
		OneDayEvent ev = new OneDayEvent(title, date);
		
//		System.out.println(ev.toString());
		addEvent(ev);
		
		
		
	}
	private void addEvent(Event ev) {
		if ( n >= capacity) {
			reallocate();
		}
		events[n++] = ev;
	}
	
	private void reallocate() {
		Event [] tmp = new Event[capacity *2];
		for (int i = 0; i < n; i ++ ) {
			tmp [i] = events[i];
		}
		
		events = tmp;
		capacity *= 2;
		
		
	}
	private MyDate parseDateString(String dateString) {
		String [] tokens = dateString.split("/");
		//tokens[0] = "2017";
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate(year, month, day);
		return d;
	}
	public static void main(String[] args) {
		
//		String str1 = "11.asdf.92345.sadf";
//		String str2 = "11 asdf 			92345      sadf";
//		String[] tokens1 = str1.split("\\.");  //regular expression, escape character
//		String[] tokens2 = str2.split("\\s+");  //regular expression, escape character
//		for (int i = 0; i < tokens1.length; i++ ) {
//			System.out.println( tokens1[i] );
//		}
//		System.out.println("");
//		for (int i = 0; i < tokens2.length; i++ ) {
//			System.out.println( tokens2[i] );
//		}		
		
		
		
		Scheduler app = new Scheduler();
		app.processCommand();

	}

}

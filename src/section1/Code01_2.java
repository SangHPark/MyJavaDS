package section1;

public class Code01_2 {

	public static void main(String[] args) {
		Person1 first;
		first = new Person1();
		
		first.name = "John";
		first.number = "112123123";
		

		
//		System.out.println(first.name + "," + first.number);

		Person1 second;
		second = first;
		
		second.name = "Tom";
		
//		System.out.println(first.name + "," + first.number);
		

		second.number = "1234242354";
		
		Person1 [] members = new Person1[100];
		members[0] = first;
		members[1] = second;
		
		///////////////////////////
		members[2] = new Person1();
		///////////////////////////
		
		members[2].name = "David";
		members[2].number = "221324";
		
		
		
		System.out.println(members[0].name + "," + members[0].number);
		System.out.println(members[1].name + "," + members[1].number);
		System.out.println(members[2].name + "," + members[2].number);
		

	}

}

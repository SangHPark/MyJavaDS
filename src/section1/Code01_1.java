package section1;

public class Code01_1 {

	public static void main(String[] args) {
		Person1 first;
		first = new Person1();
		
		first.name = "John";
		first.number = "112123123";
		
		Person1 [] members = new Person1[100];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "12212344";
		
		System.out.println(first.name + "," + first.number);

	}

}

package section3;

public class Test {
	public int a = 5;
	public double x = 1.2;
	
	public String toString() {
		return a + " " + x;
	}
	
	public boolean equals(Object other) { //overriding
		Test other2 = (Test)other; //type casting
		return a == other2.a && x == other2.x;
	}
	
	public static void main(String[] args) {
//		Test test1 = new Test();
//		Test test2 = new Test();
//		
//		test2.a = 5;
//		test2.x = 1.2;
//		
//		System.out.println(test1.toString());
//		
//		if(test2.equals(test1)) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
		
		Object [] array = new Object[100];
		int a = 20;
		Integer age = new Integer(a); //wrapping
		array[0] = age;
		
		array[0] = a; //원래 안되어야 되는데 auto boxing 기능으로 가능
		
		int b = age.intValue(); //unwrapping
		System.out.println(b);
		
		int c = (Integer)array[0]; //원래 안되어야 되는데 auto unboxing 기능으로 가능
		
		String str = "1234";
		int d = Integer.parseInt(str);
		
		System.out.println(d);		
	}
}

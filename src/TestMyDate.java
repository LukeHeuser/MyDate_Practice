

public class TestMyDate{

	public static void main(String[] args){
		MyDate date1 = new MyDate(11,11,1918); //assigning the date through the object instantiation

		MyDate date2 = new MyDate(); //assigning the date using the reference variables from MyDate
		date2.day = 11;
		date2.month = 11;
		date2.year = 1918;

		MyDate date3 = new MyDate(); // assigning the date through the setDate methods behaviour
		date3.setDate(4,21,1968);

		MyDate date4 = new MyDate(); //calls the no-args constructor instantiating the initialization block

		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();
		String str4 = date4.toString();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
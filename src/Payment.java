
public class Payment {

	public static void main(String[] args) {
		//create person object
		Person person = new Person();
		person.setFirstName("Jason");
		person.setLastName("Kempel");
		person.setHourlyRate(20.50);
		
		System.out.println(person.toString());
		
		System.out.println(person.getPayment(40));
	}

}

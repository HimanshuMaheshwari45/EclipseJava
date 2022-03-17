
public class ModelAPerson {
	
	private static final String Babu = null;
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	
	public ModelAPerson(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void introduceYourself() {
		
		System.out.println("My name is " + this.firstName + " " + this.lastName + " I am " + this.age + " Years old");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ModelAPerson person1  = new ModelAPerson("Himanshu", "Maheshwari", 28);
		ModelAPerson person2  = new ModelAPerson("Deepanshu", "Maheshwari", 24);
		
		person2.getFirstName();
		person2.setFirstName("Babu");
		
		person1.introduceYourself();
		person2.introduceYourself();
		
		
	}

}

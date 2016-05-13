package session4Assignment3;

public class encapsulation {

public static void main(String[] args) {
		employee emp1 = new employee("Ratan", "Bombay", "5751", "14/06/1978");//constructor1ref
		employee someemployee = new employee();//constructor2ref
		
		System.out.println(emp1.getName());
		System.out.println(someemployee.getName());
	}
	
}
	
class employee{
	//encapsulation class for employee details declared private so that they cannot be a
	//accessed by any other class other than employee.
	private String name;
	private String Address;
	private String employeeID;
	private String dateOfBirth;

	//constructor1
	public employee(String n, String Add, String emp, String dob){
		name = n;
		Address = Add;
		employeeID = emp;
		dateOfBirth = dob;
	}
	//constructor2
	public employee(){
		name = "Warren";
		Address = "MHB";
		employeeID = "5412";
		dateOfBirth = "07/08/1990";
				}
				
				
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(String employeeID) {
			this.employeeID = employeeID;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


}



package ref;

public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1,"Bhagyashri");
		System.out.println("========================================================");
		System.out.println("Employe id is : "+employee.getId());
		System.out.println("Employee Name is : "+employee.getName());
	}
}

class Employee{
	
	int id;
	String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}	
}

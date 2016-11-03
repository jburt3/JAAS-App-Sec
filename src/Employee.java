/**
 * @author joey
 * Represents an Employee in a 
 */
public class Employee {

	enum position {CEO, VP, Manager, Associate, JrAssociate};
	
	String name;
	int id;
	position pos;
	Employee sName;
	double salary;
	
	// Constructor for Employee with a supervisor
	public Employee(String name, int id, position pos, Employee sName, double salary) {

		this.name = name;
		this.id = id;
		this.pos = pos;
		this.sName = sName;
		this.salary = salary;
	}
	
	// Constructor for Employee without a supervisor
	public Employee(String name, int id, position pos, double salary) {
		
		this.name = name;
		this.id = id;
		this.pos = pos;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	/**
	 * @return  an Employee's data in string format 
	 */
	public String toString() {
		return (name + ", " + id + ", " + pos + ", " + sName + ", $" + salary);
	}
	
	/**
	 * @return name  the Employee's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name  the Employee's new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return pos  the Employee's current position 
	 */
	public position getPos() {
		return pos;
	}

	/**
	 * @param pos  the Employee's new position
	 */
	public void setPos(position pos) {
		this.pos = pos;
	}

	/**
	 * @return  the Employee's name
	 */
	public Employee getsName() {
		return sName;
	}

	/**
	 * @param sName  the Employee's new name
	 */
	public void setsName(Employee sName) {
		this.sName = sName;
	}

	/**
	 * @return salary  the Employee's salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * @param salary  the Employee's new salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return id  the Employee's id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id  the Employee's new id
	 */
	public void setId(int id) {
		this.id = id;
	}	
}
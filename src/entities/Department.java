package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	
	private Address address;
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payRoll() {
		double pay = 0;
		for(Employee e : employees) {
			pay += e.getSalary();
		}
		return pay;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento ");
		sb.append(name + " = R$ ");
		sb.append(String.format("%.2f", payRoll()) + "\n");
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay + "\n");
		sb.append("Funcionários: \n");
		for(Employee e : employees) {
			sb.append(e.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: " + address.getEmail());
		return sb.toString();
	}
}

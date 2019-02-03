package poc.spring.integration.service;

import java.io.Serializable;

public class Employee implements Serializable {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		// TODO Auto-generated constructor stub
	}

}

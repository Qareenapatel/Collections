package mapconceptpractice;

import java.util.Objects;

public class Employee {

	public String name;
	public int age;
	
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	 public String getName() {
		return name;
	}

	 public void setName(String name) {
		this.name = name;
	}
   
	 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	}

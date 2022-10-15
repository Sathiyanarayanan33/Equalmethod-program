package collection; //equals override method

import java.util.Objects;

public class Setprogram {
	private String name;
	private int age;
	private int mark;
	
	public Setprogram(String name, int age, int mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	
	public Setprogram() {
		
	}
	public static void main(String[] args) {
		Setprogram s1=new Setprogram("Sathiya",21,333);
		Setprogram s2=new Setprogram("Sathiya",22,333);
		System.out.println(s1.equals(s2));//op false
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Setprogram other = (Setprogram) obj;
		return age == other.age;
	}

}

package Icanio;

class student<s,u>{
	s name;
	u age;
	
	void set(s name, u age) {
		this.name = name;
		this.age = age;
	}
	
	s getname() {
		return  name;
	}
	
	u getage() {
		return  age;
	}
}

public class generics {
	public static void main(String[] argv) {
		student<String, Integer> obj = new student<>();
		obj.set("Sujan", 20);
		System.out.println(obj.getname()+" : "+obj.getage());
	}
}

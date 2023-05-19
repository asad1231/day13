package overriding;

import java.util.ArrayList;

class A03{
	
}
class B03 extends A03{
	
}
class C03{
	int age;
	String name;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + age + ", " + name + "]";
	}
	
}
public class MainClass03 {
	public static void main(String[] args) {
		A03 b = new B03();
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		C03 c = new C03();
		c.age = 20; c.name = "홍길동";
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println(arr);
		System.out.println(arr.toString());
			
	}
}

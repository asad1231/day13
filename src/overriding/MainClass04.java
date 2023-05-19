package overriding;
final class A04{
	public void test() {
		System.out.println("부모메소드");
	}
}
class B04{
	A04 a = new A04();
	public void test() {
		a.test();
		System.out.println("자식메소드");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}

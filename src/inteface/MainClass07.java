package inteface;
interface Unit07{
	public void attack();
	public void defense();
}
class A07 implements Unit07{
	public void 총알장전() {}
	public void 기름칠() {}
	@Override
	public void attack() {
		총알장전();
		기름칠();
		System.out.println("지상군이 공격합니다");
	}

	@Override
	public void defense() {
		System.out.println("지상군이 방어합니다");
	}
	
}
public class MainClass07 {
	public static void main(String[] args) {
		Unit07 a = new A07();
		a.attack();
	}
}

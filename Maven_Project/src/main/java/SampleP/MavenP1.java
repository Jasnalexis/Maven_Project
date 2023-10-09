package SampleP;

public class MavenP1 extends MavenP{
 public void num()
 {
	 super.add();
	 System.out.println(super.c);
	 System.out.println("Hi");
 }
	public static void main(String[] args) {
	MavenP1 ob = new MavenP1();
	//ob.add();
	ob.num();
	}

}

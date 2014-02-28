package study.javafundamental.fourth;

public class Example04_03_02 {
	public void aMethod(){
		System.out.println("public 메서드 출력");
	}
	private void bMethod(){
		System.out.println("private 메서드 출력");	
	}
	public void cMethod(){
		bMethod();	
	}
}

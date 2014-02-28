package study.javafundamental.first;

public class Example01_02 {
	public static void main(String[] args){
		
		getDailySalary(200);
		getDailySalary(300);
		getDailySalary(400);
		
	}
	public static void getDailySalary(int monthlySalary){
		System.out.println(monthlySalary/20);
	}
}

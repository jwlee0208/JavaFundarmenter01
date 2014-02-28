package study.javafundamental.first;

public class Example01_03 {
	public static void main(String[] args){
		
		getDailySalary(100);
		getDailySalary(200);
		getDailySalary(300);
		
		getYearlySalary(100);
		getYearlySalary(200);
		getYearlySalary(300);
		
	}
	public static void getDailySalary(int monthlySalary){
		System.out.println(monthlySalary / 20);
	}
	public static void getYearlySalary(int monthlySalary){
		System.out.println(monthlySalary * 12);
	}
}

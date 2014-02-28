package study.javafundamental.first;

public class Example01_04 {
	public static void main(String[] args){
		
		int a_monthlySalary = 100;		
		getDailySalary(a_monthlySalary);
		getYearlySalary(a_monthlySalary);
		
		int b_monthlySalary = 200;
		getDailySalary(b_monthlySalary);
		getYearlySalary(b_monthlySalary);

		int c_monthlySalary = 300;
		getDailySalary(c_monthlySalary);
		getYearlySalary(c_monthlySalary);
		
	}
	public static void getDailySalary(int monthlySalary){
		System.out.println(monthlySalary / 20);
	}
	public static void getYearlySalary(int monthlySalary){
		System.out.println(monthlySalary * 12);
	}
}

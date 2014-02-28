package study.javafundamental.first;

public class Example01_05_01 {
	public static void main(String[] args){
		
		Example01_05_02 a_calculater = new Example01_05_02();
		a_calculater.setMonthlySalary(100);
		a_calculater.getDailySalary();
		a_calculater.getYearlySalary();
		
		Example01_05_02 b_calculater = new Example01_05_02();
		b_calculater.setMonthlySalary(200);
		b_calculater.getDailySalary();
		b_calculater.getYearlySalary();

		
		Example01_05_02 c_calculater = new Example01_05_02();		
		c_calculater.setMonthlySalary(300);
		c_calculater.getDailySalary();
		c_calculater.getYearlySalary();		
	}
}

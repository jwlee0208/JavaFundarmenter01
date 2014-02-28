package study.javafundamental.second;


public class Example02_01_01 {
	public static void main(String[] args){
		
		Example02_01_02 a_calculater = new Example02_01_02();
		a_calculater.setMonthlySalary(90);
		a_calculater.getDailySalary();
		a_calculater.getYearlySalary();

		
		Example02_01_02 b_calculater = new Example02_01_02();
		b_calculater.setMonthlySalary(190);
		b_calculater.getDailySalary();
		b_calculater.getYearlySalary();

		
		Example02_01_02 c_calculater = new Example02_01_02();		
		c_calculater.setMonthlySalary(290);
		c_calculater.getDailySalary();
		c_calculater.getYearlySalary();		
	}

}

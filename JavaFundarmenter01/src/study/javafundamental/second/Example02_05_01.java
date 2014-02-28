package study.javafundamental.second;


public class Example02_05_01 {
	public static void main(String[] args){
		
		Example02_05_03 a_calculater = new Example02_05_03();
		a_calculater.setMonthlySalary(90);
		a_calculater.getDailySalary();
		a_calculater.getYearlySalary();
		a_calculater.getSalaryPerHour();
		
		Example02_05_03 b_calculater = new Example02_05_03();
		b_calculater.setMonthlySalary(190);
		b_calculater.getDailySalary();
		b_calculater.getYearlySalary();
		b_calculater.getSalaryPerHour();

		
		Example02_05_03 c_calculater = new Example02_05_03();
		c_calculater.setMonthlySalary(290);
		c_calculater.getDailySalary();
		c_calculater.getYearlySalary();
		c_calculater.getSalaryPerHour();
	}

}

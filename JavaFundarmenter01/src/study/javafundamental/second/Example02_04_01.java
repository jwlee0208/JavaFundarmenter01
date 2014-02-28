package study.javafundamental.second;


public class Example02_04_01 {
	public static void main(String[] args){
		
		Example02_04_02 a_calculater = new Example02_04_02(90);
		a_calculater.getDailySalary();
		a_calculater.getYearlySalary();

		
		Example02_04_02 b_calculater = new Example02_04_02(190);
		b_calculater.getDailySalary();
		b_calculater.getYearlySalary();

		
		Example02_04_02 c_calculater = new Example02_04_02(290);		
		c_calculater.getDailySalary();
		c_calculater.getYearlySalary();		
	}

}

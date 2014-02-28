package study.javafundamental.second;

public class Example02_02_01 {
	public static void main(String[] args){
		
		Example02_02_02 a_calculater = new Example02_02_02();
		a_calculater.getDailySalary(90);
		a_calculater.getYearlySalary(90);

		
		Example02_02_02 b_calculater = new Example02_02_02();
		b_calculater.getDailySalary(190);
		b_calculater.getYearlySalary(190);

		
		Example02_02_02 c_calculater = new Example02_02_02();		
		c_calculater.getDailySalary(290);
		c_calculater.getYearlySalary(290);		
	}
}

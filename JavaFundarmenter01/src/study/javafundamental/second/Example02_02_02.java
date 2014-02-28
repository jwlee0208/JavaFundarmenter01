package study.javafundamental.second;

public class Example02_02_02 {
	
	static int mealMoney = 10;
	
	public void getDailySalary(int monthlySalary){
		System.out.println((monthlySalary + mealMoney) / 20);
	}
	public void getYearlySalary(int monthlySalary){
		System.out.println((monthlySalary + mealMoney) * 12);
	}
}

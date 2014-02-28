package study.javafundamental.second;

public class Example02_03_02 {
	static int mealMoney = 10;
	
	public static void getDailySalary(int monthlySalary){
		System.out.println((monthlySalary + mealMoney) / 20);
	}
	public static void getYearlySalary(int monthlySalary){
		System.out.println((monthlySalary + mealMoney) * 12);
	}

}

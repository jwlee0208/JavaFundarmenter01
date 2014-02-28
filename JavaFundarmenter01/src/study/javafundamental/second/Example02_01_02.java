package study.javafundamental.second;

public class Example02_01_02 {
	
	int monthlySalary;
	static int mealMoney = 10;
	
	public void setMonthlySalary(int inputMonthlySalary){
		this.monthlySalary = inputMonthlySalary;
	}
	public void getDailySalary(){
		System.out.println((monthlySalary + mealMoney) / 20);
	}
	public void getYearlySalary(){
		System.out.println((monthlySalary + mealMoney) * 12);
	}
}

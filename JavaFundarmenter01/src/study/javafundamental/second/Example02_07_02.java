package study.javafundamental.second;

public class Example02_07_02 {
	
	int monthlySalary;
	static int mealMoney = 10;
	
	public Example02_07_02() {
	}
	
	public Example02_07_02(int inputMonthlySalary) {
		this.monthlySalary = inputMonthlySalary;
	}
	
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

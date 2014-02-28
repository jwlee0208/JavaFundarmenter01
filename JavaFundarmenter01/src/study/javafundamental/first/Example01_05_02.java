package study.javafundamental.first;

public class Example01_05_02 {
	
	int monthlySalary;
	
	public void setMonthlySalary(int inputMonthlySalary){
		this.monthlySalary = inputMonthlySalary;
	}
	public void getDailySalary(){
		System.out.println(monthlySalary / 20);
	}
	public void getYearlySalary(){
		System.out.println(monthlySalary * 12);
	}
}

package study.javafundamental.second;

public class Example02_07_03 extends Example02_07_02{

//	public Example02_07_03(int monthlySalary){
//		this.monthlySalary = monthlySalary;
//	}
	
	public Example02_07_03(int monthlySalary){
		super(monthlySalary);
	}
	
	public void getSalaryPerHour(){
		System.out.println(((double)this.monthlySalary/20)/9);
	}
	
	public void getDailySalary(){
		System.out.println("일 급여는 " + (monthlySalary + mealMoney) / 20 + "원 입니다.");
	}
}

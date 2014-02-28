package study.javafundamental.fourth;

public class Example04_02_01 {
	public static void main(String[] args){
		Example04_02_03 pizza = new Example04_02_03();
		pizza.makePizza();
		pizza.makePizza("bulkoki");
		pizza.makePizza("bulkoki", "vegetable");
		pizza.makePizza("beef", "pepper", "fineapple");
	}
}

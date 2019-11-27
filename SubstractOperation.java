package Ï°Ìâ2_0;

public class SubstractOperation extends BinaryOperation_3_2 {	
	public SubstractOperation() {	
		generateBinaryOperation('-');		
	}	
	boolean checkingCalculation(int anInteger){
		return anInteger >= LOWER;
	}
	int calculate(int left, int right){
		return left-right;
	}		
}
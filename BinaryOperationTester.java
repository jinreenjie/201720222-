package ϰ��2_0;

public class BinaryOperationTester {
	public static void main(String[] args) {
		// ���һ��ֻ��һ���࣬��ƶ�������������
		BinaryOperation_3_2 bop;
        System.out.println("test1:constructor('+')");   
        for (int i=0; i<10; i++){
        	bop = new AdditionOperation();
        	System.out.println(bop);
        }
        System.out.println("test1:constructor('-')");   
        for (int i=0; i<10; i++){
        	bop = new SubstractOperation();
        	System.out.println(bop);
        }
	}

}

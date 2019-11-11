package 软件构造;

public class math1 {
	public static void main(String[] args) {
		short[] x=new short[101]; 
		short[] y=new short[101];
		short[] ov=new short[50];    //运算符
		Header();                    //简单说明本程序的作用和使用
		math2.Exercise(x,y,ov);            //生成算式
		math3.Calculations(x,y,ov);        //生成答案
	}
	public static void Header() {
		System.out.println("输出50道100以内的加减法算术题");
		System.out.println("运行程序附上50道题的习题答案");
		System.out.println("---------------------");
	}
}
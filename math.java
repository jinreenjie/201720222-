package 软件构造;

import java.util.Random;

public class math {
	public static void main(String[] args) {
		short[] x=new short[101]; 
		short[] y=new short[101];
		short[] ov=new short[50];    //运算符
		Header();                    //简单说明本程序的作用和使用
		Exercise(x,y,ov);            //生成算式
		Calculations(x,y,ov);        //生成答案
	}
	//程序的作用和使用
	public static void Header() {
		System.out.println("输出50道100以内的加减法算术题");
		System.out.println("运行程序附上50道题的习题答案");
		System.out.println("---------------------");
	}
	//生成算式
	public static void Exercise(short[] x,short[] y,short[] ov) {
		char o='+';
		Random random=new Random();
		for(int i=0;i<50;i++) {
			ov[i]=(short)random.nextInt(2);
			if((ov[i])==1) {
				while(true){
					short n=(short)random.nextInt(101);
					short m=(short)random.nextInt(101);
					if(n+m<=100) {
						x[i]=n;
						y[i]=m;
						break;    //判断和不能超过一百
					}	
				}
				o='+';
			}
			else {
				while(true){
					short m=(short)random.nextInt(101);
					short n=(short)random.nextInt(101);
					if(m-n>0) {
						x[i]=m;
						y[i]=n;
						break;   //判断差不能小于零
					}	
				}
				o='-';
			}
			for(int a=0;a<49;a++) {
				for(int b=a+1;b<50;b++) {
					if(x[a]==x[b]&&y[a]==y[b]&&ov[a]==ov[b]||ov[a]==1&&x[a]==y[b]&&y[a]==x[b]) {
						x[a]=(short)random.nextInt(101);
						y[a]=(short)random.nextInt(101);
						ov[a]=(short)random.nextInt(2);
						a=0;
						break;
					}
				}	
			}      //判断重复
			System.out.print("("+(i+1)+")"+":  "+x[i]+o+y[i]+"="+"\t");
			if((i+1)%5==0)
				System.out.println();
		}
	}
	
	//生成答案
	public static void Calculations(short[] x,short[] y,short[] ov) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<50;i++) {
			if(ov[i]==1) {
				int answer=x[i]+y[i];
				System.out.print("("+(i+1)+")"+":   "+answer+"\t");
				if((i+1)%5==0) {
					System.out.println();
				}		
			}
			else {
				int answer=x[i]-y[i];
				System.out.print("("+(i+1)+")"+":   "+answer+"\t");
				if((i+1)%5==0) {
					System.out.println();
				}	
			}
		}
	}
}


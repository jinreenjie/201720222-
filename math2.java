package �������;

import java.util.Random;
class math2{
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
						break;    //�жϺͲ��ܳ���һ��
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
						break;   //�жϲ��С����
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
			}      //�ж��ظ�
			System.out.print("("+(i+1)+")"+":  "+x[i]+o+y[i]+"="+"\t");
			if((i+1)%5==0)
				System.out.println();
		}
	}
}
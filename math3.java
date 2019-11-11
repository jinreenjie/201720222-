package Èí¼þ¹¹Ôì;

class math3{
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
package �������;

public class math1 {
	public static void main(String[] args) {
		short[] x=new short[101]; 
		short[] y=new short[101];
		short[] ov=new short[50];    //�����
		Header();                    //��˵������������ú�ʹ��
		math2.Exercise(x,y,ov);            //������ʽ
		math3.Calculations(x,y,ov);        //���ɴ�
	}
	public static void Header() {
		System.out.println("���50��100���ڵļӼ���������");
		System.out.println("���г�����50�����ϰ���");
		System.out.println("---------------------");
	}
}
package day171106;

//water_melon�Լ��� ���� n�� �Ű������� �Է¹޽��ϴ�.
//���̰� n�̰�, ���ڼ��ڼ�...�� ���� ������ �����ϴ� ���ڿ��� �����ϵ��� �Լ��� �ϼ��ϼ���.
//
//������� n�� 4�̸� '���ڼ���'�� �����ϰ� 3�̶�� '���ڼ�'�� �����ϸ� �˴ϴ�.

public class WaterMelon{
	public String watermelon(int num) {	
		String str = "";
		for (int i=0; i<num;i++) {
			str += (i %2 == 0)? "��" : "��";
		}
	
/*	String str ="";
	for (int i=0; i<num; i++) {
		if (i%2==0) {
			str = str + "��";
		}else {
			str = str + "��";
		}
	}*/
		
	return str;
}
	
	
	
	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ��� : " + wm.watermelon(3));
		System.out.println("n�� 4�� ��� : " + wm.watermelon(4));
	}

}

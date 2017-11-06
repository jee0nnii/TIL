package day171106;

//water_melon함수는 정수 n을 매개변수로 입력받습니다.
//길이가 n이고, 수박수박수...와 같은 패턴을 유지하는 문자열을 리턴하도록 함수를 완성하세요.
//
//예를들어 n이 4이면 '수박수박'을 리턴하고 3이라면 '수박수'를 리턴하면 됩니다.

public class WaterMelon{
	public String watermelon(int num) {	
		String str = "";
		for (int i=0; i<num;i++) {
			str += (i %2 == 0)? "수" : "박";
		}
	
/*	String str ="";
	for (int i=0; i<num; i++) {
		if (i%2==0) {
			str = str + "수";
		}else {
			str = str + "박";
		}
	}*/
		
	return str;
}
	
	
	
	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우 : " + wm.watermelon(3));
		System.out.println("n이 4인 경우 : " + wm.watermelon(4));
	}

}

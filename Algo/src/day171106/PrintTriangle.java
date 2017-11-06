package day171106;

//printTriangle 메소드는 양의 정수 num을 매개변수로 입력받습니다.

//다음을 참고해 *(별)로 높이가 num인 삼각형을 문자열로 리턴하는 printTriangle 메소드를 완성하세요
//printTriangle이 return하는 String은 개행문자('\n')로 끝나야 합니다.

public class PrintTriangle {
	public String printTriangle(int num) {
		// 1.
		 String tri = "";
		 for (int i = 0; i < num; i++) {
		 for (int stars = 0; stars < i + 1; stars++) {
		 tri += "*";
		 }
		 tri += "\n";
		 }
		 return tri;

		// 2.
		// String result = "";
		// String stars ="*";
		// for (int i =0;i<num;i++) {
		// result += stars+"\n";
		// stars += "*";
		// }
		// return result;

		// 3.
		// StringBuilder sb = new StringBuilder();
		// for (int i = 0; i < num; i++) {
		// for (int stars = 0; stars < i + 1; stars++) {
		// sb.append("*");
		// }
		// sb.append("\n");
		// }
		// return sb.toString();
	}

	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println(pt.printTriangle(7));
	}

}

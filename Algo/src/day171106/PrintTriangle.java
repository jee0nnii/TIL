package day171106;

//printTriangle �޼ҵ�� ���� ���� num�� �Ű������� �Է¹޽��ϴ�.

//������ ������ *(��)�� ���̰� num�� �ﰢ���� ���ڿ��� �����ϴ� printTriangle �޼ҵ带 �ϼ��ϼ���
//printTriangle�� return�ϴ� String�� ���๮��('\n')�� ������ �մϴ�.

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

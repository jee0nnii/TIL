package day171106;
//�Լ��� �ϼ��ؼ� �Ű����� list�� ��հ��� return�ϵ��� ����� ������.
//��� ũ���� list�� �͵� ��հ��� ���� �� �־�� �մϴ�.
public class GetMean {
    public int getMean(int[] array) {
      int sum = 0;
      for(int i=0; i<array.length; i++){
        sum += array[i];
      }
      // for(int i : array){
      //   sum += i;
      // }
      int avg = sum/array.length;
      return avg;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}

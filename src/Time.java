import java.util.Scanner;
public class Time {
	public static void main(String[] args) {
		int s1, s2, m, h, d, y;
		System.out.printf("������ �ʸ� �Է��ϼ���.\n");
		Scanner input =  new Scanner(System.in);
		int time=input.nextInt();
		s1=100000;
		m=s1/60;//�ʸ� 60���� ������ ��
		h=m/60;//���� 60���� ������ �ð�
		d=h/24;// �ð��� 24�� ������ �Ϸ�
		y=60*60*24*365;// 1���� ��
		s2=100000%time;
		System.out.printf("100000�ʴ� %d�Դϴ�.\n",m);
		System.out.printf("100000�ʴ� %d�Դϴ�.\n",h);
		System.out.printf("100000�ʴ� %d�Դϴ�.\n",d);
		System.out.printf("100000���� %d�ʴ� �������� %d�Դϴ�.\n",time, s2);
		if(s1<y) {
			System.out.printf("100000�ʴ� 1�⺸�� �۽��ϴ�.\n");
		}
		else {
			System.out.printf("100000�ʴ� 1�⺸�� Ů�ϴ�.\n");
		}
	}

}

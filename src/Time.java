import java.util.Scanner;
public class Time {
	public static void main(String[] args) {
		int s1, s2, m, h, d, y;
		System.out.printf("나누실 초를 입력하세요.\n");
		Scanner input =  new Scanner(System.in);
		int time=input.nextInt();
		s1=100000;
		m=s1/60;//초를 60으로 나누면 분
		h=m/60;//분을 60으로 나누면 시각
		d=h/24;// 시각을 24로 나누면 하루
		y=60*60*24*365;// 1년의 초
		s2=100000%time;
		System.out.printf("100000초는 %d입니다.\n",m);
		System.out.printf("100000초는 %d입니다.\n",h);
		System.out.printf("100000초는 %d입니다.\n",d);
		System.out.printf("100000초의 %d초당 나머지는 %d입니다.\n",time, s2);
		if(s1<y) {
			System.out.printf("100000초는 1년보다 작습니다.\n");
		}
		else {
			System.out.printf("100000초는 1년보다 큽니다.\n");
		}
	}

}

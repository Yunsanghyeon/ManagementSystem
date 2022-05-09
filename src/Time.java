import java.util.Scanner;
public class Time {
	public static void main(String[] args) {
		int s1, s2, m, h, d, y;
		s1=100000;
		m=60; //1분은 60초 나누면 분
		h=3600;//60분은 1시간
		d=3600*24;//24시는 하루
		y=60*60*24*365;// 1년의 초
		s2=s1%d%h%m;//일과 시간 분을 나타낸 후의 나머지 초
		System.out.printf("100000초는 %d일, %d시, %d분, %d초입니다.\n", s1/d, s1%d/h, 
				s1%d%h/m,s2);
		/*100000초를 하루의 초로 나누면 몇일인지 알 수 있다. 그리고 하루를 나눈 나머지 초를 1시간의 초로 나누면 
		그 시각을 알수 있다. 이러한 방식을 반복해 시간이 얼마 남는지 계산한다.*/
		if(s1<y){
			System.out.printf("100000초는 1년보다 작습니다.\n");
		}
		else {
			System.out.printf("100000초는 1년보다 큽니다.\n");
		}
	}

}

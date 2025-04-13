/*1. 아르바이트 급여 계산하기
1.1. 학습내용
if문, 연산자
1.2. 문제
근무 시간을 입력받아 급여를 계산하여 출력한다.
1.3. 조건
✓ 50시간까지의 급여는 10000원이다.
✓ 50시간을 초과한 금액에 대해서는 10%를 더 지급한다.
1.4. 실행결과
근무 시간 : 65
급여 : 665000*/
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        int t,n,w;
        w=10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("근무시간을 입력해주세요. : ");
        t=sc.nextInt();
        if(t>50){ //50시간보다 근무시간(t)가 클때 n=(int)(50*w+(t-50)*w*1.1) 변수n에 int형변환 (50*w곱함 +(t-50 50시간뺌)*w*1.1 뺀 50시간과 w*1.1 10퍼 추가된 시급 곱함 )
            System.out.printf("근무시간: %d 시간"+ "급여는: %d 원 입니다.",t,n=(int)(50*w+(t-50)*w*1.1));
        }
        else{
            System.out.printf("근무시간: %d 시간"+ "급여는: %d 원 입니다.",t ,w*=t);
        }
    }
}

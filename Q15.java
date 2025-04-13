/*
15.1. 학습내용
while문
15.2. 문제
1부터 연속된 정수의 합계를 계산하고, 그 합계가 4000이 넘어가는 순간의 수를 구하시오.
15.3. 실행결과
1 ~ 89까지의 합계 : 4005
*/
public class Q15 {
    public static void main(String[] args){
        int a=0,sum=0;
        while (sum<4000){
            ++a;
            sum+=a;
        }
        System.out.print("1부터"+a+"까지의 합계는?:"+sum);
    }
}

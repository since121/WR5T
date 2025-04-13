/*12. 4의 배수이면서 5의 배수인 값 찾기
12.1. 학습내용
for문, if문, 논리연산자
12.2. 문제
100 이하의 자연수 중에서 4의 배수이면서 5의 배수인 값을 모두 출력하시오.
12.3. 실행결과
20 40 60 80 100*/
public class Q12 {
    public static void main(String[] args){
        int a;
        for(a=1; a<=100; a++){
            if(a%4==0 && a%5==0){
                System.out.print(a+" ");
            }
            else {
                System.out.print("");
            }
        }
    }
}

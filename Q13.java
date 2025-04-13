/*13. 7 또는 9의 배수인 값 찾기
13.1. 학습내용
for문, if문, 논리연산자
13.2. 문제
100 이하의 자연수 중에서 7 또는 9의 배수인 값을 모두 출력하시오.
13.3. 실행결과
7 9 14 18 21 27 28 35 36 42 45 49 54 56 63 70 72 77 81 84 90 91 98 99*/
public class Q13 {
    public static void main(String[] args){
        int a;
        for(a=1; a<=100; a++){
            if(a%7==0 || a%9==0){
                System.out.print(a+" ");
            }
            else {
                System.out.print("");
            }
        }
    }
}

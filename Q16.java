import java.util.Scanner;
/*16. 팩토리얼 구하기
16.1. 학습내용
for문, 자료형
16.2. 문제
정수를 입력받아 그 수의 팩토리얼을 구하시오.
16.3. Hint
팩토리얼(factorial)이란 1부터 n까지의 모든 정수를 곱한 것을 말한다.
16.4. 실행결과
정수를 입력하세요 : 20
20! = 2432902008176640000*/
public class Q16 {
    public static void main(String[] args) {
        long a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를입력하세요:");
        b= sc.nextInt();
        a=1;
        for(c=1; c<=b; c++){
         a*=c;

        }
        System.out.println(a);
    }
}

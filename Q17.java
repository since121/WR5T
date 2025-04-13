import java.util.Scanner;
/*17. 3의 배수의 개수 구하기
17.1. 학습내용
for문, if문, 연산자
17.2. 문제
정수를 10번 반복 입력받아 그 중에서 3의 배수의 개수를 구한다.
17.3. 실행결과
정수 입력 : 5
정수 입력 : 90
정수 입력 : 45
정수 입력 : 68
정수 입력 : 44
정수 입력 : 36
정수 입력 : 75
정수 입력 : 11
정수 입력 : 55
정수 입력 : 97
3의 배수 개수 : 4*/
public class Q17 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=0;
        for(c=1; c<=10; c++){
            System.out.printf("%d번째 정수를 입력하세요:",a);
            b= sc.nextInt();
            if(b%3==0){
                a+=1;
            }
        }
        System.out.println("3의배수의 갯수는:"+a);
    }
}

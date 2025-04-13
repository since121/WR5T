import java.util.Scanner;
/*6.1. 학습내용
for문
6.2. 문제
단을 입력받아 구구단을 출력한다.
6.3. 실행결과
단 입력 : 5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45*/

public class Q6 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("단 입력 :");
        a=sc.nextInt();
        for (int b=1; b<=9; b++){
            int c=a*b;
            System.out.println(a+"*"+b+"="+c);


        }
    }
}

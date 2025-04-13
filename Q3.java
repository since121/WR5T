/*3.1. 학습내용
if문, switch문, 연산자
3.2. 문제
키보드로부터 연산자와 정수 2개를 입력받아 계산하여 결과를 출력한다.
3.3. 조건
연산자를 먼저 입력받고, 그 후에 정수 2개를 입력받는다.
연산자는 +, -, *, / 4개의 산술연산자 중의 하나를 입력받는다.
그 외의 연산자를 입력하거나 0으로 나누기를 하는 경우는 오류 메시지를 출력하고 프로그램을
종료한다.
3.4. 실행결과
예1)
연산자 (+,-,*,/) : *
첫번째 정수 : 10
두번째 정수 : 3
10*3 = 30
예2)
연산자 (+,-,*,/) : =
첫번째 정수 : 10
두번째 정수 : 5
연산자를 잘못 입력했습니다.
예3)
연산자 (+,-,*,/) : /
첫번째 정수 : 10
두번째 정수 : 0
0으로 나눌 수 없습니다.*/
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자(+,-,*,/)를 입력 해 주세요: ");
        String operator = sc.next();
        System.out.print("첫 번째 정수를 입력 해 주세요: ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력 해 주세요: ");
        int b = sc.nextInt();
        System.out.println("연산자: " + operator);
        System.out.println("첫 번째 정수: " + a);
        System.out.println("두 번째 정수: " + b);
        switch (operator) {
            case "+" -> System.out.println(a + " + " + b + " = " + (a + b));
            case "-" -> System.out.println(a + " - " + b + " = " + (a - b));
            case "*" -> System.out.println(a + " * " + b + " = " + (a * b));
            case "/" -> {
                if (a==0 || b==0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
            }
            default -> System.out.println("연산자를 잘못 입력하셨습니다.");
        }
    }
}

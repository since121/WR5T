/*18.1. 학습내용
for문
18.2. 문제
for문을 이용하여 Fibonacci 수열을 10개 출력하시오.
18.3. Hint
피보나치 수열이란 처음 두 항을 1과 1로 한 후, 그 다음 항부터는 바로 앞의 두 개의 항을 더
해 만드는 수열을 말한다.
18.4. 실행결과
1 1 2 3 5 8 13 21 34 55
* */
public class Q18 {
    public static void main(String[] args) {
        int a,b,c;
        a=1;b=1;
        System.out.print(a+" "+b+" ");
        for(int d=1; d<9; d++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
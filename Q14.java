/*14. 100의 약수 찾기
14.1. 학습내용
for문, if문, 산술/논리연산자
14.2. 문제
자연수 중에서 100의 약수를 모두 찾아 1줄에 3개씩 출력하시오.
14.3. Hint
약수란 어떤 수를 나누어 떨어지게 하는 수이다.
1은 모든 수의 약수이고, 어떤 수는 자기 자신의 약수이다.
0으로는 나눌 수 없다.
14.4. 실행결과
1 2 4
5 10 20
25 50 100*/
public class Q14 {
    public static void main(String[] args) {
        int a,b,c;
        c=0;
        b=100;
        for(a=1; a<=100; a++){
            if(b%a==0){
                System.out.print(a+" ");
                c++;
                if(c%3==0) {
                    System.out.println();
                }
            }
        }
    }
}

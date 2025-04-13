/*10.1. 학습내용
for문, if문, 연산자
10.2. 문제
1 ~ 30의 자연수 중에서, for문을 이용하여 아래 실행결과와 같이 출력한다.
10.3. Hint
출력된 결과에서 건너뛴 숫자들의 규칙을 생각해본다.
10.4. 실행결과
1 2 4 5 7 8 10 11 13 14 16 17 19 20 22 23 25 26 28 29*/
public class Q10 {
    public static void main(String[] args){
        int a;
        for(a=1; a<=30; a++){
            if(a%3==0){
            System.out.print("");
            }
            else {
                System.out.print(a+" ");
            }
        }
    }
}

/*11. 4의 배수이면서 5의 배수가 아닌 값 찾기
11.1. 학습내용
for문, if문, 논리연산자
11.2. 문제
100 이하의 자연수 중에서 4의 배수이면서 5의 배수가 아닌 값을 모두 출력한다.
11.3. 실행결과
4 8 12 16 24 28 32 36 44 48 52 56 64 68 72 76 84 88 92 96*/
public class Q11 {
    public static void main(String[] args){
        int a;
        for(a=1; a<=100; a++){
            if(a%4==0 && a%5!=0){
                System.out.print(a+" ");
            }
            else {
                System.out.print("");
            }
        }
    }
}

/*19.1. 학습내용
2중 반복문, if문, 연산자
19.2. 문제
2이상의 정수 중에서 순차적으로 소수를 25개 찾아서 한 줄에 5개씩 출력한다.
19.3. Hint
소수란 1과 자기 자신으로만 나누어 떨어지는, 1보다 큰 정수이다.
19.4. 실행결과
2 3 5 7 11
13 17 19 23 29
31 37 41 43 47
53 59 61 67 71
73 79 83 89 97 */
public class Q19 {
    public static void main(String[] args) {
        int a,b,c,c2;
        c2=0;// 5번끊어줄변수
        for(a=2; a<=100; a++){ //2부터 순차적으로 100번돌림
            c=0;//소수가 2개일경우 값저장용 변수
            for(b=1; b<=a; b++){//초기값일때 a는 2 b는1이니까 두번돌림
                if(a%b==0){ //위처럼 2나머지 1이 0일때 2나머지2가 0일때 카운트 1추가 2는 1이랑2로 나눠지니 소수c+1
                    c++; //b가 1부터 3까지 올라가면 a가 3일때 b가 1,2,3 계산 3은 1로 나눠지고 자기자신으로 나눠지니 소수c+1
                } //4는 1과 2로나눠지고 3은안되고 4로 나눠지니 c값이 +3이되면서 아래 if문이 거짓으로 실행이 안됨
            }
            if(c==2){ //c가 2일때 실행
                System.out.print(a+" ");
                c2++;
                if(c2%5==0){ //c2변수안 정수가 5 모였을때 실행
                    System.out.println();
                }
            }
        }
    }
}
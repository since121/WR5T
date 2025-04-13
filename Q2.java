/*BMI(체질량지수)는 몸무게를 키(미터단위)의 제곱으로 나누어서 계산한다.
✓ 이 계산 결과에 따라 다음과 같이 판단된다.
- 저체중 : 18.5 미만
- 정상 : 18.5 이상, 23 미만
- 과체중 : 23 이상, 25 미만
- 비만 : 25 이상*/
//키 (Cm) : 170
//몸무게 (Kg) : 60
//BMI 지수 : 20.761245674740486 (정상)
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        double cm,kg,bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("키를 입력 해 주세요:");
        cm=sc.nextInt();
        System.out.println("몸무게를 입력 해 주세요:");
        kg=sc.nextInt();
        cm*=0.01;
        bmi=kg/(cm*2);
        cm*=100;
        if(bmi>=25){
            System.out.print("키 (Cm) :"+cm+"\n"+"몸무게 (Kg) :"+kg+"\n"+"BMI 지수 :"+bmi+"(비만)");
        }
        else if (bmi>=23 && bmi<25) {
            System.out.print("키 (Cm) :"+cm+"\n"+"몸무게 (Kg) :"+kg+"\n"+"BMI 지수 :"+bmi+"(과체중)");
        }
        else if (bmi>=18.5 && bmi<23) {
            System.out.print("키 (Cm) :"+cm+"\n"+"몸무게 (Kg) :"+kg+"\n"+"BMI 지수 :"+bmi+"(정상)");
        }
        else if (bmi<=18.5) {
            System.out.print("키 (Cm) :"+cm+"\n"+"몸무게 (Kg) :"+kg+"\n"+"BMI 지수 :"+bmi+"(저체중)");
        }
        else{System.out.println("입력값이 잘못 되었습니다.");}
    }
}

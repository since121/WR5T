/*
        *
        **
        ***
        ****
        *****

        *****
        ****
        ***
        **
        *
*/

public class Q5 {
    public static void main(String[] args){

        int a,b,c;
        c=5;
        for (a=1; a<=c; a++){
            for(b=5; b>=a; b--){
                System.out.print(" ");
            }
            for(b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (a=1; a<=c; a++) {
            for(b=1; b<=a; b++){
                System.out.print(" ");
            }
            for(b=5; b>=a; b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

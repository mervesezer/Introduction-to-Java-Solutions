import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" a b c d e f değerlerini giriniz:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        LinearEquation le = new LinearEquation(a,b,c,d,e,f);

        System.out.printf("x değeri:%d \n y değeri:%d\n",le.getX(),le.getY());
        le.isSolvable();


    }
}

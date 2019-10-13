import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen 3 tane sayı giriniz:");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        if (qe.getDiscriminant() > 0)
            System.out.printf("Root 1:%.2f\nRoot 2:%.2f\n\n", qe.getRoot1(), qe.getRoot2());
        else if (qe.getDiscriminant() < 0)
            System.out.println("kök yoktur!!!");
        else
            System.out.println("tek kök vardır kökümüz :" + qe.getRoot1());
    }
}

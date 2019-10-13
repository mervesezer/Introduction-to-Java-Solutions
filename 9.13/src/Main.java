import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("satır ve sütun sayılarını giriniz:");

        int row = scan.nextInt();
        int column = scan.nextInt();

        double [][] dizi = new double[row][column];

        for (int i = 0; i <dizi.length; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {

                dizi[i][j]=scan.nextDouble();

            }
        }

        Location location = Location.locationLargest(dizi);

        System.out.printf("en büyük eleman:%.1f\n elemanın bulunduğu satır:%d\telemanın bulunduğu sütun:%d"
                ,location.maxValue,location.row,location.column);


    }
}

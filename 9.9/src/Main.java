public class Main {

    public static void main(String[] args) {
        RegularPolygon rp = new RegularPolygon(6, 4);

        RegularPolygon rp2 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("poligon 1:\nperimeter:%.2f\narea:%.2f\n\n", rp.getPerimeter(), rp.getArea());
        System.out.printf("poligon 2:\nperimeter:%.2f\narea:%.2f\n", rp2.getPerimeter(), rp2.getArea());


    }
}

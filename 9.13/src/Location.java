public class Location {

    public int row;
    public int column;
    public double maxValue;

    public static Location locationLargest(double[][] a) {
        int row = 0;
        int column = 0;

        double maximum = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maximum < a[i][j]) {
                    maximum = a[i][j];
                    row = i;
                    column = j;

                }
            }
        }

        Location location = new Location();

        location.maxValue = maximum;
        location.column=column;
        location.row=row;

        return location;
    }

}

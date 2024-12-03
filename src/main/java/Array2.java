import java.util.Scanner;

public class Array2 {

    public void multiDimension(){
        Scanner sc = new Scanner(System.in);
        // 2D arrays

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] == x) {
                    System.out.println(i + "," + j);
                }
            }


        }

    }

}

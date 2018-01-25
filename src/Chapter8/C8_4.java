package Chapter8;

/**
 * Finds out how many hours an employee had worked over a week
 *
 * @author Jordan Iwuchukwu
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    // constant values
    static final int Employee = 0;
    static final int Hours = 1;
//main method

    public static void main(String[] args) {
        //table and varibles
        int sum = 0;
        int[][] employeeHours = new int[][]{
            {2, 4, 3, 4, 5, 8, 8, 0, 0},
            {7, 3, 4, 3, 3, 4, 4, 0, 1},
            {3, 3, 4, 3, 3, 2, 2, 0, 2},
            {9, 3, 4, 7, 3, 4, 1, 0, 3},
            {3, 5, 4, 3, 6, 3, 8, 0, 4},
            {3, 4, 4, 6, 3, 4, 4, 0, 5},
            {3, 7, 4, 8, 3, 8, 4, 0, 6},
            {6, 3, 5, 9, 2, 7, 9, 0, 7}};

        // print out the entire table organized
        System.out.println("\n          Su  M  T  W Th  F Sa Total");
        for (int x = 0; x < 8; x++) {
            sum = 0;
            System.out.printf("%nEmployee" + employeeHours[x][8]);
            for (int y = 0; y < 7; y++) {
                System.out.printf("%3d", employeeHours[x][y]);
                sum += employeeHours[x][y];
            }
            System.out.printf("%4d", sum);
            employeeHours[x][7] = sum;
        }
        System.out.println();

        // sort the table
        //int employeecash[]= {34, 28, 20, 31, 32, 28, 37, 41} ;
        employeecash(employeeHours);

        //print out the employees in order
        for (int x = 0; x < employeeHours.length; x++) {
            System.out.println("employee " + employeeHours[x][8] + ": " + employeeHours[x][7]);
        }

    }

    /**
     *
     * @param table sorts the table by the amount of money earned.
     */
    //method to get the table sorted
    public static void employeecash(int[][] table) {
        int[][] temp = new int[table.length][table[0].length];
        java.util.Arrays.sort(table, java.util.Comparator.comparingInt(a -> a[7]));
        for (int x = 0; x < table.length; x++) {
            System.arraycopy(table[x], 0, temp[7 - x], 0, table[0].length);
        }
        System.arraycopy(temp, 0, table, 0, temp.length);
    }
}

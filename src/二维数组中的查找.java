import java.util.Scanner;

public class 二维数组中的查找 {

    private static int[][] array;

    private static void read_data() {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        col = scanner.nextInt();

        array = new int[row][col];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static boolean Find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int i = 0, j = array[0].length-1;
        while(true){
            if( i < 0 | i >= array.length | j < 0 | j >= array[0].length){
                return false;
            }
            if(array[i][j] < target){
                ++i;
            }
            else if(array[i][j] == target){
                return true;
            }
            else if(array[i][j] > target){
                j--;
            }
        }
    }

    public static void main(String[] args) {
        read_data();
        System.out.println(Find(17, array));
    }
}

/**
 * 4 4
 * 1   2  3  4
 * 5   6  7  8
 * 9  10 11 12
 * 13 14 15 16
 **/
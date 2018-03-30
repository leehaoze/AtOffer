public class 矩阵中的路径 {
    static int[] move_x = {1, -1, 0, 0};
    static int[] move_y = {0, 0, -1, 1};

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] visit = new boolean[matrix.length];
        return dfs(matrix, rows, cols, str, visit, 0, 0, 0);
    }

    public static boolean dfs(char[] matrix, int rows, int cols, char[] str, boolean[] visit, int cur_x, int cur_y, int char_pos) {
        char cur_value = matrix[cur_x + cur_y * cols];

        if (cur_value == str[char_pos]) {
            if (char_pos == str.length - 1) {
                return true;
            }
        }
        for (int i = 0; i < 4; ++i) {
            int next_x, next_y;
            next_x = cur_x + move_x[i];
            next_y = cur_y + move_y[i];
            if (next_x < cols && next_x >= 0 && next_y < rows && next_y >= 0 && visit[next_x + next_y * cols] == false) {
                visit[next_x + next_y * cols] = true;
                if (cur_value == str[char_pos]) {
                    if (dfs(matrix, rows, cols, str, visit, next_x, next_y, char_pos + 1)) {
                        return true;
                    }
                }
                else{
                    if (dfs(matrix, rows, cols, str, visit, next_x, next_y, char_pos)) {
                        return true;
                    }
                }
                visit[next_x + next_y * cols] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char[] matrix = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        System.out.println(hasPath(matrix, 3, 4, new char[]{'b', 'c', 'c', 'e', 'd'}));
        System.out.println(hasPath(matrix, 3, 4, new char[]{'a','b','c','b'}));
    }

}

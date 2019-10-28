public class Unit16 {
    public static void main(String[] args) {
        int n = Utils.scan("Введите чётное число - размер матрицы");
        if (n % 2 == 0) throw new RuntimeException("Размер матрицы не может быть нечётным");

        int[][] arr = new int[n][n];

        int row = n - 1;
        int col = n / 2;
        arr[row][col] = 1;

        for (int i = 2; i <= n * n; i++) {
            if (arr[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            } else {
                row = (row - 1 + n) % n;
                // don't change column
            }
            arr[row][col] = i;
        }
        Utils.printMatrix(arr);
    }
}

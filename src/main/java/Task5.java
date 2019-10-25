public class Task5 {
    public static void main(String[] args) {
        int matrixSize = Utils.scan("Введите чётное число");
        int[][] arr = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = i; j < matrixSize; j++) {
                arr[i][j - i] = i + 1;
            }
        }
        Utils.printMatrix(arr);
    }
}

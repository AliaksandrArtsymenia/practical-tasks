import java.util.Arrays;

public class Unit8 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк:");
        int b = Utils.scan("Введите количество столбцов:");
        int[][] arr = Utils.fillMatrixWithRandomInt(a, b);
        Utils.printMatrix(arr);
        int x = Utils.scan("Введите номера первого столбца");
        int y = Utils.scan("Введите номера второго столбца");

        int[] temp = new int[a];
        for (int i = 0; i < a; i++) {
            temp[i] = arr[i][x-1];
            arr[i][x-1] = arr[i][x];
            arr[i][x] = temp[i];
        }
        Utils.printMatrix(arr);
    }
}

public class Unit11 {
    private static int[][] fillSquareMatrixWithRandomInt() {
        int[][] arr = new int[10][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 16);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = fillSquareMatrixWithRandomInt();
        Utils.printMatrix(arr);

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Номер сторки = " + (i + 1) + "\nколичество совпадений = " + count);
            }
        }
    }
}

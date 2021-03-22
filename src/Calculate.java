public class Calculate {

    public static int[][] findElems (int size, int[][] array) {
        int line = 0;
        int column = 0;
        int[][] mas = new int[2][size];
        for (int i = 0, j = 0; i < array.length && j < array[i].length; i++, j++) {
            mas[line][column] = array[i][j];
            column++;
        }
        line++;
        column = 0;
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
            mas[line][column] = array[i][j];
            column++;
        }
        return mas;
    }
}

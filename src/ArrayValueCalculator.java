import myExeption.ArrayDataException;
import myExeption.ArraySizeException;

public class ArrayValueCalculator {


    public int doCalc(String[][] input) throws ArraySizeException, ArrayDataException {
        if (input.length != 4 || input[0].length != 4) {
            throw new ArraySizeException("Неправильный размер массива");
        }

        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                try {
                    int value = Integer.parseInt(input[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;

    }

}

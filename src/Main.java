import myExeption.ArrayDataException;
import myExeption.ArraySizeException;

public class Main {
    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        String[][] input = {
                {"1", "2", "3"},
                {"5", "6", "7", "8"},
                {"66", "10", "11", "12"},
                {"13", "14", "15", "ff"}
        };

        ArrayValueCalculator ArrayValueCalculator = new ArrayValueCalculator();
        System.out.println(ArrayValueCalculator.doCalc(input));
    }
}
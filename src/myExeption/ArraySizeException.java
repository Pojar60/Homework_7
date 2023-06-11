package myExeption;

//public class ArraySizeException extends Throwable {
//    public ArraySizeException(String неправильныйРазмерМассива) {
//    }
//}
public class ArraySizeException extends Exception {
    public ArraySizeException(String message) {
        super(message);
    }
}
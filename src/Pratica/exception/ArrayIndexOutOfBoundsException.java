package Pratica.exception;

public class ArrayIndexOutOfBoundsException extends RuntimeException {
    public ArrayIndexOutOfBoundsException (int num){
        super("il numero inserito: " + num + "sfora il limite dell'array");
    }
}

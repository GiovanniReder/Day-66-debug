package exceptions;

public class ArrayIndexOutOfBoundsException extends RuntimeException  {
    public ArrayIndexOutOfBoundsException (int num){
        super("Il numero" + num + "supera l'indice dell'array");
    }
}

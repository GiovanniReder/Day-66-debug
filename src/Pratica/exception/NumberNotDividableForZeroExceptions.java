package Pratica.exception;

public class NumberNotDividableForZeroExceptions extends RuntimeException{
    public NumberNotDividableForZeroExceptions(int num){
        super("Il numero di litri non può essere" + num );
    }
}

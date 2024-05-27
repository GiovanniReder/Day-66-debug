package Pratica.exception;

public class NumberOutOfTen extends RuntimeException {
    public NumberOutOfTen(int num){
        super("Il numero è superiore a 10");
    }

}

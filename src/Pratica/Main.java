package Pratica;

import Pratica.exception.NumberNotDividableForZeroExceptions;
import Pratica.exception.NumberOutOfTen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------ES1----------");
        int[] array= new int[5];
        Random nRand= new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i]= nRand.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
try {

          System.out.print("Inserisci un numero da 1 a 10: ");
          int userNumber = sc.nextInt();
          if (userNumber<1 || userNumber>10){
              System.out.println("Il numero non è superiore a 10");

          }
          System.out.println("Inserisci l'indice dell'array (1-4)  ");
          int indice = sc.nextInt();
           array[indice]=userNumber;


} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("il numero inserito sfora il limite dell'array");
    sc.close();
}
        System.out.println(Arrays.toString(array));
          sc.close();


 System.out.println("----------ES2----------");


}






      }











        /*
        System.out.println("------------ES2--------------");

        Scanner sc2= new Scanner(System.in);
        System.out.print("Quanti km hai percorso? ");
        int km= sc2.nextInt();
        System.out.print("Quanti litri hai consumato? ");
        int litri= sc2.nextInt();
        try{
            if (km==0 | litri==0){
                System.out.println("Errore nell'inserimento dei dati");

            }
          double  kmForliters= (double) km / litri;
            System.out.println(kmForliters);

        } catch(NumberNotDividableForZeroExceptions e){
            System.out.println(e.getMessage());
        }
        sc2.close();

         */





/* init array di 5 interi con valori casuali da 1 a 10
* utente inserisce un numero tramite scanner e lo inserisce in una posizione scelta dall'utente
* stampa il nuovo stato dell'array
*
*
*
*
*
* */
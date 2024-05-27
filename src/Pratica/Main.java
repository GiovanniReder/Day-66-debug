package Pratica;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random nRand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = nRand.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un numero da 1 a 10: ");
        int userNumber = sc.nextInt();
        if (userNumber < 1 | userNumber > 10) {
            System.out.println("Hai inserito un numero che non è compreso tra 1 e 10");
            userNumber = sc.nextInt();
        }

        System.out.println("Inserisci l'indice dell'array (1-4)  ");
        int indice = sc.nextInt();
        if (indice < 0 | indice > 4) {
            System.out.println("Hai inserito un numero che non è compreso tra 1 e 10");
            indice = sc.nextInt();
        }
        array[indice] = userNumber;
        System.out.println(Arrays.toString(array));
        sc.close();
    }}



/* init array di 5 interi con valori casuali da 1 a 10
* utente inserisce un numero tramite scanner e lo inserisce in una posizione scelta dall'utente
* stampa il nuovo stato dell'array
*
*
*
*
*
* */
package Gestore;
import java.util.Scanner;

public class Gestore {
    public static void main(String[] args) {
        Scanner continua = new Scanner(System.in);
        Scanner numeri = new Scanner(System.in);
        Scanner segno = new Scanner(System.in);
        double risultato = 0;
       
        Calcolatrice calcolatrice = new Calcolatrice();
        
        do
        {
            System.out.println("\nInserisci il primo numero: ");
            calcolatrice.setPrimoNumero(numeri.nextDouble());
            System.out.println("\nInserisci il segno dell'operazione: ");
            calcolatrice.setSegno(segno.nextLine());
            System.out.println("\nInserisci il secondo numero: ");
            calcolatrice.setSecondoNumero(numeri.nextDouble());
            risultato = calcolatrice.risultato();
            
            if(risultato == -1 && calcolatrice.getSegno().equals("/"))
                System.out.println("Il risultato dell'operazione e': impossibile" );
            else
                System.out.println("Il risultato dell'operazione e': " + risultato);
            
            System.out.println("\nSi vuole eseguire un ulteriore operazione? si|no\n");
        } while(continua.nextLine().equals("si"));
        
    }
}

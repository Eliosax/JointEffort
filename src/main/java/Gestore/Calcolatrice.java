
package Gestore;

public class Calcolatrice {
    protected double primoNumero;
    protected String segno;
    protected double secondoNumero;

    public Calcolatrice(int primoNumero, String segno, int secondoNumero) {
        this.primoNumero = primoNumero;
        this.segno = segno;
        this.secondoNumero = secondoNumero;
    }
    
    public double calcolaSomma() {      //Metodo che calcola la somma di due numeri 
        
    }
    
    public double calcolaDifferenza() {     //Metodo che calcola la differenza di due numeri
        
    }
    
    public double calcolaProdotto() {       //Metodo che calcola il prodotto di due numeri
        
    }
    
    public double calcolaQuoziente() {      //Metodo che calcola il quoziente di due numeri
        
    }

    public void setPrimoNumero(double primoNumero) {
        this.primoNumero = primoNumero;
    }

    public void setSegno(String segno) {
        this.segno = segno;
    }

    public void setSecondoNumero(double secondoNumero) {
        this.secondoNumero = secondoNumero;
    }

    public double getPrimoNumero() {
        return primoNumero;
    }

    public String getSegno() {
        return segno;
    }

    public double getSecondoNumero() {
        return secondoNumero;
    }
    
    
}

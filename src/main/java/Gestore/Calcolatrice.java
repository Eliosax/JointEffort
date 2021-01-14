
package Gestore;

public class Calcolatrice {
    protected double primoNumero;
    protected String segno;
    protected double secondoNumero;

    public Calcolatrice(double primoNumero, String segno, double secondoNumero) {
        this.primoNumero = primoNumero;
        this.segno = segno;
        this.secondoNumero = secondoNumero;
    }
    
    public double calcolaSomma() {      //Metodo che calcola la somma di due numeri 
        return primoNumero + secondoNumero;
    }
    
    public double calcolaDifferenza() {     //Metodo che calcola la differenza di due numeri
        return primoNumero-secondoNumero;
    }
    
    public double calcolaProdotto() {       //Metodo che calcola il prodotto di due numeri
        return primoNumero*secondoNumero;
    }
    
    public double calcolaQuoziente() {      //Metodo che calcola il quoziente di due numeri
        double quoziente;
        
        if(secondoNumero > 0)
            quoziente = primoNumero / secondoNumero;
        else
            quoziente = -1;
        
        return quoziente;
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
    
    public double risultato(){
        double finale;

        if(segno == "+")
            finale = this.calcolaSomma();
        else{
            if(segno == "-")
                finale = this.calcolaDifferenza();
            else{
                if(segno == "*" || segno == "x")
                    finale = this.calcolaProdotto();
                else{
                    if(segno == "/")
                        finale = this.calcolaQuoziente();
                    else
                        finale = 0;
                }
            }
        }
        return finale;
    }
    
    //Nel main fare un if dove si controlla sia il segno che finale, nel caso il segno sia diverso da quelli inseriti finale = 0 (cout: errore); invece nel caso il segno sia divisione e finale sia -1 (cout: impossibile)
}

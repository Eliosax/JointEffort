
package Gestore;

public class Calcolatrice {
    private double primoNumero;
    private String segno;
    private double secondoNumero;

    public Calcolatrice() {};
    
    public Calcolatrice(double primoNumero, String segno, double secondoNumero) {
        this.primoNumero = primoNumero;
        this.segno = segno;
        this.secondoNumero = secondoNumero;
    }
    
    public double calcolaSomma() {      //Metodo che calcola la somma di due numeri 
        return primoNumero + secondoNumero;
    }
    
    public double calcolaDifferenza() {     //Metodo che calcola la differenza di due numeri
        return primoNumero - secondoNumero;
    }
    
    public double calcolaProdotto() {       //Metodo che calcola il prodotto di due numeri
        return primoNumero * secondoNumero;
    }
    
    public double calcolaQuoziente() {      //Metodo che calcola il quoziente di due numeri
        double quoziente = 0;
        
        if(secondoNumero > 0)
            quoziente = primoNumero / secondoNumero;
        else{
            if(secondoNumero == 0)
                quoziente = -1;
            else{
                if(primoNumero == 0)
                    quoziente = 0;
            }
        }
        return quoziente;
    }

    public double calcolaModulo() {
        return primoNumero % secondoNumero;
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
        double finale = 0;

        if(segno.equals("+"))
            finale = this.calcolaSomma();
        else{
            if(segno.equals("-"))
                finale = this.calcolaDifferenza();
            else{
                if(segno.equals("*") || segno.equals("X"))
                    finale = this.calcolaProdotto();
                else{
                    if(segno.equals("/"))
                        finale = this.calcolaQuoziente();
                    else{
                        if(segno.equals("%"))
                            finale = this.calcolaModulo();
                            
                    }     
                }
            }
        }
        return finale;
    }
    

}

package pkgclass;

public class Rational {
    int num, denom;

    Rational(){
        System.out.println("Hello This Is Rational!");
    }
    Rational(int a, int b){
        return new toString();
    }
    
    int getNumerator(){
        return num;
    }
    int getDemonimator(){
        return denom;
    }
    void setNumerator (int num){
        this.num=num;
    }
    void setDenominator (int denom){
        this.denom=denom;
    }
    Rational add (Rational other){
        int a=other.getNumerator();
        int b=other.getDemonimator();
        return new Rational()
    }
    Rational subtract (Rational other){
        
    }
    Rational multiply (Rational other){
        
    }
    Rational divide (Rational other){
        
    }
    String toString(){
        String t = num+"/"+denom;
        return t;
    }
    
}

package GeometriaEspacial;

import java.lang.Math;

public class CilindroReto {

    final private double PI = 3.14;
    private int altura;
    private int base;
    private int raio;

    public double calculateArea(int raio, int altura){
        this.raio = raio;
        this.altura = altura;
        double result = (double) (2 * PI * raio * (altura + raio));
        return result;
    }

    public double calculateVolume(int altura, int raio, double PI){
        this.altura = altura;
        this.raio = raio;
        double result = (double)(PI * Math.pow(raio, 2) * altura);
        return result;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    
    }
    public int getAltura(){
        return this.altura;

    }
    public void setBase(int base){
        this.base = base;
    
    }
    public double getBase(){
        return this.base;
        
    }
    public void setRaio(int raio){
        this.raio = raio;
        
    }
    public double getRaio(){
        return this.raio;
        
    }
    
}


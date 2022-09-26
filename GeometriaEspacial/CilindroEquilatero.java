package GeometriaEspacial;

import java.lang.Math;

public class CilindroEquilatero {

    final private double PI = 3.14;
    private int altura;
    private int base;
    private int raio;

    public double calculateArea(int raio, int altura){
        double result = (double) (6 * PI * Math.pow(raio, 2));
        return result;
    }

    public double calculateVolume(int altura, int raio, double PI){
        double result = (double)(2 * PI * Math.pow(raio, 3));
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

package Figuras;

public class Circulo extends Figura2D {
    
    private int diametro;
    private double PI = 3.14;

    public void setDiametro(int diametro){
        this.diametro = diametro;  
    }

    public int getDiametro(){
        return diametro;
    }
}

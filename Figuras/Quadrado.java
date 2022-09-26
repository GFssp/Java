package Figuras;

public class Quadrado extends Figura2D {

    private int largura;
    private int altura;
    private int diametro;

    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getLargura(){
        return this.largura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int getAltura(){
        return this.altura;
    }

    public void setDiametro(int diametro){
        this.diametro = diametro;
    }

    public int getDiametro(){
        return this.diametro;
    }

    public int areaQuadrado(){
        int area = (this.largura*this.altura);
        return area;
    }

    public int diametro(){
        int diametro = (this.largura*this.altura) / 2;
        return diametro;

    }

}

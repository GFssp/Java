package Figuras;

public class Losango extends Quadrado{

    int altura = super.getAltura();
    int largura = super.getLargura();

    public Losango(){
        if (this.altura == this.largura){
            System.out.println("Losango Inválido");
        } else {
            System.out.println("Eba!");
        }
    }

    public int area(){
        int area = 0;
        return area;
    }
}

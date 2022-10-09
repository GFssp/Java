package Figuras;

public class Retangulo extends Quadrado{
    
    int largura = super.getLargura();
    int altura = super.getAltura();

    public Retangulo(){
        if (this.altura == this.largura){
            System.out.println("Retângulo inválido");
        } else {
            System.out.println("eba");
        }
    }

}

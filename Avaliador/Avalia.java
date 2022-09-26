package Avaliador;

public class Avalia {

    private double n1;
    private double n2;
    private double n3;
    private double n4;

    public double calculaMedia(double n1, double n2, double n3, double n4){

        double media = (this.n1 + this.n2 + this.n3 + this.n4) / 4;
        return (double)media;
    }

    public double calculaMediana(double n1, double n2, double n3, double n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        return 1.0;


    }

    public int calculaMediana(int n1, int n2, int n3, int n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;

        return 0;
    }

}
package AnaliseCombinatoria;

public class Combinacoes {

    private int total;
    private int numeroLimite;

    public int Fatorial(int numero){
        int i, 
        fact = 1;  
    
        for(i = 1; i <= numero ; i++){
            fact=fact*i;    
        }
        return fact;
    }

    public int calculateCombinations(int total, int numeroLimite){
        int diferenca = getTotal() - getNumeroLimite();
        int diferencaFat = Fatorial(diferenca);
        int n = Fatorial(getTotal());
        int k = Fatorial(getNumeroLimite());
        int resultado1 = (int) (k * diferencaFat);
        int combinations = (int) n / resultado1;

        return combinations;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public int getTotal(){
        return this.total;
    } 

    public void setNumeroLimite(int numeroLimite){
        this.numeroLimite = numeroLimite;
    }

    public int getNumeroLimite(){
        return this.numeroLimite;
    } 
}

package AnaliseCombinatoria;

public class AnaliseTeste {
    public static void main(String[] args) {
        Combinacoes calculo = new Combinacoes();
        calculo.setTotal(10);
        calculo.setNumeroLimite(2);
    
        int resultado = calculo.calculateCombinations(10, 2);
        System.out.println(resultado);
    }
}

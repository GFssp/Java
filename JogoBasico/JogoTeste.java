import java.util.Random;

public class JogoTeste {
    public static void main(String[] args) throws Exception{
        Personagem cacador = new Personagem(10, 0, 0);
        Random gerador = new Random();
        cacador.setNome("Alex");
        while (true){
            int valorAleatorio = gerador.nextInt(3) + 1; // 1 a 3
            switch (valorAleatorio){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            System.out.println("---------------------");
            Thread.sleep(3000);
            double atividadeSoneca = gerador.nextDouble(1);

            if (atividadeSoneca <= 0.7){
                cacador.dormir();
            } else if (atividadeSoneca <= 0.85){
                cacador.comer();
            } else {
                cacador.cacar();
            }

        }
    }
}

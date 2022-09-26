public class Personagem{

    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem(int energia, int fome, int sono){
        setEnergia(energia);
        setFomeValor(fome);
        setSonoValor(sono);

    }

    public void cacar(){
        if (getEnergia() >= 2 ){
            setEnergia(getEnergia() - 2);
            System.out.println(getNome() + " Está caçando");
        }
        else{
            System.out.println(getNome() + " Está sem energia");
        }
        setFomeValor(Math.min(getFomeValor() + 1, 10));
        setSonoValor(Math.min(getSonoValor() + 1, 10));
    }

    public void comer(){
        if (getFomeValor() >= 1){
            setEnergia(Math.min(getEnergia() + 1, 10));
            setFomeValor(getFomeValor() - 1);
            setEnergia(getEnergia() + 1);
        }
        else{
            System.out.println(getNome() + " está sem fome.");
        }
    }   

    public void dormir(){
        if (getSonoValor() >= 1){
            setSonoValor(Math.min(getSonoValor() + 1, 10));
            setSonoValor(getSonoValor() - 1);
            setEnergia(getEnergia() + 1);
            System.out.println(getNome() + " está dormindo... ");
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getEnergia(){
        return this.energia;
    }

    private void setFomeValor(int fome){
        this.fome = fome;
    }

    public int getFomeValor(){
        return this.fome;
    }

    private void setSonoValor(int sono){
        this.sono = sono;
    }

    public int getSonoValor(){
        return this.sono;
    }
}
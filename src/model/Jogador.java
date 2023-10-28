package model;

public abstract class Jogador {
    
    private String nome;
    private Coisa coisa;
    private int ganhou;

    

    public Jogador(String nome) {
        setNome(nome);
        setGanhou();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }else{
            this.nome = "Indefinido";
        }
    }

    public Coisa getCoisa() {
        return coisa;
    }

    public void setCoisa(int opc) {
        if(opc > 0 && opc <= 3){
            switch (opc) {
                case 1:
                    coisa = new Pedra();
                    break;
                case 2:
                    coisa = new Papel();
                    break;
                case 3:
                    coisa = new Tesoura();
                    break;
            }
        }
    }

    public int getGanhou() {
        return ganhou;
    }

    public void attGanhou(){
        this.ganhou += 1;
    }

    public void setGanhou() {
        this.ganhou = 0;
    }

    public abstract void escolherCoisa();

}

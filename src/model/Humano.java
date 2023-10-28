package model;

import view.Janela;

public class Humano extends Jogador {
    
    public Humano(String nome){
        super(nome);
    }

    @Override
    public void escolherCoisa() {
        setCoisa(Janela.escolherCoisa());
    }

    @Override
    public String toString() {
        String answer = getNome();

        if(getCoisa() instanceof Pedra){
            answer += " escolheu: Pedra";
        }else if(getCoisa() instanceof Papel){
            answer += " escolheu: Papel";
        }else{
            answer += " escolheu: Tesoura";
        }

        return answer;
    }

}

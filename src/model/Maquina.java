package model;

import java.util.Random;

public class Maquina extends Jogador {

    public Maquina(String nome){
        super(nome);
    }

    private int gerarOpcAleatorio(){
        Random num = new Random();
        return num.nextInt(3)+1;
    }

    @Override
    public void escolherCoisa() {
        setCoisa(gerarOpcAleatorio());
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

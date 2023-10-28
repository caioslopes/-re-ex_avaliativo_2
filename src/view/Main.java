package view;

import model.Jogo;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Jogo novoJogo = new Jogo(true, false);

        novoJogo.iniciar();
    }

}

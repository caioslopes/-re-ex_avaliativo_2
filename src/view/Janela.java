package view;

import javax.swing.JOptionPane;

import model.Jogo;

public class Janela {
    
    public static String entradaTexto(String titulo){
        return JOptionPane.showInputDialog(null, titulo, "Pedra, Papel ou Tesoura", 1);
    }

    public static int escolherCoisa(){
        String answer;
        String msg = "Escolha uma jogada!";
        String title = "Pedra, Papel ou Tesoura";

        int choose = 0;

        Object opcoes[] = {"Pedra", "Papel", "Tesoura"};

        answer = (String) JOptionPane.showInputDialog(null,
        msg, 
        title,
        3,
        null,
        opcoes,
        opcoes[0]
        );

        switch (answer) {
            case "Pedra":
                choose = 1;
                break;
            case "Papel":
                choose = 2;
                break;
            case "Tesoura":
                choose = 3;
                break;
        }

        return choose;
    }

    public static void exibirMensagem(String msg, String titulo){
        JOptionPane.showMessageDialog(null, msg, titulo, 2);
    }

    public static void iniciar(){
        Jogo novoJogo;
        String answer;
        String msg = "Tipo de jogo";
        String title = "Pedra, Papel ou Tesoura";

        int opcSecondMenu;

        Object opcoes[] = {"Humano X Máquina", "Máquina X Máquina"};

        answer = (String) JOptionPane.showInputDialog(null,
        msg, 
        title,
        3,
        null,
        opcoes,
        opcoes[0]
        );

        switch (answer) {
            case "Humano X Máquina":
                opcSecondMenu = secondMenu();
                if(opcSecondMenu == 1){
                    novoJogo = new Jogo(false, false);
                    novoJogo.iniciar();
                }else{
                    if(opcSecondMenu == 2){
                        novoJogo = new Jogo(true, false);
                        novoJogo.iniciar();
                    }
                }
                break;
            case "Máquina X Máquina":
                opcSecondMenu = secondMenu();
                if(opcSecondMenu == 1){
                    novoJogo = new Jogo(false, true);
                    novoJogo.iniciar();
                }else{
                    if(opcSecondMenu == 2){
                        novoJogo = new Jogo(true, true);
                        novoJogo.iniciar();
                    }
                }
                break;
        }
  
    }

    private static int secondMenu(){
        String answer;
        String msg = "Númedo de Rodadas";
        String title = "Pedra, Papel ou Tesoura";

        int choose = 0;

        Object opcoes[] = {"Rodada Única", "Melhor de Três"};

        answer = (String) JOptionPane.showInputDialog(null,
        msg, 
        title,
        3,
        null,
        opcoes,
        opcoes[0]
        );

        switch (answer) {
            case "Rodada Única":
                choose = 1;
                break;
            case "Melhor de Três":
                choose = 2;
                break;
        }

        return choose;
    }

    public static void janelaFinal(){
        int answer;
        String msg = "Fim da partida";
        String title = "Pedra, Papel ou Tesoura";

        Object opcoes[] = {"Sair", "Jogar Novamente"};

        answer = JOptionPane.showOptionDialog(null,
        msg,
        title,
        JOptionPane.YES_NO_CANCEL_OPTION,
        1,
        null,
        opcoes,
        opcoes[0]
        );

        if(answer == 1){
            iniciar();
        }

    }

}

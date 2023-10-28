package view;

import javax.swing.JOptionPane;

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

    public static void menu(){
        String answer;
        
    }

}

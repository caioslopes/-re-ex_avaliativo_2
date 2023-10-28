package model;

import view.Janela;

public class Jogo {
    
    private boolean melhorDeTres;
    private boolean maquinaXmaquina;

    public Jogo(boolean melhorDeTres, boolean maquinaXmaquina) {
        setMelhorDeTres(melhorDeTres);
        setMaquinaXmaquina(maquinaXmaquina);
    }

    public boolean isMelhorDeTres() {
        return melhorDeTres;
    }

    public void setMelhorDeTres(boolean melhorDeTres) {
        this.melhorDeTres = melhorDeTres;
    }

    public boolean isMaquinaXmaquina() {
        return maquinaXmaquina;
    }

    public void setMaquinaXmaquina(boolean maquinaXmaquina) {
        this.maquinaXmaquina = maquinaXmaquina;
    }

    public void iniciar(){
        if(isMaquinaXmaquina()){
            if(isMelhorDeTres()){
                Maquina m1 = new Maquina("Alexa");
                Maquina m2 = new Maquina("Siri");

                while (m1.getGanhou() < 2 && m2.getGanhou() < 2) {
                    m1.escolherCoisa();
                    m2.escolherCoisa();
                    rodada(m1, m2);
                }
            }else{
                Maquina m1 = new Maquina("Alexa");
                Maquina m2 = new Maquina("Siri");

                while (m1.getGanhou() < 1 && m2.getGanhou() < 1) {
                    m1.escolherCoisa();
                    m2.escolherCoisa();

                    rodada(m1, m2);
                }
            }
        }else{
            if(isMelhorDeTres()){
                Jogador h = new Humano(Janela.entradaTexto("Digite seu nome"));
                Maquina m = new Maquina("Siri");

                while (h.getGanhou() < 2 && m.getGanhou() < 2) {
                    h.escolherCoisa();
                    m.escolherCoisa();
                    rodada(h, m);
                }
            }else{
                Jogador h = new Humano(Janela.entradaTexto("Digite seu nome"));
                Maquina m = new Maquina("Siri");

                while (h.getGanhou() < 1 && m.getGanhou() < 1) {
                    h.escolherCoisa();
                    m.escolherCoisa();
                    rodada(h, m);
                }
            }
        }
        Janela.janelaFinal();
    }

    private void rodada(Jogador a, Jogador b){
        String answer;
        switch (a.getCoisa().compara(b.getCoisa())) {
            case 0:
                answer = String.format("%s\n%s\n\nEMPATE!\n\n%s: %d | %s: %d",
                a.toString(), b.toString(), a.getNome(), a.getGanhou(), b.getNome(), b.getGanhou());
                Janela.exibirMensagem(answer, "Rodada");
                break;
            case 1:
                a.attGanhou();
                answer = String.format("%s\n%s\n\n%s VENCEU!\n\n%s: %d | %s: %d",
                a.toString(), b.toString(), a.getNome(), a.getNome(), a.getGanhou(), b.getNome(), b.getGanhou());
                Janela.exibirMensagem(answer, "Rodada");
                break;
            case -1:
                b.attGanhou();
                answer = String.format("%s\n%s\n\n%s VENCEU!\n\n%s: %d | %s: %d",
                a.toString(), b.toString(), b.getNome(), a.getNome(), a.getGanhou(), b.getNome(), b.getGanhou());
                Janela.exibirMensagem(answer, "Rodada");
                break;
        }
    }

}

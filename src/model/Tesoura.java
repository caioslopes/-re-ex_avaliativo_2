package model;

public class Tesoura extends Coisa {

    @Override
    public int compara(Coisa coisa) {
        if(coisa instanceof Tesoura){
            return 0;
        }else if(coisa instanceof Pedra){
            return -1;
        }else{
            return 1;
        }
    }

}

package model;

public class Pedra extends Coisa {

    @Override
    public int compara(Coisa coisa) {
        if(coisa instanceof Papel){
            return -1;
        }else if(coisa instanceof Tesoura){
            return 1;
        }else{
            return 0;
        }
    }

}

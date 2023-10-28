package model;

public class Papel extends Coisa {

    @Override
    public int compara(Coisa coisa) {
        if(coisa instanceof Papel){
            return 0;
        }else if(coisa instanceof Tesoura){
            return -1;
        }else{
            return 1;
        }
    }
    
}

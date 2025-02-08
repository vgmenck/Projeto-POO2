//Vitor Gabriel Menck Diniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package Model;

import Model.Liga;

public class FasedeGrupos extends Liga {
    
    private int qtdGrupos;
    private int qtdTimesGrupo;
    private int qtdClasGrupo;


    public FasedeGrupos(){
        int qtdGrupos = 0;
        int qtdTimesGrupo = 0;
        int qtdClasGrupo = 0;
    }

    public int getQtdGrupos(){
        return qtdGrupos;
    }

    public int getQtdTimesGrupo(){
        return qtdTimesGrupo;
    }

     public int getQtdClasGrupo(){
        return qtdClasGrupo;
    }

    public final void setQtdGrupos(int qtdGrupos){
        this.qtdGrupos = qtdGrupos;
    }

    public final void setQtdTimesGrupo(int qtdTimesGrupo){
        this.qtdTimesGrupo = qtdTimesGrupo;
    }

    public final void setQtdClasGrupo(int qtdClasGrupo){
        this.qtdClasGrupo = qtdClasGrupo;
    }

   
 
}

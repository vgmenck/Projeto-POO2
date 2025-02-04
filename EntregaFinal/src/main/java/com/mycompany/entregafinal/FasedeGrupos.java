//Vitor Gabriel Menck Diniz - RA:2487870

package com.mycompany.entregafinal;

public class FasedeGrupos extends Liga implements CalcPontuacao{
    
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

     //SOBRESCRITA
     public int calcPontuacao(){
        int vit;
        int der;
        int emp;
        int pontos;
        
        vit = this.getVitoria()*3; 
        der = this.getDerrota()*0;
        emp = this.getEmpate()*1;

        pontos = vit + der + emp;

        if(pontos > 10){
            System.out.println("Classificado para a proxima fase");
        }else if(pontos < 10 && pontos > 6){
            System.out.println("Brigando por classificacao");
        }else{
            System.out.println("Eliminado");
        }

        return pontos; 
    }
}

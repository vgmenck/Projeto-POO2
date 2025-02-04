//Vitor Gabriel Menck Diniz - RA:2487870

package com.mycompany.entregafinal;

public class MataMata extends Liga implements CalcPontuacao{
    
    private int qtdFases;
    private String faseAtual;
    private int qtdTimesRestantes;

    public MataMata(){
        int qtdFases = 0;
        String faseAtual = "";
        int qtdTimesRestantes = 0;
    }

    public int getQtdFases(){
        return qtdFases;
    }

    public String getFaseAtual(){
        return faseAtual;
    }

    public int getQtdTimesRestantes(){
        return qtdTimesRestantes;
    }

    public final void setQtdFases(int qtdFases){
        this.qtdFases = qtdFases;
    }

    public final void setFaseAtual(String faseAtual){
        this.faseAtual = faseAtual;
    }

    public final void setQtdTimesRestantes(int qtdTimesRestantes){
        this.qtdTimesRestantes = qtdTimesRestantes;
    }

    //Sobrescrtia
    public int calcPontuacao(){
        int vit;
        int der;
        int emp;
        int pontos;
        
        vit = this.getVitoria()*3; 
        der = this.getDerrota()*0;
        emp = this.getEmpate()*1;

        pontos = vit + der + emp;

        if(pontos > 3){
            System.out.println("Classificado para a proxima fase");
        } else if(pontos < 3 ){
            System.out.println("Eliminado");
        }else{
            System.out.println(" Jogo Empatado");
        }

        return pontos; 
    }
}

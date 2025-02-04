//Vitor Gabriel Menck Diniz - RA:2487870

package com.mycompany.entregafinal;

public class PontosCorridos extends Liga implements CalcPontuacao{
    
    private int posicaoTabela;
    private int clasInter;
    private int clasInter2;
    private int rebaixados;

    public PontosCorridos(){
        int posicaoTabela = 0;
        int clasInter = 0;
        int clasInter2 = 0;
        int rebaixados = 0;
    }

    public int getPosicaoTabela(){
        return posicaoTabela;
    }

    public int getClasInter(){
        return clasInter;
    }

    public int getClasInter2(){
        return clasInter2;
    }

    public int getRebaixados(){
        return rebaixados;
    }

    public final void setposicaoTabela(int posicaoTabela){
        this.posicaoTabela = posicaoTabela;
    }

    public final void setClasInter(int clasInter){
        this.clasInter = clasInter;
    }

    public final void setClasInter2(int clasInter2){
        this.clasInter2 = clasInter2;
    }

    public final void setRebaixados(int rebaixados){
        this.rebaixados = rebaixados;
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

        return pontos; 
    }

}
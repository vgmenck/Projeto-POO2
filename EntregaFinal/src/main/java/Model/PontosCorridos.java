//Vitor Gabriel Menck Diniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package Model;

import Model.Liga;

public class PontosCorridos extends Liga {
    
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


}
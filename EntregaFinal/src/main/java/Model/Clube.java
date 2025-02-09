//VitorGabrielMenckDiniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package Model;

import Model.Atleta;
import java.util.ArrayList;
import java.util.List;

public class Clube{
    

    private String nomeTime;
    private int fundacao;
    private int qtdTitulos;
    private String estado;
    private String cidade;
    private List<Atleta> atletas;


    public Clube() {
        this.nomeTime = "";
        this.fundacao = 0;
        this.qtdTitulos = 0;
        this.estado = "";
        this.cidade = "";
        this.atletas = new ArrayList<>();
    }

    public String getNomeTime(){
        return nomeTime;
    }

    public int getFundacao(){
        return fundacao;
    }

    public int getQtdTitulos(){
        return qtdTitulos;
    }

    public String getEstado(){
        return estado;
    }

    public String getCidade(){
        return cidade;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public final void setNomeTime(String nomeTime){
        this.nomeTime = nomeTime;
    }

    public final void setFundacao (int fundacao) throws ClubeException{
       if(fundacao > 1900 && fundacao < 2010){
            this.fundacao = fundacao;
       }else{
            throw new ClubeException();
       }
       
    }

    public final void setQtdTitulos(int qtdTitulos){
        this.qtdTitulos = qtdTitulos;
    }

    public final void setEstado(String estado){
        this.estado = estado;
    }

    public final void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setAtletas(List<Atleta> atletas) {
        if (atletas != null) {
            this.atletas = atletas;
        } else {
            this.atletas = new ArrayList<>();
        }
    }

}
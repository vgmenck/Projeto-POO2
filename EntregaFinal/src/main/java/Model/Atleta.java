//VitorGabrielMenckDiniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package Model;

public class Atleta{
    
    private String nomeAtleta;
    private String posicao;
    private int idadeAtleta;
    private int gols;
    private int assistencias;

    public Atleta(){
        this.nomeAtleta = "";
        this.posicao = "";
        this.idadeAtleta = 0;
        this.gols = 0;
        this.assistencias = 0;
    }

    
    //sobrecarga
    public Atleta(String nomeAtleta, String posicao, int idadeAtleta, int gols, int assistencias ){
        this.nomeAtleta = nomeAtleta;
        this.posicao = posicao ;
        this.idadeAtleta = idadeAtleta;
        this.gols = gols;
        this.assistencias = assistencias;
    }

    public String getNomeAtleta(){
        return nomeAtleta;
    }

    public String getPosicao(){
        return posicao;
    }

    public int getIdadeAtleta(){
        return idadeAtleta;
    }

    public int getGols(){
        return gols;
    }

    public int getAssistencias(){
        return assistencias;
    }

    public final void setNomeAtleta(String nomeAtleta){
        this.nomeAtleta = nomeAtleta;
    }

    public final void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public final void setIdadeAtleta(int idadeAtleta){
        this.idadeAtleta = idadeAtleta;
    }

     public final void setGols(int gols){
        this.gols = gols;
    }

     public final void setAssistencias(int assistencias){
        this.assistencias = assistencias;
    }
}
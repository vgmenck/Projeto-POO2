//Vitor Gabriel Menck Diniz - RA:2487870

package com.mycompany.entregafinal;

import java.util.ArrayList;
import java.util.List;

public abstract class Liga{


    private String nomeLiga;
    private String pais;
    private int qtdTimes;
    private int qtdJogos;
    private int premiacao;
    private String artilheiro;
    private String garcom;
    private String melhorAtaque;
    private String melhorDefesa;
    private int vitoria;
    private int derrota;
    private int empate;
    private Clube clube;
    private List<Clube> clubes;


    public Liga(){
        String nomeLiga ="";
        String pais = "";
        int qtdTimes = 0;
        int qtdJogos= 0;
	int premiacao = 0;
        String artilheiro;
        String garcom;
        String melhorAtaque;
        String melhorDefesa;
        int vitoria = 0;
        int derrota = 0;
        int empate = 0;
        clubes = new ArrayList<Clube>();
    }
    
    public String getNomeLiga(){
        return nomeLiga;
    }

    public String getPais(){
        return pais;
    }

    public int getQtdTimes(){
        return qtdTimes;
    }

    public int getQtdJogos(){
        return qtdJogos;
    }

     public int getPremiacao(){
        return premiacao;
    }

    public String getArtilheiro(){
        return artilheiro;
    }

    public String getGarcom(){
        return garcom;
    }

    public String getMelhorAtaque(){
        return melhorAtaque;
    }

    public String getMelhorDefesa(){
        return melhorDefesa;
    }
 
    public int getVitoria(){
        return vitoria;
    }

    public int getDerrota(){
        return derrota;
    }

    public int getEmpate(){
        return empate;
    }

    public Clube getClube(){
        return clube;
    }

    public List<Clube> getCkubes() {
        return clubes;
    }


    public final void setNomeLiga(String nomeLiga) throws LigaException{
        if(nomeLiga.length() > 2 && nomeLiga.length() < 40){
            this.nomeLiga = nomeLiga;
       }else{
            throw new LigaException();
       }
    }

    public final void setPais(String pais){
        this.pais = pais;
    }

    public final void setQtdTimes(int qtdTimes){
        this.qtdTimes = qtdTimes;
    }

    public final void setQtdJogos(int qtdJogos){
        this.qtdJogos = qtdJogos;
    }

    public final void setPremiacao(int premiacao){
        this.premiacao = premiacao;
    }

    public final void setArtilheiro(String artilheiro){
        this.artilheiro = artilheiro;
    }

    public final void setGarcom(String garcom){
        this.garcom = garcom;
    }

    public final void setMelhorAtaque(String melhorAtaque){
        this.melhorAtaque = melhorAtaque;
    }

    public final void setMelhorDefesa(String melhorDefesa){
        this.melhorDefesa = melhorDefesa;
    }
    
    public final void setVitoria(int vitoria){
        this.vitoria = vitoria;
    }

    public final void setDerrota(int derrota){
        this.derrota = derrota;
    }

    public final void setEmpate(int empate){
        this.empate = empate;
    }

    public final void setClube(Clube clube){
        this.clube = clube;
    }

    public void setClubes(List<Clube> clubes) {
        this.clubes = clubes;
    }

    
}
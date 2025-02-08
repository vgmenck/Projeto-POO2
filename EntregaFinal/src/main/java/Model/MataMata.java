//Vitor Gabriel Menck Diniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package Model;

public class MataMata extends Liga {
    
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

    
}

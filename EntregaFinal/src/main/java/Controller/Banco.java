//VitorGabrielMenckDiniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package Controller;

import Model.Atleta;
import Model.Clube;
import Model.FasedeGrupos;
import Model.LigaException;
import Model.MataMata;
import Model.PontosCorridos;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco{
    
    private static PontosCorridos pc = new PontosCorridos();
    private static MataMata mm = new MataMata();
    private static FasedeGrupos fg = new FasedeGrupos();
    private static Clube c = new Clube();
    private static Atleta a = new Atleta();
    private static List<PontosCorridos> bdPontosCorridos;
    private static List<MataMata> bdMataMata;
    private static List<FasedeGrupos> bdFasedeGrupos;
    private static List<Clube> bdClube;
    private static List<Atleta> bdAtleta;
    private static Banco bdUnic;


    private Banco() {
        bdPontosCorridos = new ArrayList<PontosCorridos>();
        bdMataMata = new ArrayList<MataMata>();
        bdFasedeGrupos = new ArrayList<FasedeGrupos>();
        bdClube = new ArrayList<Clube>();
        bdAtleta = new ArrayList<Atleta>();
    }

    public static Banco getBanco() {
        if(getBdUnic() == null) {
            bdUnic = new Banco();
        }
        return getBdUnic();
    }

    public PontosCorridos cadastraPontosCorridos(PontosCorridos pc){
        if(consultarPontosCorridos(pc) == null){
            getBdPontosCorridos().add(pc);
            return pc;
        }
        return null;
    }
    
    public static PontosCorridos consultarPontosCorridos(PontosCorridos pc){
        for(int i=0; i < getBdPontosCorridos().size(); i++){
            if(pc.getNomeLiga().equals(getBdPontosCorridos().get(i).getNomeLiga()) && pc.getPais().equals(getBdPontosCorridos().get(i).getPais())){
                return getBdPontosCorridos().get(i);
            }
        }
        return null;
    }
    
    public static PontosCorridos alterarPontosCorridos(PontosCorridos pc){
        for(int i = 0; i < getBdPontosCorridos().size(); i++){
            if(pc.getNomeLiga().equals(getBdPontosCorridos().get(i).getNomeLiga()) && pc.getPais().equals(getBdPontosCorridos().get(i).getPais())){
                String altNomeLiga = JOptionPane.showInputDialog(null,"DIGITE O NOVO NOME DESEJADO:","ALTERACAO DE NOME DA LIGA",1);
                String altPais = JOptionPane.showInputDialog(null,"DIGITE O NOVO PAIS DESEJADO:","ALTERACAO DE PAIS DA LIGA",1);
                try{
                    pc.setNomeLiga(altNomeLiga);
                }catch(LigaException le){
                    JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
                }
                pc.setPais(altPais);
                bdPontosCorridos.set(i,pc);
                return bdPontosCorridos.get(i);
            }
        }
        return null;
    }
    
    public static PontosCorridos delPontosCorridos(PontosCorridos pc){
        	for(int i = 0; i < getBdPontosCorridos().size(); i++){
			if(pc.getNomeLiga().equals(getBdPontosCorridos().get(i).getNomeLiga()) && pc.getPais().equals(getBdPontosCorridos().get(i).getPais())){
				getBdPontosCorridos().remove(getBdPontosCorridos().get(i));
				return null;
			}
		}
	return pc;
    }
    
    public static List<PontosCorridos> getBdPontosCorridos(){
        return bdPontosCorridos;
    }
    
  
    public MataMata cadastraMataMata(MataMata mm){
        if(consultarMataMata(mm) == null){
            getBdMataMata().add(mm);
            return mm;
        }
        return null;
    }
    
    public static MataMata consultarMataMata(MataMata mm){
        for(int i=0; i < getBdMataMata().size(); i++){
            if(mm.getNomeLiga().equals(getBdMataMata().get(i).getNomeLiga()) && mm.getPais().equals(getBdMataMata().get(i).getPais())){
                return getBdMataMata().get(i);
            }
        }
        return null;
    }
    
        public static MataMata delMataMata(MataMata mm){
        	for(int i = 0; i < getBdMataMata().size(); i++){
			if(mm.getNomeLiga().equals(getBdMataMata().get(i).getNomeLiga()) && mm.getPais().equals(getBdMataMata().get(i).getPais())){
				getBdMataMata().remove(getBdMataMata().get(i));
				return null;
			}
		}
	return mm;
    }

    
    public static MataMata alterarMataMata(MataMata mm){
        for(int i = 0; i < getBdMataMata().size(); i++){
            if(mm.getNomeLiga().equals(getBdMataMata().get(i).getNomeLiga()) && mm.getPais().equals(getBdMataMata().get(i).getPais())){
                String altNomeLiga = JOptionPane.showInputDialog(null,"DIGITE O NOVO NOME DESEJADO:","ALTERACAO DE NOME DA LIGA",1);
                String altPais = JOptionPane.showInputDialog(null,"DIGITE O NOVO PAIS DESEJADO:","ALTERACAO DE PAIS DA LIGA",1);
                try{
                    mm.setNomeLiga(altNomeLiga);
                }catch(LigaException le){
                    JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
                }
                mm.setPais(altPais);
                bdMataMata.set(i,mm);
                return bdMataMata.get(i);
            }
        }
        return null;
    }
    
    public static List<MataMata> getBdMataMata(){
        return bdMataMata;
    }
    
    public FasedeGrupos cadastraFasedeGrupos(FasedeGrupos fg){
       if(consultarFasedeGrupos(fg) == null){
            getBdFasedeGrupos().add(fg);
            return fg;
        }
        return null;
    }
    
    public static FasedeGrupos consultarFasedeGrupos(FasedeGrupos fg){
        for(int i=0; i < getBdFasedeGrupos().size(); i++){
            if(fg.getNomeLiga().equals(getBdFasedeGrupos().get(i).getNomeLiga()) && fg.getPais().equals(getBdFasedeGrupos().get(i).getPais())){
                return getBdFasedeGrupos().get(i);
            }
        }
        return null;
    }
    
    public static FasedeGrupos delFasedeGrupos(FasedeGrupos fg){
        	for(int i = 0; i < getBdFasedeGrupos().size(); i++){
			if(fg.getNomeLiga().equals(getBdFasedeGrupos().get(i).getNomeLiga()) && fg.getPais().equals(getBdFasedeGrupos().get(i).getPais())){
				getBdFasedeGrupos().remove(getBdFasedeGrupos().get(i));
				return null;
			}
		}
	return fg;
    }
    
    public static FasedeGrupos alterarFasedeGrupos(FasedeGrupos fg){
        for(int i = 0; i < getBdFasedeGrupos().size(); i++){
            if(fg.getNomeLiga().equals(getBdFasedeGrupos().get(i).getNomeLiga()) && fg.getPais().equals(getBdFasedeGrupos().get(i).getPais())){
                String altNomeLiga = JOptionPane.showInputDialog(null,"DIGITE O NOVO NOME DESEJADO:","ALTERACAO DE NOME DA LIGA",1);
                String altPais = JOptionPane.showInputDialog(null,"DIGITE O NOVO PAIS DESEJADO:","ALTERACAO DE PAIS DA LIGA",1);
                try{
                    fg.setNomeLiga(altNomeLiga);
                }catch(LigaException le){
                    JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
                }
                fg.setPais(altPais);
                bdFasedeGrupos.set(i,fg);
                return bdFasedeGrupos.get(i);
            }
        }
        return null;
    }
    
    public static List<FasedeGrupos> getBdFasedeGrupos(){
        return bdFasedeGrupos;
    }
    

    public static Clube cadastraClube(Clube c){
        if(consultarClube(c) == null){
            getBdClube().add(c);
            return c;
        }
        return null;
    }
    public static Clube consultarClube(Clube c){
        for(int i=0; i < getBdClube().size(); i++){
            if(c.getNomeTime().equals(getBdClube().get(i).getNomeTime())){
                return getBdClube().get(i);
            }
        }
        return null;
    }
    
    public static Clube alterarClube(Clube c){
        for(int i = 0; i < getBdClube().size(); i++){
            if(c.getNomeTime().equals(getBdClube().get(i).getNomeTime())){
                String altCidade = JOptionPane.showInputDialog(null,"DIGITE A NOVA CIDADE:","ALTERACAO DE CIDADE",1);
                c.setCidade(altCidade);
                getBdClube().set(100,c);
                return getBdClube().get(1);
            }
        }
        return null;
    }
    
    public static List<Clube> getBdClube(){
        return bdClube;
    }
    
    public static Clube delClube(Clube c){
        	for(int i = 0; i < getBdClube().size(); i++){
			if(c.getNomeTime().equals(getBdClube().get(i).getNomeTime())){
				getBdClube().remove(getBdClube().get(i));
				return null;
			}
		}
	return c;
    }


    public static Atleta cadastraAtleta(Atleta a){
        if(consultarAtleta(a) == null){
            getBdAtleta().add(a);
            return a;
        }
        return null;
    }
  
    public static Atleta consultarAtleta(Atleta a){
        for(int i=0; i < getBdAtleta().size(); i++){
            if(a.getNomeAtleta().equals(getBdAtleta().get(i).getNomeAtleta())){
                return getBdAtleta().get(i);
            }
        }
        return null;
    }
    
    public static Atleta alterarAtleta(Atleta a){
        for(int i = 0; i < getBdAtleta().size(); i++){
            if(a.getNomeAtleta().equals(getBdAtleta().get(i).getNomeAtleta())){
                String altPosicao = JOptionPane.showInputDialog(null,"DIGITE A NOVA POSICAO DESEJADA:","ALTERACAO DE POSICAO",1);
                a.setPosicao(altPosicao);
                getBdAtleta().set(100,a);
                return getBdAtleta().get(1);
            }
        }
        return null;
    }
    
    public static List<Atleta> getAtleta(){
        return getBdAtleta();
    }
    
    public static Atleta delAtleta(Atleta a){
        	for(int i = 0; i < getBdAtleta().size(); i++){
			if(a.getNomeAtleta().equals(getBdAtleta().get(i).getNomeAtleta())){
				getBdAtleta().remove(getBdAtleta().get(i));
				return null;
			}
		}
	return a;
    }
 
    public static List<Atleta> getBdAtleta() {
        return bdAtleta;
    }

    public static Banco getBdUnic() {
        return bdUnic;
    }
}

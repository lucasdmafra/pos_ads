package soccer;

public class Partida {
    
    public Time timeDaCasa;
    public Time visitante;
    public Gol[] gols;
    
    public void jogarPartida(int maximoGols) { 						//2-b
        int numeroGols = (int)(Math.random() * (maximoGols + 1)); 	//2-c
        Gol[] gols = new Gol[numeroGols];
        this.gols = gols;
        GameUtil.adicionarGols(this);
    }
    
    public void jogarPartida() { 									//3-a
    	jogarPartida(6);  											//3-c
    	
    }
    
    public String getDescricao () {
        StringBuilder sb = new StringBuilder();
        for (Gol gol1: this.gols) {
            sb.append("Gol marcado após " + gol1.tempoJogo + " por " + gol1.jogador.nome + "\n");
        }
        return sb.toString();
    }
    
    public Time getTimeDaCasa () {
        return timeDaCasa;
    } 
    
    public Time getVisitante() {
        return visitante;
    }
}

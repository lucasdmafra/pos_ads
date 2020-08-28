package soccer;

public class Campeonato {

    public static void main(String[] args) {
    	
    	Campeonato camp = new Campeonato(); 			//4-b
    	Campeonato time = new Campeonato();				//4-e 
    	
        Time[] times = time.criarTimes();
        Partida[] partidas = camp.criarPartidas(times); //4-c
        
        Partida partida = partidas[0];
        partida.jogarPartida(); 						//2-a   depois  3-d
        System.out.print(partida.getDescricao());
}

    public Time[] criarTimes() {
        Jogador jogador1 = new Jogador();
        jogador1.nome = "Neymar Jr";

        Jogador jogador2 = new Jogador();
        jogador2.nome = "Marquinhos Correa";
        
        Jogador jogador3 = new Jogador();
        jogador3.nome = "Thiago Silva";
        
        Jogador[] jogadoresPSG = {jogador1, jogador2, jogador3};
        
        Time psg = new Time();
        psg.nomeDoTime = "Paris Saint German";
        psg.jogadores = jogadoresPSG;
    
        Jogador jogador4 = new Jogador();
        jogador4.nome = "Alisson Becker";

        Jogador jogador5 = new Jogador();
        jogador5.nome = "Firmino";
        
        Jogador jogador6 = new Jogador();
        jogador6.nome = "Fabinho";
        
        Jogador[] jogadoresLiverpool = {jogador4, jogador5, jogador6};
        
        Time reds = new Time();
        reds.nomeDoTime = "Liverpool";
        reds.jogadores = jogadoresLiverpool;
        
        Time[] times = {psg, reds};
        return times;        
    }    
    
    public Partida[] criarPartidas(Time[] times) { 		 //4-a
        Partida partida = new Partida();
        partida.timeDaCasa = times[0];
        partida.visitante = times[1]; 
        Partida[] partidas = {partida}; 
        return partidas;
    }    
}

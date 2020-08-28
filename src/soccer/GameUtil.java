package soccer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class GameUtil {

    public static void adicionarGols(Partida currGame) {
        
        if (currGame.gols == null) {
            currGame.gols = new Gol[(int) (Math.random() * 10)];   
        }

        int i = 0;
        for (Gol currGoal : currGame.gols) {
            currGoal = new Gol();
            currGoal.time = Math.random() > 0.5 ? getHomeTeam(currGame, "timeDaCasa") : getHomeTeam(currGame, "visitante");
            currGoal.jogador = currGoal.time.jogadores[(int) (Math.random() * currGoal.time.jogadores.length)];
            currGoal.tempoJogo = (int) (Math.random() * 90);
            currGame.gols[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.gols, (g1, g2) -> Double.valueOf(g1.tempoJogo).compareTo(Double.valueOf(g2.tempoJogo)));

    }


    private static Time getHomeTeam(Partida currGame, String homeOrAway) {
        Time theTeam = null;
        Method m;
        Field f;
        try {
            m = Partida.class.getMethod("get" + Character.toUpperCase(homeOrAway.charAt(0)) + homeOrAway.substring(1));
            theTeam = (Time)m.invoke(currGame);
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException em) {
            try {
                f = Time.class.getField(homeOrAway + "Team");
                theTeam = (Time)f.get(currGame);
                //System.out.println(theTeam);
            } catch (NoSuchFieldException|IllegalAccessException ef) { 
                System.out.println("The addGoals() utility requires the Goal class to contain either:\n" +
                        "public String fields called homeTeam and awayTeam, OR,\n" +
                        "public accessor methods called getHomeTeam() and getAwayTeam().");
            }
        }
        return theTeam;
    }
}

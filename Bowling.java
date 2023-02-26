package BowlingGame;

import java.util.HashMap;

public class Bowling {
    HashMap<String, Integer>players;
    Bowling(){
        players=new HashMap<String, Integer>();
    }
    public void addPlayer(String name,int p){
        players.put(name,p);
    }


    public void getWinner() {
        String winner="";
        int max=0;
        String [] name2=new String[players.size()];
        name2=players.keySet().toArray(name2);

        for(String w:name2){
            if (players.get(w)>max){
                winner=w;
                max=players.get(w);

            }

        }
        System.out.println(winner);

    }
}

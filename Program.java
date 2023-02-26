package BowlingGame;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Bowling game=new Bowling();
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<3;i++){
            System.out.println("oyuncu adı ve puanı giriniz");
            String input=sc.nextLine();
            String [] values=input.split(" ");
            String name=values[0];
            int point=Integer.parseInt(values[1]);
            game.addPlayer(name,point);
        }

        game.getWinner();





    }
}

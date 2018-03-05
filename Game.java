/**
 * Write a description of class Game here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.Scanner;
import java.lang.Math;
public class Game
{
    Scanner input = new Scanner(System.in);
    PlayerCharacter player;
    public Game(){
        
    }
    public void PlayerCharacterCreator(){
        int[] playerStats = new int[6];
        int str, intelligence, cha, wis, dex = 0, con = 0, hp, speed, acro;
        String proficiency;
        System.out.println("What is your character's name? ");
        String name = input.nextLine().trim();
        System.out.println("How tall is your character? [in meters] ");
        double height = input.nextDouble();
        System.out.println("How old is your character? ");
        int age = input.nextInt();
        for (int i = 0; i < playerStats.length; i++){
            playerStats[i] = (int)(Math.random() * 20 + 1);
        }
        for (int i = playerStats.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (playerStats[j] > playerStats[j + 1]){
                    int holder = playerStats[j];
                    playerStats[j] = playerStats[j + 1];
                    playerStats[j + 1] = holder;
                }
            }
        }
        System.out.println("Type the basic stats/abilities in order from you suck at it TO you are the best at it.\nThe stats are: strength, intelligence, wisdom, charisma, dexterity, constitution(heartiness). ");
        System.out.println("Type them out individually.");
        for(int i = 0; i < playerStats.length; i++){
            String statResponse = input.nextLine().trim();
            if (statResponse.equals("str") || statResponse.equals("strength")){
                str = playerStats[i];
                if (i == 1){
                    proficiency = "str";
                }
            }else if (statResponse.equals("int") || statResponse.equals("intelligence")){
                intelligence = playerStats[i];
                if (i == 1){
                    proficiency = "int";
                }
            }else if (statResponse.equals("wis") || statResponse.equals("wisdom")){
                wis = playerStats[i];
                if (i == 1){
                    proficiency = "wis";
                }
            }else if (statResponse.equals("cha") || statResponse.equals("charisma")){
                cha = playerStats[i];
                if (i == 1){
                    proficiency = "cha";
                }
            }else if (statResponse.equals("dex") || statResponse.equals("dexterity")){
                dex = playerStats[i];
                if (i == 1){
                    proficiency = "dex";
                }
            }else if (statResponse.equals("con") || statResponse.equals("constitution") || statResponse.equals("constitution(heartiness)")){
                con = playerStats[i];
                if (i == 1){
                    proficiency = "con";
                }
            }
        }
        if (con < 6){ //health assigner
            hp = 80 + (int)(Math.random() * 10 + 1);
        }else if (con > 5 && con < 11){
            hp = 90 + (int)(Math.random() * 10 + 1);
        }else if (con > 10 && con < 16){
            hp = 100 + (int)(Math.random() * 10 + 1);
        }else if (con > 15){
            hp = 80 + (int)(Math.random() * 10 + 1);
        }
        if (dex < 6){ //speed assigner
            speed = 25;
        }else if (dex > 5 && dex < 11){
            speed = 30;
        }else if (dex > 10 && dex < 16){
            speed = 35;
        }else if (dex > 15){
            speed = 40;
        }
        if (dex < 4){ //acro assigner
            acro = -3;
        }else if (dex > 3 && dex < 7){
            acro = -2;
        }else if (dex > 6 && dex < 10){
            acro = -1;
        }else if (dex > 9 && dex < 12){
            acro = 0;
        }else if (dex > 11 && dex < 15){
            acro = 1;
        }// continue here
        //player = new PlayerCharacter(name, height, age, hp, hp, con, str, dex, intelligence, wis, cha, speed, acro);
    }
}
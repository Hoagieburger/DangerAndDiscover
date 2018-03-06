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
        int str = 0, intelligence = 0, cha = 0, wis = 0, dex = 0, con = 0, hp = 0, speed = 0, acro = 0, arcana = 0, athletics = 0, deception = 0, insight = 0, intimidation = 0, investigation = 0, perception = 0, persuasion = 0, stealth = 0, passivePerception = 0, gold = 0, initiativeMod = 0;
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
        }else if (dex > 14 && dex < 18){
            acro = 2;
        }else{
            acro = 3;
        }
        if (intelligence < 4){ //arcana assigner
            arcana = -3;
        }else if (intelligence > 3 && intelligence < 7){
            arcana = -2;
        }else if (intelligence > 6 && intelligence < 10){
            arcana = -1;
        }else if (intelligence > 9 && intelligence < 12){
            arcana = 0;
        }else if (intelligence > 11 && intelligence < 15){
            arcana = 1;
        }else if (intelligence > 14 && intelligence < 18){
            arcana = 2;
        }else{
            arcana = 3;
        }
        if (str < 4){ //athletics assigner
            athletics = -3;
        }else if (str > 3 && str < 7){
            athletics = -2;
        }else if (str > 6 && str < 10){
            athletics = -1;
        }else if (str > 9 && str < 12){
            athletics = 0;
        }else if (str > 11 && str < 15){
            athletics = 1;
        }else if (str > 14 && str < 18){
            athletics = 2;
        }else{
            athletics = 3;
        }
        if (cha < 4){ //deception assigner
            deception = -3;
        }else if (cha > 3 && cha < 7){
            deception = -2;
        }else if (cha > 6 && cha < 10){
            deception = -1;
        }else if (cha > 9 && cha < 12){
            deception = 0;
        }else if (cha > 11 && cha < 15){
            deception = 1;
        }else if (cha > 14 && cha < 18){
            deception = 2;
        }else{
            deception = 3;
        }
        if (wis < 4){ //insight assigner
            insight = -3;
        }else if (wis > 3 && wis < 7){
            insight = -2;
        }else if (wis > 6 && wis < 10){
            insight = -1;
        }else if (wis > 9 && wis < 12){
            insight = 0;
        }else if (wis > 11 && wis < 15){
            insight = 1;
        }else if (wis > 14 && wis < 18){
            insight = 2;
        }else{
            insight = 3;
        }
        if (cha < 4){ //intimidation assigner
            intimidation = -3;
        }else if (cha > 3 && cha < 7){
            intimidation = -2;
        }else if (cha > 6 && cha < 10){
            intimidation = -1;
        }else if (cha > 9 && cha < 12){
            intimidation = 0;
        }else if (cha > 11 && cha < 15){
            intimidation = 1;
        }else if (cha > 14 && cha < 18){
            intimidation = 2;
        }else{
            intimidation = 3;
        }
        if (intelligence < 4){ //investigation assigner
            investigation = -3;
        }else if (intelligence > 3 && intelligence < 7){
            investigation = -2;
        }else if (intelligence > 6 && intelligence < 10){
            investigation = -1;
        }else if (intelligence > 9 && intelligence < 12){
            investigation = 0;
        }else if (intelligence > 11 && intelligence < 15){
            investigation = 1;
        }else if (intelligence > 14 && intelligence < 18){
            investigation = 2;
        }else{
            investigation = 3;
        }
        if (wis < 4){ //perception assigner
            perception = -3;
        }else if (wis > 3 && wis < 7){
            perception = -2;
        }else if (wis > 6 && wis < 10){
            perception = -1;
        }else if (wis > 9 && wis < 12){
            perception = 0;
        }else if (wis > 11 && wis < 15){
            perception = 1;
        }else if (wis > 14 && wis < 18){
            perception = 2;
        }else{
            perception = 3;
        }
        if (cha < 4){ //persuasion assigner
            persuasion = -3;
        }else if (cha > 3 && cha < 7){
            persuasion = -2;
        }else if (cha > 6 && cha < 10){
            persuasion = -1;
        }else if (cha > 9 && cha < 12){
            persuasion = 0;
        }else if (cha > 11 && cha < 15){
            persuasion = 1;
        }else if (cha > 14 && cha < 18){
            persuasion = 2;
        }else{
            persuasion = 3;
        }
        if (dex < 4){ //stealth assigner
            stealth = -3;
        }else if (dex > 3 && dex < 7){
            stealth = -2;
        }else if (dex > 6 && dex < 10){
            stealth = -1;
        }else if (dex > 9 && dex < 12){
            stealth = 0;
        }else if (dex > 11 && dex < 15){
            stealth = 1;
        }else if (dex > 14 && dex < 18){
            stealth = 2;
        }else{
            stealth = 3;
        }
        passivePerception = wis - 2;
        gold = ((int)(Math.random() * 10 + 1) * 10 + (int)(Math.random() * 10 + 1));
        if (dex < 4){ //initiativeMod assigner
            initiativeMod = -3;
        }else if (dex > 3 && dex < 7){
            initiativeMod = -2;
        }else if (dex > 6 && dex < 10){
            initiativeMod = -1;
        }else if (dex > 9 && dex < 12){
            initiativeMod = 0;
        }else if (dex > 11 && dex < 15){
            initiativeMod = 1;
        }else if (dex > 14 && dex < 18){
            initiativeMod = 2;
        }else{
            initiativeMod = 3;
        }
        player = new PlayerCharacter(name, height, age, hp, hp, con, str, dex, intelligence, wis, cha, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod);
    }
}
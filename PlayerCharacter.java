/**
 * Write a description of class PC here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class PlayerCharacter extends Character
{
    Scanner input = new Scanner(System.in);
    ArrayList<String> stats;
    String name, race, charClass;
    double height; // in meters
    int age, hpMax, hpCur, str, dex, intelligence, wis, cha, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod;
    public PlayerCharacter(String name, double height, int age, int hpMax, int hpCur, int con, int str, int dex, int intelligence, int wis, int cha, int speed, int acro, int arcana, int athletics, int deception, int insight, int intimidation, int investigation, int perception, int persuasion, int stealth, int passivePerception, int gold, int initiativeMod){
        super(name, height, age, hpMax, hpCur, con, str, dex, intelligence, wis, cha, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod);
        stats.add("Name: " + name);
        stats.add("Race: " + race);
        stats.add("Class: " + charClass);
        stats.add("Height: " + height);
    }
    public void attack(){
        System.out.println("Who would you like to attack? [type exact name] ");
        System.out.println("    Current opponents include:");
        //for (enemy i : enemyList){
            //System.out.println("        " + i);
        //}
        String target = input.nextLine().trim();
        System.out.println("Okay. What weapon would you like to use?");
        System.out.println("    Your weapons include:");
        //for (weapon i : weaponList){
            //System.out.println("        " + i);
        //}
        String weapon = input.nextLine().trim();
    }
}
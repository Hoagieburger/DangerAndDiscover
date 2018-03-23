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
    int ac, age, hpMax, hpCur, str, strMod, dex, dexMod, intelligence, intMod, wis, wisMod, cha, chaMod, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod;
    public PlayerCharacter(String name, double height, int age, int con, int str, int dex, int intelligence, int wis, int cha, int gold){
        super(name, height, age, con, str, dex, intelligence, wis, cha, gold);
        stats.add("Name: " + name);
        stats.add("Race: " + race);
        stats.add("Class: " + charClass);
        stats.add("Height: " + height);
    }
}
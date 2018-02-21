/**
 * Write a description of class PC here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.Scanner;
public class PlayerCharacter extends Character
{
    Scanner input = new Scanner(System.in);
    String name, race, charClass, alignment;
    double height; // in meters
    int age, hpMax, hpCur, str, dex, intelligence, wis, cha, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod;
    public PlayerCharacter(String name, double height, int age, int hpMax, int hpCur, int str, int dex, int intelligence, int wis, int cha, int speed, int strSave, int dexSave, int intSave, int wisSave, int chaSave, int acro, int animalHand, int arcana, int athletics, int deception, int insight, int intimidation, int investigation, int medicine, int nature, int perception, int persuasion, int religion, int slightOfHand, int stealth, int survival, int passivePerception, int copper, int silver, int gold, int platinum, int proficiency, int initiativeMod, int level){
        super(name, height, age, hpMax, hpCur, str, dex, intelligence, wis, cha, speed, strSave, dexSave, intSave, wisSave, chaSave, acro, animalHand, arcana, athletics, deception, insight, intimidation, investigation, medicine, nature, perception, persuasion, religion, slightOfHand, stealth, survival, passivePerception, copper, silver, gold, platinum, proficiency, initiativeMod, level);
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
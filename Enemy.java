/**
 * Abstract class Enemy - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public abstract class Enemy extends Character
{
    String name, race, charClass, alignment;
    double height; // in meters
    int armorClass, age, hpMax, hpCur, str, dex, intelligence, wis, cha, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod;
    public Enemy(String name, double height, int age, int hpMax, int hpCur, int con, int str, int dex, int intelligence, int wis, int cha, int speed, int acro, int arcana, int athletics, int deception, int insight, int intimidation, int investigation, int perception, int persuasion, int stealth, int passivePerception, int gold, int initiativeMod){
        super(name, height, age, hpMax, hpCur, con, str, dex, intelligence, wis, cha, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod);
    }
    public int getHP(){
        return hpCur;
    }
    public int getAC(){
        return armorClass;
    }
}
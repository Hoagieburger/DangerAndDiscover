/**
 * Abstract class Character - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public abstract class Character
{
    String name, race, charClass, alignment;
    double height; // in meters
    int age, hpMax, hpCur, con, str, dex, intelligence, wis, cha, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod;
    public Character(String name, double height, int age, int hpMax, int hpCur, int con, int str, int dex, int intelligence, int wis, int cha, int speed, int acro, int arcana, int athletics, int deception, int insight, int intimidation, int investigation, int perception, int persuasion, int stealth, int passivePerception, int gold, int initiativeMod){
        this.name = name;
        this.race = race;
        this.charClass = charClass;
        this.alignment = alignment;
        this.height = height;
        this.age = age;
        this.hpMax = hpMax;
        this.hpCur = hpCur;
        this.con = con;
        this.str = str;
        this.dex = dex;
        this.intelligence = intelligence;
        this.wis = wis;
        this.cha = cha;
        this.speed = speed;
        this.acro = acro;
        this.arcana = arcana;
        this.athletics = athletics;
        this.deception = deception;
        this.insight = insight;
        this.intimidation = intimidation;
        this.investigation = investigation;
        this.perception = perception;
        this.persuasion = persuasion;
        this.stealth = stealth;
        this.passivePerception = passivePerception;
        this.gold = gold;
        this.initiativeMod = initiativeMod;
    }
    public void modDex(int mod){
        dex += mod;
    }
    public void modCon(int mod){
        con += mod;
    }
    public void modStr(int mod){
        str += mod;
    }
    public void modInt(int mod){
        intelligence += mod;
    }
    public void modWis(int mod){
        wis += mod;
    }
    public void modCha(int mod){
        cha += mod;
    }
}
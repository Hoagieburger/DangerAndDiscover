/**
 * The abstract class Character is the base constuctor for entities that fight: the player and their enemies.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public abstract class Character
{
    private String name, race, charClass;
    private double height; // in meters
    private int ac, age, hpMax, hpCur, con, conMod, str, strMod, dex, dexMod, intelligence, intMod, wis, wisMod, cha, chaMod, speed, acro, arcana, athletics, deception, insight, intimidation, investigation, perception, persuasion, stealth, passivePerception, gold, initiativeMod;
    public Character(String name, double height, int age, int con, int str, int dex, int intelligence, int wis, int cha, int gold){
        this.name = name;
        this.race = race;
        this.charClass = charClass;
        this.height = height;
        this.age = age;
        this.con = con;
        this.str = str;
        this.dex = dex;
        this.intelligence = intelligence;
        this.wis = wis;
        this.cha = cha;
        this.gold = gold;
    }
    public void setHP(int hp){
        hpMax = hp;
        hpCur = hp;
    }
    public int getHP(){
        return hpCur;
    }
    public void modHP(int hpMod){
        hpCur += hpMod;
        if (hpCur > hpMax){
            hpCur = hpMax;
        }else if (hpCur < 0){
            hpCur = 0;
        }
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public void modDex(int mod){
        dex += mod;
    }
    public int getDex(){
        return dex;
    }
    public void modCon(int mod){
        con += mod;
    }
    public int getCon(){
        return con;
    }
    public void modStr(int mod){
        str += mod;
    }
    public int getStr(){
        return str;
    }
    public void modInt(int mod){
        intelligence += mod;
    }
    public int getInt(){
        return intelligence;
    }
    public void modWis(int mod){
        wis += mod;
    }
    public int getWis(){
        return wis;
    }
    public void modCha(int mod){
        cha += mod;
    }
    public int getCha(){
        return cha;
    }
    public int getDexMod(){
        return dexMod;
    }
    public void setDexMod(int newDexMod){
        dexMod = newDexMod;
    }
    public int getConMod(){
        return conMod;
    }
    public void setConMod(int newConMod){
        conMod = newConMod;
    }
    public int getStrMod(){
        return strMod;
    }
    public void setStrMod(int newStrMod){
        strMod = newStrMod;
    }
    public int getIntMod(){
        return intMod;
    }
    public void setIntMod(int newIntMod){
        intMod = newIntMod;
    }
    public int getWisMod(){
        return wisMod;
    }
    public void setWisMod(int newWisMod){
        wisMod = newWisMod;
    }
    public int getChaMod(){
        return chaMod;
    }
    public void setChaMod(int newChaMod){
        chaMod = newChaMod;
    }
    public void setAC(int newAC){
        ac = newAC;
    }
    public int getAC(){
        return ac;
    }
    public void setRace(String newRace){
        race = newRace;
    }
    public String getRace(){
        return race;
    }
    public void setClass(String newClass){
        charClass = newClass;
    }
    public String getCharClass(){
        return charClass;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setAcro(int newAcro){
        acro = newAcro;
    }
    public int getAcro(){
        return acro;
    }
    public void setArcana(int newArcana){
        arcana = newArcana;
    }
    public int getArcana(){
        return arcana;
    }
    public void setAthletics(int newAthletics){
        athletics = newAthletics;
    }
    public int getAthletics(){
        return athletics;
    }
    public void setDeception(int newDeception){
        deception = newDeception;
    }
    public int getDeception(){
        return deception;
    }
    public void setInsight(int newInsight){
        insight = newInsight;
    }
    public int getInsight(){
        return insight;
    }
    public void setIntimidation(int newIntimidation){
        intimidation = newIntimidation;
    }
    public int getIntimidation(){
        return intimidation;
    }
    public void setInvestigation(int newInvestigation){
        investigation = newInvestigation;
    }
    public int getInvestigation(){
        return investigation;
    }
    public void setPerception(int newPerception){
        perception = newPerception;
    }
    public int getPerception(){
        return perception;
    }
    public void setPersuasion(int newPersuasion){
        persuasion = newPersuasion;
    }
    public int getPersuasion(){
        return persuasion;
    }
    public void setStealth(int newStealth){
        stealth = newStealth;
    }
    public int getStealth(){
        return stealth;
    }
    public void setPassivePerception(int newPassivePerception){
        passivePerception = newPassivePerception;
    }
    public int getPassivePerception(){
        return passivePerception;
    }
    public void setInitiativeMod(int newInitiativeMod){
        initiativeMod = newInitiativeMod;
    }
    public int getInitiativeMod(){
        return initiativeMod;
    }
}
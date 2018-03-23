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
    public PlayerCharacter PlayerCharacterCreator(){
        int[] playerStats = new int[6];
        int ac = 0, str = 0, intelligence = 0, cha = 0, wis = 0, dex = 0, con = 0, strMod = 0, intMod = 0, chaMod = 0, wisMod = 0, dexMod = 0, conMod = 0, hp = 0, speed = 0, acro = 0, arcana = 0, athletics = 0, deception = 0, insight = 0, intimidation = 0, investigation = 0, perception = 0, persuasion = 0, stealth = 0, passivePerception = 0, gold = 0, initiativeMod = 0;
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
                if (i == 0){
                    proficiency = "str";
                    str += 2;
                }
            }else if (statResponse.equals("int") || statResponse.equals("intelligence")){
                intelligence = playerStats[i];
                if (i == 0){
                    proficiency = "int";
                    intelligence += 2;
                }
            }else if (statResponse.equals("wis") || statResponse.equals("wisdom")){
                wis = playerStats[i];
                if (i == 0){
                    proficiency = "wis";
                    wis += 2;
                }
            }else if (statResponse.equals("cha") || statResponse.equals("charisma")){
                cha = playerStats[i];
                if (i == 0){
                    proficiency = "cha";
                    cha += 2;
                }
            }else if (statResponse.equals("dex") || statResponse.equals("dexterity")){
                dex = playerStats[i];
                if (i == 0){
                    proficiency = "dex";
                    dex += 2;
                }
            }else if (statResponse.equals("con") || statResponse.equals("constitution") || statResponse.equals("constitution(heartiness)")){
                con = playerStats[i];
                if (i == 0){
                    proficiency = "con";
                    con += 2;
                }
            }
        }
        gold = ((int)(Math.random() * 10 + 1) * 10 + (int)(Math.random() * 10 + 1));
        player = new PlayerCharacter(name, height, age, con, str, dex, intelligence, wis, cha, gold);
        System.out.println("Choose your race: Human, Halfling, Elf, or Dwarf.");
        String race = input.nextLine().trim().toLowerCase();
        if (race.equals("human")){ // Race assignment
            Human pc = new Human(player);
        }else if (race.equals("halfling")){
            Halfling pc = new Halfling(player);
        }else if (race.equals("elf")){
            Elf pc = new Elf(player);
        }else if (race.equals("dwarf")){
            Dwarf pc = new Dwarf(player);
        }
        System.out.println("Choose your class: Wizard, Ranger, Barbarian.");
        String charClass = input.nextLine().trim().toLowerCase();
        if (charClass.equals("wizard")){ // Class assignment
            Wizard pCharacter = new Wizard(player);
        }else if (charClass.equals("ranger")){
            Ranger pCharacter = new Ranger(player);
        }else if (charClass.equals("barbarian")){
            Barbarian pCharacter = new Barbarian(player);
        }
        if (player.getCon() < 6){ //health assigner
            hp = 80 + (int)(Math.random() * 10 + 1);
        }else if (player.getCon() > 5 && player.getCon() < 11){
            hp = 90 + (int)(Math.random() * 10 + 1);
        }else if (player.getCon() > 10 && player.getCon() < 16){
            hp = 100 + (int)(Math.random() * 10 + 1);
        }else if (player.getCon() > 15){
            hp = 80 + (int)(Math.random() * 10 + 1);
        }
        player.setHP(hp);
        if (player.getDex()< 6){ //speed assigner
            speed = 25;
        }else if (player.getDex()> 5 && player.getDex()< 11){
            speed = 30;
        }else if (player.getDex()> 10 && player.getDex()< 16){
            speed = 35;
        }else if (player.getDex()> 15){
            speed = 40;
        }
        player.setSpeed(speed);
        if (player.getDex()< 4){ //acro assigner
            acro = -3;
        }else if (player.getDex()> 3 && player.getDex()< 7){
            acro = -2;
        }else if (player.getDex()> 6 && player.getDex()< 10){
            acro = -1;
        }else if (player.getDex()> 9 && player.getDex()< 12){
            acro = 0;
        }else if (player.getDex()> 11 && player.getDex()< 15){
            acro = 1;
        }else if (player.getDex()> 14 && player.getDex()< 18){
            acro = 2;
        }else{
            acro = 3;
        }
        player.setAcro(acro);
        if (player.getInt()< 4){ //arcana assigner
            arcana = -3;
        }else if (player.getInt()> 3 && player.getInt()< 7){
            arcana = -2;
        }else if (player.getInt()> 6 && player.getInt()< 10){
            arcana = -1;
        }else if (player.getInt()> 9 && player.getInt()< 12){
            arcana = 0;
        }else if (player.getInt()> 11 && player.getInt()< 15){
            arcana = 1;
        }else if (player.getInt()> 14 && player.getInt()< 18){
            arcana = 2;
        }else{
            arcana = 3;
        }
        player.setArcana(arcana);
        if (player.getStr()< 4){ //athletics assigner
            athletics = -3;
        }else if (player.getStr()> 3 && player.getStr()< 7){
            athletics = -2;
        }else if (player.getStr()> 6 && player.getStr()< 10){
            athletics = -1;
        }else if (player.getStr()> 9 && player.getStr()< 12){
            athletics = 0;
        }else if (player.getStr()> 11 && player.getStr()< 15){
            athletics = 1;
        }else if (player.getStr()> 14 && player.getStr()< 18){
            athletics = 2;
        }else{
            athletics = 3;
        }
        player.setAthletics(athletics);
        if (player.getCha()< 4){ //deception assigner
            deception = -3;
        }else if (player.getCha()> 3 && player.getCha()< 7){
            deception = -2;
        }else if (player.getCha()> 6 && player.getCha()< 10){
            deception = -1;
        }else if (player.getCha()> 9 && player.getCha()< 12){
            deception = 0;
        }else if (player.getCha()> 11 && player.getCha()< 15){
            deception = 1;
        }else if (player.getCha()> 14 && player.getCha()< 18){
            deception = 2;
        }else{
            deception = 3;
        }
        player.setDeception(deception);
        if (player.getWis()< 4){ //insight assigner
            insight = -3;
        }else if (player.getWis()> 3 && player.getWis()< 7){
            insight = -2;
        }else if (player.getWis()> 6 && player.getWis()< 10){
            insight = -1;
        }else if (player.getWis()> 9 && player.getWis()< 12){
            insight = 0;
        }else if (player.getWis()> 11 && player.getWis()< 15){
            insight = 1;
        }else if (player.getWis()> 14 && player.getWis()< 18){
            insight = 2;
        }else{
            insight = 3;
        }
        player.setInsight(insight);
        if (player.getCha()< 4){ //intimidation assigner
            intimidation = -3;
        }else if (player.getCha()> 3 && player.getCha()< 7){
            intimidation = -2;
        }else if (player.getCha()> 6 && player.getCha()< 10){
            intimidation = -1;
        }else if (player.getCha()> 9 && player.getCha()< 12){
            intimidation = 0;
        }else if (player.getCha()> 11 && player.getCha()< 15){
            intimidation = 1;
        }else if (player.getCha()> 14 && player.getCha()< 18){
            intimidation = 2;
        }else{
            intimidation = 3;
        }
        player.setIntimidation(intimidation);
        if (player.getInt()< 4){ //investigation assigner
            investigation = -3;
        }else if (player.getInt()> 3 && player.getInt()< 7){
            investigation = -2;
        }else if (player.getInt()> 6 && player.getInt()< 10){
            investigation = -1;
        }else if (player.getInt()> 9 && player.getInt()< 12){
            investigation = 0;
        }else if (player.getInt()> 11 && player.getInt()< 15){
            investigation = 1;
        }else if (player.getInt()> 14 && player.getInt()< 18){
            investigation = 2;
        }else{
            investigation = 3;
        }
        player.setInvestigation(investigation);
        if (player.getWis()< 4){ //perception assigner
            perception = -3;
        }else if (player.getWis()> 3 && player.getWis()< 7){
            perception = -2;
        }else if (player.getWis()> 6 && player.getWis()< 10){
            perception = -1;
        }else if (player.getWis()> 9 && player.getWis()< 12){
            perception = 0;
        }else if (player.getWis()> 11 && player.getWis()< 15){
            perception = 1;
        }else if (player.getWis()> 14 && player.getWis()< 18){
            perception = 2;
        }else{
            perception = 3;
        }
        player.setPerception(perception);
        if (player.getCha()< 4){ //persuasion assigner
            persuasion = -3;
        }else if (player.getCha()> 3 && player.getCha()< 7){
            persuasion = -2;
        }else if (player.getCha()> 6 && player.getCha()< 10){
            persuasion = -1;
        }else if (player.getCha()> 9 && player.getCha()< 12){
            persuasion = 0;
        }else if (player.getCha()> 11 && player.getCha()< 15){
            persuasion = 1;
        }else if (player.getCha()> 14 && player.getCha()< 18){
            persuasion = 2;
        }else{
            persuasion = 3;
        }
        player.setPersuasion(persuasion);
        if (player.getDex()< 4){ //stealth assigner
            stealth = -3;
        }else if (player.getDex()> 3 && player.getDex()< 7){
            stealth = -2;
        }else if (player.getDex()> 6 && player.getDex()< 10){
            stealth = -1;
        }else if (player.getDex()> 9 && player.getDex()< 12){
            stealth = 0;
        }else if (player.getDex()> 11 && player.getDex()< 15){
            stealth = 1;
        }else if (player.getDex()> 14 && player.getDex()< 18){
            stealth = 2;
        }else{
            stealth = 3;
        }
        player.setStealth(stealth);
        player.setPassivePerception(player.getWis() - 2);
        if (player.getDex()< 4){ //initiativeMod assigner
            initiativeMod = -3;
        }else if (player.getDex()> 3 && player.getDex()< 7){
            initiativeMod = -2;
        }else if (player.getDex()> 6 && player.getDex()< 10){
            initiativeMod = -1;
        }else if (player.getDex()> 9 && player.getDex()< 12){
            initiativeMod = 0;
        }else if (player.getDex()> 11 && player.getDex()< 15){
            initiativeMod = 1;
        }else if (player.getDex()> 14 && player.getDex()< 18){
            initiativeMod = 2;
        }else{
            initiativeMod = 3;
        }
        player.setInitiativeMod(initiativeMod);
        if (player.getCon() < 4){ //conMod assigner
            conMod = -3;
        }else if (player.getCon() > 3 && con < 7){
            conMod = -2;
        }else if (player.getCon() > 6 && player.getCon() < 10){
            conMod = -1;
        }else if (player.getCon() > 9 && player.getCon() < 12){
            conMod = 0;
        }else if (player.getCon() > 11 && player.getCon() < 15){
            conMod = 1;
        }else if (player.getCon() > 14 && player.getCon() < 18){
            conMod = 2;
        }else{
            conMod = 3;
        }
        player.setConMod(conMod);
        if (player.getStr()< 4){ //strMod assigner
            strMod = -3;
        }else if (player.getStr()> 3 && player.getStr()< 7){
            strMod = -2;
        }else if (player.getStr()> 6 && player.getStr()< 10){
            strMod = -1;
        }else if (player.getStr()> 9 && player.getStr()< 12){
            strMod = 0;
        }else if (player.getStr()> 11 && player.getStr()< 15){
            strMod = 1;
        }else if (player.getStr()> 14 && player.getStr()< 18){
            strMod = 2;
        }else{
            strMod = 3;
        }
        player.setStrMod(strMod);
        if (player.getDex()< 4){ //dexMod assigner
            dexMod = -3;
        }else if (player.getDex()> 3 && player.getDex()< 7){
            dexMod = -2;
        }else if (player.getDex()> 6 && player.getDex()< 10){
            dexMod = -1;
        }else if (player.getDex()> 9 && player.getDex()< 12){
            dexMod = 0;
        }else if (player.getDex()> 11 && player.getDex()< 15){
            dexMod = 1;
        }else if (player.getDex()> 14 && player.getDex()< 18){
            dexMod = 2;
        }else{
            dexMod = 3;
        }
        player.setDexMod(dexMod);
        if (player.getInt()< 4){ //intMod assigner
            intMod = -3;
        }else if (player.getInt()> 3 && player.getInt()< 7){
            intMod = -2;
        }else if (player.getInt()> 6 && player.getInt()< 10){
            intMod = -1;
        }else if (player.getInt()> 9 && player.getInt()< 12){
            intMod = 0;
        }else if (player.getInt()> 11 && player.getInt()< 15){
            intMod = 1;
        }else if (player.getInt()> 14 && player.getInt()< 18){
            intMod = 2;
        }else{
            intMod = 3;
        }
        player.setIntMod(intMod);
        if (player.getWis()< 4){ //wisMod assigner
            wisMod = -3;
        }else if (player.getWis()> 3 && player.getWis()< 7){
            wisMod = -2;
        }else if (player.getWis()> 6 && player.getWis()< 10){
            wisMod = -1;
        }else if (player.getWis()> 9 && player.getWis()< 12){
            wisMod = 0;
        }else if (player.getWis()> 11 && player.getWis()< 15){
            wisMod = 1;
        }else if (player.getWis()> 14 && player.getWis()< 18){
            wisMod = 2;
        }else{
            wisMod = 3;
        }
        player.setWisMod(wisMod);
        if (player.getCha()< 4){ //chaMod assigner
            chaMod = -3;
        }else if (player.getCha()> 3 && player.getCha()< 7){
            chaMod = -2;
        }else if (player.getCha()> 6 && player.getCha()< 10){
            chaMod = -1;
        }else if (player.getCha()> 9 && player.getCha()< 12){
            chaMod = 0;
        }else if (player.getCha()> 11 && player.getCha()< 15){
            chaMod = 1;
        }else if (player.getCha()> 14 && player.getCha()< 18){
            chaMod = 2;
        }else{
            chaMod = 3;
        }
        player.setChaMod(chaMod);
        return player;
    }
}
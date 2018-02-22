/**
 * Write a description of class GameRunner here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.Scanner;
import java.lang.Math;
public class GameRunner
{
    Scanner input = new Scanner(System.in);
    PlayerCharacter player;
    public GameRunner(){
        
    }
    public void PlayerCharacterCreator(){
        int[] playerStats = new int[6];
        System.out.println("What is your character's name? ");
        String name = input.nextLine().trim();
        System.out.println("How tall is your character? [in meters] ");
        double height = input.nextDouble();
        System.out.println("How old is your character? ");
        int age = input.nextInt();
        for (int i = 0; i < playerStats.length; i++){
            playerStats[i] = (int)(Math.random() * 20 + 1);
        }
        //player = new PlayerCharacter(name, height, age);
    }
}
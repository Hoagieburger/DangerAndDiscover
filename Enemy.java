/**
 * Abstract class Enemy - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public abstract class Enemy extends Character
{
    public Enemy(String name, double height, int age, int con, int str, int dex, int intelligence, int wis, int cha, int gold){
        super(name, height, age, con, str, dex, intelligence, wis, cha, gold);
    }
}
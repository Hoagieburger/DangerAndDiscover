/**
 * Write a description of class Fireball here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.lang.Math;
public class Fireball extends Spells
{
    public Fireball(){
        super();
        stats.add("Spell Range: 20 meters");
        stats.add("Damage Range: 10 - 30");
    }
    public int cast(){
        int damage = 6 + (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1); // 4d6 + 6
        return damage;
    }
}
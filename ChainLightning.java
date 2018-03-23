/**
 * Write a description of class ChainLightning here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.lang.Math;
public class ChainLightning extends Spells
{
    public ChainLightning(){
        stats.add("Spell Range: 50 meters");
        stats.add("Damage Range: 8 - 80");
    }
    public int cast(){
        //10d8 damage
        int damage = (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1);
        return damage;
    }
}
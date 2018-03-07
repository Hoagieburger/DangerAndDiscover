/**
 * Write a description of class MagicMissles here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.lang.Math;
public class MagicMissles extends Spells
{
    public MagicMissles(){
        super();
        stats.add("Spell Range: 40 meters");
        stats.add("Damage Range: 2 - 5");
    }
    public int cast(){//1d4 + 1
        int damage = 1 + (int)(Math.random() * 4 + 1);
        return damage;
    }
    public int hit(){
        int hit = 0;
        return hit;
    }
}
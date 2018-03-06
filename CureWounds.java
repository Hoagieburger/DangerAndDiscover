/**
 * Write a description of class CureWounds here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.lang.Math;
public class CureWounds extends Spells
{
    public CureWounds(){
        super();
        stats.add("Spell Range: 20 meters");
        stats.add("Healing Range: 10 - 25");
    }
    public int cast(){
        int healed = 10 + (int)(Math.random() * 16);
        return healed;
    }
}
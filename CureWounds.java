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
        stats.add("Spell Range: Touch");
        stats.add("Healing Range: 4 - 32");
    }
    public int cast(){//4d8
        int healed = 0;
        for (int i = 0; i < 5; i++){
            healed += (int)(Math.random() * 8 + 1);
        }
        return healed;
    }
}
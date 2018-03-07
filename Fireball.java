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
        stats.add("Spell Range: 50 meters");
        stats.add("Damage Range: 6 - 48");
    }
    public int cast(){//8d6
        int damage = 0;
        for (int i = 0; i < 9; i++){
            damage += (int)(Math.random() * 6 + 1);
        }
        return damage;
    }
}
/**
 * Write a description of class Disintegrate here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.lang.Math;
public class Disintegrate extends Spells
{
    public Disintegrate(){
        super();
        stats.add("Spell Range: 60");
        stats.add("Damage Range: 50 - 100");
    }
    public int cast(){ // 10d6 + 40
        int damage = 40;
        for (int i = 0; i < 11; i++){
            damage += (int)(Math.random() * 6 + 1);
        }
        return damage;
    }
}
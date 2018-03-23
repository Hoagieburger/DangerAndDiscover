/**
 * Write a description of class Blight here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.lang.Math;
public class Blight extends Spells
{
    public Blight(){
        stats.add("Spell Range: 10 meters");
        stats.add("Damage Range: 8 - 64");
    }
    public int cast(Enemy target){ //8d8 damage
        int damage = 0;
        for (int i = 0; i < 9; i++){
            damage += (int)(Math.random() * 8 + 1);
        }
        return damage;
    }
}
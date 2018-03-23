/**
 * Write a description of class SwordOrAxe here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class SwordOrAxe extends MeleeWeapon
{
    public SwordOrAxe(String name){
        super(name);
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Attack Range: ");
        stats.add("Damage Range: 7 - 25");
    }
    public int attack(){
        int damage = (int)(Math.random() * 10 + 1);
        damage += (int)(Math.random() * 10 + 1);
        damage += 5;
        return damage;
    }
    public boolean parry(){
        return false;
    }
}
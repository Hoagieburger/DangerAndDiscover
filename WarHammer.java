/**
 * Write a description of class WarHammer here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class WarHammer extends MeleeWeapon
{
    public WarHammer(String name){
        super(name);
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Attack Range: ");
        stats.add("Damage Range: 8 - 30");
    }
    public int attack(){
        int damage = (int)(Math.random() * 12 + 1);
        damage += (int)(Math.random() * 12 + 1);
        damage += 6;
        return damage;
    }
    public boolean parry(){
        return false;
    }
}
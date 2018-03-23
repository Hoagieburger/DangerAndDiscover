/**
 * Write a description of class Bow here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class Bow extends RangedWeapon
{
    public Bow(String name){
        super(name);
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Attack Range: ");
        stats.add("Damage Range: 9 - 20");
    }
    public int attack(){
        int damage = (int)(Math.random() * 12 + 1);
        damage += 8;
        return damage;
    }
    public boolean parry(){
        return false;
    }
}
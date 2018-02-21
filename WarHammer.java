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
    public WarHammer(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
        this.name = name;
        this.cost = cost;
        this.stats = stats;
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
/**
 * Write a description of class Crossbow here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class Crossbow extends RangedWeapon
{
    public Crossbow(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
        this.name = name;
        this.cost = cost;
        this.stats = stats;
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
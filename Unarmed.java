/**
 * Write a description of class Unarmed here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class Unarmed extends MeleeWeapon
{
    public Unarmed(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
        this.name = name;
        this.cost = cost;
        this.stats = stats;
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Attack Range: ");
        stats.add("Damage Range: 2 - 5");
    }
    public int attack(){
        int damage = (int)(Math.random() * 4 + 1);
        damage++;
        return damage;
    }
    public boolean parry(){
        return false;
    }
}
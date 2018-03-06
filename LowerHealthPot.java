/**
 * Write a description of class LowerHealthPot here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class LowerHealthPot extends HealthPot
{
    public LowerHealthPot(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
        this.name = name;
        this.cost = cost;
        this.stats = stats;
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Healing Range: 5 - 15");
    }
    public int heal(){
        int healAmount = (int)(Math.random() * 11 ) + 5;
        return healAmount;
    }
}
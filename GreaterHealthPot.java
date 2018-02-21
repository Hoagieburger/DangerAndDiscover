/**
 * Write a description of class GreaterHealthPot here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public class GreaterHealthPot extends HealthPot
{
    public GreaterHealthPot(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
        this.name = name;
        this.cost = cost;
        this.stats = stats;
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Healing Range: ");
    }
}
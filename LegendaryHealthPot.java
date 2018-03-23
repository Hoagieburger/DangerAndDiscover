/**
 * Write a description of class LegendaryHealthPot here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public class LegendaryHealthPot extends HealthPot
{
    public LegendaryHealthPot(String name){
        super(name);
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Healing Range: 30 - 50");
    }
    public int heal(){
        int healAmount = (int)(Math.random() * 21 ) + 30;
        return healAmount;
    }
}
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
    public GreaterHealthPot(String name){
        super(name);
        stats.add("Name: " + name);
        stats.add("Cost: " + cost);
        stats.add("Healing Range: 15 - 30");
    }
    public int heal(){
        int healAmount = (int)(Math.random() * 16 ) + 15;
        return healAmount;
    }
}
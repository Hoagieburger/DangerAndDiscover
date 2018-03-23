/**
 * Write a description of class NoArmor here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.List;
import java.util.ArrayList;
public class NoArmor extends Armor
{
    public NoArmor(String name){
        super(name);
        stats.add("Armor Benefit: None");
        acBonus = 0;
    }
    public boolean blocked(){
        return false;
    }
}
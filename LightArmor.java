/**
 * Write a description of class LightArmor here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.List;
import java.util.ArrayList;
public class LightArmor extends Armor
{
    public LightArmor(Character character, String name){
        super(name);
        stats.add("Armor Benefit: +11");
        cost = 10;
        acBonus = 11;
    }
    public boolean blocked(){
        return false;
    }
}
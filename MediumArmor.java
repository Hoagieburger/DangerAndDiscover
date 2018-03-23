/**
 * Write a description of class MediumArmor here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.List;
import java.util.ArrayList;
public class MediumArmor extends Armor
{
    public MediumArmor(Character character, String name){
        super(name);
        stats.add("Armor Benefits: +14");
        cost = 50;
        acBonus = 14;
    }
    public boolean blocked(){
        return false;
    }
}
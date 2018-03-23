/**
 * Abstract class Armor - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public abstract class Armor extends Item implements DefenseCommands
{
    int acBonus;
    public Armor(String name){
        super(name);
    }
    public int getACBonus(){
        return acBonus;
    }
}
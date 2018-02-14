/**
 * Abstract class Armor - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public abstract class Armor extends Item implements DefenseCommands
{
    public Armor(String name, int cost){
        super(name, cost);
    }
}
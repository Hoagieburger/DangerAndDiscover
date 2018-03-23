/**
 * Write a description of class Halfling here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Halfling extends Races
{
    public Halfling(Character character){
        super();
        character.modDex(2);
    }
}
/**
 * Write a description of class Dwarf here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Dwarf extends Races
{
    public Dwarf(Character character){
        super();
        character.modCon(2);
        character.modStr(1);
    }
}
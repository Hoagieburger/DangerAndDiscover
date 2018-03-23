/**
 * Write a description of class Barbarian here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Barbarian extends Classes
{
    public Barbarian(Character character){
        super();
        character.modStr(2);
        character.modCon(1);
        character.modWis(1);
    }
}
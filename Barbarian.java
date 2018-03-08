/**
 * Write a description of class Barbarian here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Barbarian
{
    public Barbarian(Character character){
        character.modStr(2);
        character.modCon(1);
        character.modWis(1);
    }
}
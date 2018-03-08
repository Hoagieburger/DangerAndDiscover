/**
 * Write a description of class Human here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Human
{
    public Human(Character character){
        character.modCon(1);
        character.modStr(1);
        character.modDex(1);
        character.modInt(1);
        character.modCha(1);
        character.modWis(1);
    }
}
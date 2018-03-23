/**
 * Write a description of class Ranger here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Ranger extends Classes
{
    public Ranger(Character character){
        super();
        character.modDex(2);
        character.modCha(1);
        character.modStr(1);
    }
}
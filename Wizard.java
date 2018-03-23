/**
 * Write a description of class Wizard here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Wizard extends Classes
{
    public Wizard(Character character){
        super();
        character.modInt(2);
        character.modWis(1);
    }
}
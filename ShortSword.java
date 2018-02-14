/**
 * Write a description of class ShortSword here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class ShortSword extends MeleeWeapon
{
    public ShortSword(String name, int cost){
        super(name, cost);
    }
    public int attack(){
        return 0;
    }
    public boolean parry(){
        return false;
    }
    public String getName(){
        return name;
    }
}
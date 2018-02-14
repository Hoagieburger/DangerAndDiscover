/**
 * Write a description of class ShortBow here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class ShortBow extends RangedWeapon
{
    public ShortBow(String name, int cost){
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
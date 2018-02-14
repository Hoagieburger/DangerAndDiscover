/**
 * Write a description of class LongBow here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class LongBow extends RangedWeapon
{
    public LongBow(String name, int cost){
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
/**
 * Write a description of class SwordOrAxe here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class SwordOrAxe extends MeleeWeapon
{
    public SwordOrAxe(String name, int cost){
        super(name, cost);
    }
    public int attack(){
        return 0;
    }
    public boolean parry(){
        return false;
    }
}
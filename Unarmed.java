/**
 * Write a description of class Unarmed here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class Unarmed extends MeleeWeapon
{
    public Unarmed(String name, int cost){
        super(name, cost);
    }
    public int attack(){
        return 0;
    }
    public boolean parry(){
        return false;
    }
}
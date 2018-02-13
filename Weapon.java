/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    public Weapon(String name){
        super(name);
    }
    public int attack(){
        return 0;
    }
    public boolean parry(){
        return false;
    }
}
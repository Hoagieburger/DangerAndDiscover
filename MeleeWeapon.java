/**
 * Write a description of class MeleeWeapon here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public abstract class MeleeWeapon extends Weapon
{
    public MeleeWeapon(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
    }
}
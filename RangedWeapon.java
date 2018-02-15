/**
 * Abstract class RangedWeapon - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public abstract class RangedWeapon extends Weapon
{
    public RangedWeapon(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
    }
}
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public abstract class Weapon extends Item implements WeaponInterface
{
    public Weapon(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
    }
}
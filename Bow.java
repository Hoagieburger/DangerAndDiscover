/**
 * Write a description of class Bow here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public class Bow extends RangedWeapon
{
    public Bow(String name, int cost, ArrayList<String> stats){
        super(name, cost, stats);
    }
    public int attack(){
        return 0;
    }
    public boolean parry(){
        return false;
    }
    public ArrayList getStats(){
        return stats;
    }
}
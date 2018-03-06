/**
 * Abstract class Spells - write a description of the class here
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
import java.util.ArrayList;
import java.util.List;
public abstract class Spells
{
    ArrayList<String> stats;
    public Spells(){
        stats = new ArrayList();
    }
    public ArrayList<String> getStats(){
        return stats;
    }
}
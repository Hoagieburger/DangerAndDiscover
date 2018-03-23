/**
 * Write a description of class PowerWordKill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PowerWordKill extends Spells
{
    public PowerWordKill(){
        stats.add("Spell Range: 20 meters");
        stats.add("Damage Range: Instantly kills target under 100 hp");
    }
    public int cast(Enemy target){
        int damage;
        if (target.getHP() <= 100){
            damage = 100;
        }else{
            damage = 0;
        }
        return damage;
    }
}
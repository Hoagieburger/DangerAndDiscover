/**
 * Write a description of class Item here.
 * 
 * @author Joshua Hergenroeder (base created by Wiebe)
 * @version v2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    String name;
    public Item(String name){
        this.name = name;
    }
}
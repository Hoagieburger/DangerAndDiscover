/**
 * Write a description of class ShopKeep here.
 *
 * @author Joshua Hergenroeder
 * @version v1
 */
public class ShopKeep extends NPC
{
    String storeType, storeName;
    public ShopKeep(String name, String storeType, String storeName){
        super(name);
        this.storeType = storeType;
        this.storeName = storeName;
    }
}
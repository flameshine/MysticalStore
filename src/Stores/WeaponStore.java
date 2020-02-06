package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.weaponStore.Crossbow;
import Items.weaponStore.Sword;
import Items.weaponStore.Axe;

public class WeaponStore extends Store {

    private Crossbow someCrossbow;
    private Sword someSword;
    private Axe someAxe;

    public WeaponStore() {
        someCrossbow = new Crossbow();
        someSword = new Sword();
        someAxe = new Axe();

        storeList.add(someCrossbow);
        storeList.add(someSword);
        storeList.add(someAxe);
    }

    private List <Item> storeList = new ArrayList();

    public int getCrossbowPrice() {
        return someCrossbow.getPrice();
    }

    public int getSwordPrice() {
        return someSword.getPrice();
    }

    public int getAxePrice() {
        return someAxe.getPrice();
    }

    @Override
    public List<Item> getStoreList() {
        return storeList;
    }

    @Override
    public void setStoreList(List<Item> storeList) {
        this.storeList = storeList;
    }
}
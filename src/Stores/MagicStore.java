package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.magicStore.Staff;
import Items.magicStore.Amulet;
import Items.magicStore.Powder;

public class MagicStore extends Store {

    private Staff someStaff;
    private Amulet someAmulet;
    private Powder somePowder;

    public MagicStore() {
        someStaff = new Staff();
        someAmulet = new Amulet();
        somePowder = new Powder();

        storeList.add(someStaff);
        storeList.add(someAmulet);
        storeList.add(somePowder);
    }

    private List <Item> storeList = new ArrayList();

    public int getStaffPrice() {
        return someStaff.getPrice();
    }

    public int getAmuletPrice() {
        return someAmulet.getPrice();
    }

    public int getPowderPrice() {
        return somePowder.getPrice();
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
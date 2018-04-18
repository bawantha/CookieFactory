package Inventory;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

public class MerchandisesInventory extends InventroryManager implements Runnable {

    private BlockingQueue<HashMap> productionLine;
    private  HashMap<String,Integer> Merchindisegoods=new HashMap<>(10);


    @Override
    public void run() {

    }
}

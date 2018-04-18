package Inventory;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

public class RawMaterialsInventory extends InventroryManager implements Runnable {

    private BlockingQueue<HashMap> productionLine;

    private  HashMap<String ,Integer> rawMaterilas=new HashMap<>(10);

    RawMaterialsInventory(BlockingQueue queue){
        this.setProductionLine(queue);
    }

    @Override
    public void run() {

    }


    public void setProductionLine(BlockingQueue<HashMap> productionLine) {
        this.productionLine = productionLine;
    }
}

package FactoryM;

import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdcutionLine extends  FactoryManager {
    private BlockingQueue<HashMap> productionLine=new ArrayBlockingQueue<>(10);

    ProdcutionLine(InvoiceManager manager){

    }


}

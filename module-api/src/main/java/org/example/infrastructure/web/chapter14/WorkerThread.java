package org.example.infrastructure.web.chapter14;

public class WorkerThread extends Thread{

    private Product product;

    private String name;

    public WorkerThread(Product product, String name) {
        this.product = product;
        this.name = name;
    }
    @Override
    public void run() {
        product.setNameSync(name);
    }
}

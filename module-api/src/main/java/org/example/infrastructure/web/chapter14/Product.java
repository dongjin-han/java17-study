package org.example.infrastructure.web.chapter14;

public class Product {
    private String name;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public synchronized void setNameSync(String name) {
        this.name = name;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("쓰레드명 : " + Thread.currentThread().getName() + " 상품이름 : " + getName());
    }

    public void setNameSyncBlock(String name) {
        synchronized (this) {
            this.name = name;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("쓰레드명 : " + Thread.currentThread().getName() + " 상품이름 : " + getName());
        }
    }
}

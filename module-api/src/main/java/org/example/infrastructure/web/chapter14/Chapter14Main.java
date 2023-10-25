package org.example.infrastructure.web.chapter14;

public class Chapter14Main {

    public static void main(String[] args) {


        var product = new Product();

        var workerThread1 = new WorkerThread(product, "상품명 원본");
        var workerThread2 = new WorkerThread(product, "상품명 바꿔 버리기");

        workerThread1.start();
        workerThread2.start();

    }




}

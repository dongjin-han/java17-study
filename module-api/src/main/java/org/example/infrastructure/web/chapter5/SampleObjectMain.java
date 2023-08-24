package org.example.infrastructure.web.chapter5;

public class SampleObjectMain {

    public static void main(String[] args) {

        var sampleObject = new SampleObject();

        System.out.println("샘플 " + sampleObject.i);

        var sampleRecord = new SampleRecord();
        var sampleRecord2 = new SampleRecord(10);
        var sampleRecord3 = new SampleRecord(10, 20L, "sample");


        System.out.println("샘플 record " + sampleRecord.i());
        System.out.println("샘플 record 2 " + sampleRecord2.i());
        System.out.println("샘플 record 3 " + sampleRecord3.i());
        System.out.println("샘플 record 3 sname " + sampleRecord3.getClass().getSimpleName()); // 오로지 클래스명
        System.out.println("샘플 record 3 cname " + sampleRecord3.getClass().getCanonicalName()); // import 에 쓰이는 패키지를 포함한 클래스명
        System.out.println("샘플 record 3 name " + sampleRecord3.getClass().getName()); // class로더에 의해 올라간 클래스명 (패키지 포함됨)
    }
}

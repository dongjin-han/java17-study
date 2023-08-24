package org.example.infrastructure.web.chapter5;

public record SampleRecord(
        int i,
        long l,
        String s

) {
    public SampleRecord() {
        this(20, 0L, "");
    }
    public SampleRecord(int i) {
        this(i, 0L, "");
    }
}

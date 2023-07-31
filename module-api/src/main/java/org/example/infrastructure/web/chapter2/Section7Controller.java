package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section7Controller {

    @GetMapping("/chapter2/section7/1")
    public String section7_1() {

        var input = """
                [자동 형 변환]
                기본 타입의 허용 범위 순은 아래와 같다.
                * byte < short, char < int < long < float < double
                값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 자동 형 변환이 일어난다.
                이를 promotion 이라고 하며, 오토 박싱이라고도 한다.
                그러나 byte 는 char 로 자동 형 변환되지 않는다. 그 이유는 char 는 음수를 표현하지 않기 때문이다.
                byte : -128 ~ 127
                char : 0 ~ 65535 (유니코드)
                
                byte byteValue = 10;
                int intValue = byteValue;
                System.out.println("intValue: " + intValue);
                
                char charValue = '가';
                intValue = charValue;
                System.out.println("가의 유니코드: " + intValue);
                
                intValue = 50;
                long longValue = intValue;
                System.out.println("longValue: " + longValue);
                
                longValue = 100;
                float floatValue = longValue;
                System.out.println("floatValue: " + floatValue);
                
                floatValue = 100.5F;
                double doubleValue = floatValue;
                System.out.println("doubleValue: " + doubleValue);
                """;

        byte byteValue = 10;
        int intValue = byteValue;
        int intValue1 = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        int intValue2 = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        long longValue1 = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        float floatValue1 = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);

        var result = """
                ==========
                intValue: %d
                가의 유니코드: %d
                longValue: %d
                floatValue: %.1f
                doubleValue: %.1f
                """.formatted(intValue1, intValue2, longValue1, floatValue1, doubleValue);

        return input.concat(result);
    }

}

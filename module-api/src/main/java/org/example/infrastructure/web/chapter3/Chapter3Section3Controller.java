package org.example.infrastructure.web.chapter3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Chapter3Section3Controller {

    @GetMapping("/chapter3/section3/1")
    public String chapter3_section3_1() {

        var input = """
                오버 플로우 : 타입이 허용하는 촤대값을 벗어나는 것
                언더 플로우 : 타입이 허용하는 최소값을 벗어나는 것
                
                정수타입 연산에서 오버/언더 플로우 시 에러가 나지않고 최소값 혹은 최대값으로 되돌아감을 유의하자.
                ex) byte value = 127;
                value++; // 오버플로우가 일어나서 value 는 -128 이 된다.
                value--; // 언더 플로우가 일어나서 value 는 127 이 된다.
                """;

        byte value = 127;
        byte value2 = 127;
        value2++;
        byte value3 = 127;
        value3++;
        value3--;
        var result = """
                ==========
                value: %d
                value2: %d
                value3: %d
                """.formatted(value, value2, value3);

        return input.concat(result);
    }

}

package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section5Controller {

    @GetMapping("/chapter2/section5/1")
    public String section5_1() {

        var input = """
                boolean stop = true;
                if (stop) {
                    System.out.println("중지합니다.");
                } else {
                    System.out.println("시작합니다.");
                }
                
                int x = 10;
                boolean result1 = (x == 20);
                boolean result2 = (x != 20);
                System.out.println("result1: " + result1);
                System.out.println("result2: " + result2);
                """;

        var stop = true;
        var stopString = "";
        if (stop) {
            stopString = "중지합니다.";
        } else {
            stopString = "시작합니다.";
        }

        var x = 10;
        var result1 = (x == 20);
        var result2 = (x != 20);

        var result = """
                ==========
                %s
                result1: %b
                result2: %b
                """.formatted(stopString, result1, result2);

        return input.concat(result);
    }

}

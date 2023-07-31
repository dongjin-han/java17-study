package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section3Controller {

    @GetMapping("/chapter2/section3/1")
    public String section3_1() {

        var input = """
                char c1 = 'A';
                char c2 = 65;
                char c3 = '가';
                char c4 = 44032;
                                
                System.out.println("c1: " + c1);
                System.out.println("c2: " + c2);
                System.out.println("c3: " + c3);
                System.out.println("c4: " + c4);
                """;

        char c1 = 'A';
        char c2 = 65;
        char c3 = '가';
        char c4 = 44032;

        var result = """
                ==========
                c1: %c
                c2: %c
                c3: %c
                c4: %c
                """.formatted(c1, c2, c3, c4);

        return input.concat(result);
    }

}

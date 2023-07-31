package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section4Controller {

    @GetMapping("/chapter2/section4/1")
    public String section4_1() {

        var input = """
                float var1 = 0.1234567890123456789f;
                double var2 = 0.1234567890123456789;
                                
                System.out.println("var1: " + var1);
                System.out.println("var2: " + var2);
                
                double var3 = 3e6;
                float var4 = 3e6F;
                double var5 = 2e-3;
                
                System.out.println("var3: " + var3);
                System.out.println("var4: " + var4);
                System.out.println("var5: " + var5);
                """;

        var var1 = 0.1234567890123456789f;
        var var2 = 0.1234567890123456789;
        var var3 = 3e6;
        var var4 = 3e6F;
        var var5 = 2e-3;

        var result = """
                ==========
                var1: %.8f
                var2: %.17f
                var3: %.1f
                var4: %.1f
                var5: %.3f
                """.formatted(var1, var2, var3, var4, var5);

        return input.concat(result);
    }

}

package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section8Controller {

    @GetMapping("/chapter2/section8/1")
    public String section8_1() {

        var input = """
                [강제 타입 변환]
                큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개에서 저장하는 것을 강제 타입 변환이라고 한다.
                이를 casting 이라 한다.
                캐스팅 연산자로 () 와 함께 사용한다.
                
                int var1 = 10;
                byte var2 = (byte) var1;
                System.out.println(var2);
                
                long var3 = 300;
                int var4 = (int) var3;
                System.out.println(var4);
                
                int var5 = 65;
                char var6 = (char) var5;
                System.out.println(var6);
                
                double var7 = 3.14;
                int var8 = (int) var7;
                System.out.println(var8);
                """;

        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);

        var result = """
                ==========
                var2: %d
                var4: %d
                var6: %c
                var8: %d
                """.formatted(var2, var4, var6, var8);

        return input.concat(result);
    }

}

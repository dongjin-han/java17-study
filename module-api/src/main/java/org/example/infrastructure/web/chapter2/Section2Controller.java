package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section2Controller {

    @GetMapping("/chapter2/section2/1")
    public String section2_1() {

        var input = """
                int var1 = 0b1011;
                int var2 = 0206;
                int var3 = 365;
                int var4 = 0xB3;
                                
                System.out.println("var1: " + var1);
                System.out.println("var2: " + var2);
                System.out.println("var3: " + var3);
                System.out.println("var4: " + var4);
                """;

        var var1 = 0b1011;
        var var2 = 0206;
        var var3 = 365;
        var var4 = 0xB3;

        var result = """
                ==========
                var1 : %d
                var2 : %d
                var3 : %d
                var4 : %d
                """.formatted(var1, var2, var3, var4);

        return input.concat(result);
    }

    @GetMapping("/chapter2/section2/2")
    public String section2_2() {

        var input = """
                byte var1 = -128;
                byte var2 = -30;
                byte var3 = 0;
                byte var4 = 30;
                byte var5 = 127;
                byte var6 = 128;
                                
                System.out.println("var1: " + var1);
                System.out.println("var2: " + var2);
                System.out.println("var3: " + var3);
                System.out.println("var4: " + var4);
                System.out.println("var5: " + var5);
                System.out.println("var6: " + var6);
                """;

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        // byte var6 = 128;

        var result = """
                ==========
                error: incompatible types: possible lossy conversion from int to byte
                        byte var6 = 128;
                """;

        return input.concat(result);
    }

    @GetMapping("/chapter2/section2/3")
    public String section2_3() {

        var input = """
                long var1 = 10;
                long var2 = 20L;
                long var3 = 100000000000;
                long var4 = 100000000000L;
                                
                System.out.println("var1: " + var1);
                System.out.println("var2: " + var2);
                System.out.println("var3: " + var3);
                System.out.println("var4: " + var4);
                """;

        long var1 = 10;
        long var2 = 20L;
        // long var3 = 100000000000;
        long var4 = 100000000000L;

        var result = """
                ==========
                error: integer number too large
                        long var3 = 100000000000;
                컴파일러는 정수 리터럴을 int 타입으로 간주하기 때문에 L or l 을 정수 리터럴 끝에 붙여 long 타입 값임을 컴파일러에게 알려주어야 한다.
                """;

        return input.concat(result);
    }

    @GetMapping("/chapter2/section2/4")
    public String section2_4() {

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

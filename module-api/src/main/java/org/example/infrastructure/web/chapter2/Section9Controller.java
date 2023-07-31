package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section9Controller {

    @GetMapping("/chapter2/section9/1")
    public String section9_1() {

        var input = """
                [연산식에서 자동 타입 변환]
                자바는 실행 성능 향상을 위해 컴파일 단계에서 연산을 수행한다.
                미리 바이트코드(bytecode)를 만드므로 실행 시 연산을 하지 않아 성능이 좋아진다.
                ex) byte result = 10 + 20;
                위 result 는 30 이라는 값으로 컴파일 시에 연산이 수행된다.
                                
                하지만 정수 리터럴이 아니라 변수가 피연산자로 사용되면 실행 시 연산을 수행한다.
                ex) byte x = 10;
                    byte y = 20;
                    // byte result = x + y; // 컴파일 에러
                    int result = x + y;
                    
                자바는 연산 속도 향상을 위해 피연산자를 4byte 로 저장한다.
                위와 같이 4byte 보다 작은 정수 타입은 4byte 인 int 타입으로 변환되는것이 특징이다.
                따라서 byte result 에 int 값을 저장할 수 없으므로 컴파일 에러가 난다.
                하지만 int 보다 큰 허용 범위를 가진 타입은 int 타입으로 변환되지 않는다.
                                
                byte result1 = 10 + 20;
                System.out.println("result1: " + result1);
                        
                byte v1 = 10;
                byte v2 = 20;
                int result2 = v1 + v2;
                System.out.println("result2: " + result2);
                        
                byte v3 = 10;
                int v4 = 100;
                long v5 = 1000L;
                long result3 = v3 + v4 + v5;
                System.out.println("result3: " + result3);
                        
                char v6 = 'A';
                char v7 = 1;
                int result4 = v6 + v7;
                System.out.println("result4: " + result4);
                System.out.println("result4(char): " + (char) result4);
                        
                int v8 = 10;
                int result5 = v8 / v4;
                System.out.println("result5: " + result5);
                        
                int v9 = 10;
                double result6 = v9 / 4.0;
                System.out.println("result6: " + result6);
                        
                int v10 = 1;
                int v11 = 2;
                double result7 = (double) v10 / v11;
                System.out.println("result7: " + result7);
                """;

        byte result1 = 10 + 20;
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3: " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4: " + result4);
        System.out.println("result4(char): " + (char) result4);

        int v8 = 10;
        int result5 = v8 / v4;
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;
        System.out.println("result7: " + result7);

        var result = """
                ==========
                result1: %d
                result2: %d
                result3: %d
                result4: %d
                result4(char): %c
                result5: %d
                result6: %.1f
                result7: %.1f
                """.formatted(result1, result2, result3, result4, (char) result4, result5, result6, result7);

        return input.concat(result);
    }

    @GetMapping("/chapter2/section9/2")
    public String section9_2() {

        var input = """
                [연산식에서 자동 타입 변환]
                자바에서 + 연산자는 두 가지 기능을 가지고 있다.
                모두 숫자일 경우에는 덧셈이고 문자열이 하나라도 피연산자에 있으면 나머지 피연산자도 문자열로 자동 변환되어
                문자열 결합 연산을 수행한다.
                                
                
                int result1 = 10 + 2 + 8;
                System.out.println("result1: " + result1);
               
                String result2 = 10 + 2 + "8";
                System.out.println("result2: " + result2);
               
                String result3 = 10 + "2" + 8;
                System.out.println("result3: " + result3);
               
                String result4 = "10" + 2 + 8;
                System.out.println("result4: " + result4);
               
                String result5 = "10" + (2 + 8);
                System.out.println("result5: " + result5);
                """;

        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);

        var result = """
                ==========
                result1: %d
                result2: %s
                result3: %s
                result4: %s
                result5: %s
                """.formatted(result1, result2, result3, result4, result5);

        return input.concat(result);
    }

}

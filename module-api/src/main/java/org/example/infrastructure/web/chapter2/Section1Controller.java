package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section1Controller {

    @GetMapping("/chapter2/section1/1")
    public String section1_1() {

        var input = """
                int value;
                                
                int result = value + 10;
                """;

        var result = """
                ==========
                value 가 초기화 되지 않았기 때문에 컴파일 에러 발생
                """;

        return input.concat(result);
    }

    @GetMapping("/chapter2/section1/2")
    public String section1_2() {

        var input = """
                int hour = 3;
                int minute = 5;
                                
                int totalMinute = (hour * 60) + minute;
                                
                System.out.println(hour + "시간 " + minute + "분");
                                
                System.out.println("총 " + totalMinute + "분");
                """;

        var hour = 3;
        var minute = 5;

        var totalMinute = (hour * 60) + minute;

        var result = """
                ==========
                %d시간 %d분
                                
                총 %d분
                """.formatted(hour, minute, totalMinute);

        return input.concat(result);
    }

    @GetMapping("/chapter2/section1/3")
    public String section1_3() {

        var input = """
                int x = 3;
                int y = 5;
                                
                System.out.println("x:" + x + ", y:" + y);
                                
                int temp = x;
                x = y;
                y = temp;
                                
                System.out.println("x:" + x + ", y:" + y);
                """;

        var x = 3;
        var y = 5;

        var result = """
                ==========
                x:%d, y:%d
                """.formatted(x, y);

        var temp = x;
        x = y;
        y = temp;

        result = result.concat("""
                x:%d, y:%d
                """.formatted(x, y));

        return input.concat(result);
    }
}

package org.example.infrastructure.web.chapter4;

import org.example.ApiApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Chapter4Controller {
    public static void main(String[] args) {
        System.out.println("eeee");
        SpringApplication.run(ApiApplication.class, args);
    }

    @GetMapping("/chapter4/section1/1")
    public String chapter4_section1_1() {

        var input = """
                [코드 실행 흐름 제어]
                자바 프로그램은 main() 메소드의 시작으로부터 아래로 실행하는 흐름을 가지고 있다.
                이 실행 흐름에서 개발자가 원하는 방향으로 바꿀 수 있도록 해주는 것이 흐름 제어문이다.
                                
                public static void main(String[] args) {
                // 실행 흐름
                }
                                
                                
                """;

        var result = """
                ==========
                자바는 어떻게 main() 메소드를 실행할 수 있을까?
                                
                main() 메소드를 보면 static 이라고 예약어가 붙은것을 볼 수 있다.
                자바 프로그램이 실행 될 때 static 이 붙은 모든 메소드, 변수들은 메모리의 static 영역에 올라가게 된다.
                이것들은 static 영역에 상주하게 되며 GC(가비지 컬렉터)에 의해 메모리에서 정리되지 않는다.
                즉, 자바 프로그램을 실행하는 것은 어떤 main() 메소드를 실행하라고 명령하는것이며
                이미 메모리에 올라가 있는 해당 main() 메소드를 찾아 실행하게 되는것이다.
                """;

        return input.concat(result);
    }

    @GetMapping("/chapter4/section3/1")
    public String chapter4_section3_1() {

        var input = """
                [switch 문]
                자바 12 이전
                switch(변수) {
                    case 값1: 
                        // case 값1 수행
                        break;
                    case 값2: 
                        // case 값2 수행
                        break;                
                    default:
                        // case default 수행  
                }
                break; 가 없다면 case 값1 일 경우에 case 값2, case default 에 해당하는것들이 다 실행된다.     
                                
                자바 12 이후
                switch(변수) {
                    case 값1, 값2 -> {
                        // case 값1 or case 값2 수행
                    }
                    case 값3 -> {
                        // case 값3 수행
                    }           
                    default -> {
                        // case default 수행  
                    }
                }
                                
                또한 자바12 이후부터는 switch 의 결과를 변수에 대입할 수 있다.
                                
                int i = switch(변수) {
                    case 값1, 값2 -> 100;
                    case 값3 -> {
                        int min = 120 - 값3;
                        yield = min; // 자바13부터 가능
                    }           
                    default -> {
                        200;
                    }
                };
                                
                위와 같이 중괄호를 사용하여 변수에 값을 대입할 때는 yield 를 사용해야 한다. 이 때, default case 는 반드시 존재해야 한다.
                """;

        int var = 10;
        int i = switch (var) {
            case 10 -> 100;
            case 11 -> {
                int min = 10 - var;
                yield min;
            }
            default -> throw new IllegalStateException("Unexpected value: " + var);
        };

        return input;
    }

    @GetMapping("/chapter4/section4/1")
    public String chapter4_section4_1() {

        var input = """
                [for 문]
                for (초기화식; 조건식; 증감식;) {
                    // do something . . .
                }
                이 때 for 문의 초기화식에 부동 소수점 방식의 float 타입을 쓰지 말아야 한다.
                증감식을 빼먹으면 무한 루프에 빠진다.
                EX)
                int j = 0;
                for (int i = 0; i < 10;) {
                    if (j < 20) {
                        System.out.println("i : " + i); // 20번 반복 
                    } else {
                        break;
                    }
                    j++;
                }
                                
                자바 5부터 향상된 for 문도 추가가 되었다.
                EX)
                String[] names = {"a", "b"};
                for (String str : names) {
                    // str 은 a, b 
                }
                이러한 문법은 아래와 같이 Iterable 을 가지고 동작한다.
                public static void example(List<String> words) {
                    Iterator var1 = words.iterator();
                                
                    while(var1.hasNext()) {
                        String word = (String)var1.next();
                        ...
                    }
                }
                """;

        var result = """
                """;

        return input.concat(result);
    }

    @GetMapping("/chapter4/section5/1")
    public String chapter4_section5_1() {

        var input = """
                [while 문]
                while (조건식) {
                // do something
                }
                
                int maxAttempt = 3;
                int attempt = 0;
                        
                while (attempt++ <= 3) {
                    System.out.println("출력 : " + attempt);
                }
                
                출력은 몇번 출력 될까요?
                                
                """;

        int maxAttempt = 3;
        int attempt = 0;

        while (attempt++ <= 3) {
            System.out.println("출력 : " + attempt);

        }

        var result = """
                ==========
                출력 : 1
                출력 : 2
                출력 : 3
                출력 : 4
                
                4번 출력됩니다.                
                """;

        return input.concat(result);
    }

    @GetMapping("/chapter4/section6/1")
    public String chapter4_section6_1() {

        var input = """
                [do-while 문]
                do {
                    // do something
                } while (조건식);
                
                while 문이랑 다르게 무조건 do 블록의 내용을 수행하고 조건문을 통과하면 다시 do 블록을 수행한다.
                

                                
                """;

        var result = """
                ==========
         
                """;

        return input.concat(result);
    }

    @GetMapping("/chapter4/section7/1")
    public String chapter4_section7_1() {

        var input = """
                [break / continue 문]
                for, while, do-while 문의 블록 안에서 종료할 용도로 break; 를
                하위 라인은 무시하고 다음 반복으로 넘어갈 때 사용할 용도로 continue; 를 사용한다
                
                break 문에 Label 을 이용해서 break Label; 처럼 사용할 수도 있다.
                """;

        var result = """
                ==========
         
                """;

        return input.concat(result);
    }

}

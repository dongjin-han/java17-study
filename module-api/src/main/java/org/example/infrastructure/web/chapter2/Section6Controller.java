package org.example.infrastructure.web.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Section6Controller {

    @GetMapping("/chapter2/section6/1")
    public String section6_1() {

        var input = """
                * 문자열 타입은 기본 타입(primitive type)이 아니라 참조 타입(reference type)이다.
                String name = "홍길동";
                String job = "프로그래머";
                                
                System.out.println(name);
                System.out.println(job);
                
                String str = "나는 \\"자바\\"를 배웁니다.";
                
                System.out.println(str);
                
                str = "번호\\t이름\\t직업";
               
                System.out.print("나는\\n");
                System.out.print("자바를\\n");
                System.out.print("배웁니다.");
                """;

        var name = "홍길동";
        var job = "프로그래머";
        var str = "나는 \"자바\"를 배웁니다.";
        var str2 = "번호\t이름\t직업";

        var result = """
                ==========
                %s
                %s
                %s
                %s
                나는
                자바를
                배웁니다.
                """.formatted(name, job, str, str2);

        return input.concat(result);
    }

    @GetMapping("/chapter2/section6/2")
    public String section6_2() {

        var input = """
                * 큰따옴표 3개로 감싸면(텍스트 블록) 이스케이프하거나 라인피드를 할 필요 없이 작성된 그대로 문자열로 저장된다.
                String str1 = \"\" +
                \"{\\n\" +
                \"\\t\\"id\\":\\"winter\\",\\n\" +
                \"\\t\\"name\\":\\"눈송이\\"\\n\" +
                \"}\";
                                
                String str2 = \"\"\"
                {
                    \"id\":\"winter\",
                    \"name\":\"눈송이\"
                }
                \"\"\";
                
                System.out.println(str1);
                System.out.println(\"----------\");
                System.out.println(str2);
                
                String str = \"\"\"
                나는 자바를 \\
                학습합니다.
                나는 자바 고수가 될 것입니다.
                \"\"\";
                
                System.out.println(str);
                """;

        var str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";
        var spliter = "----------";
        var str2 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;
        var str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 것입니다.
                """;

        var result = """
                ==========
                %s
                %s
                %s
                %s
                """.formatted(str1, spliter, str2, str);

        return input.concat(result);
    }

}

package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);  // 객체를 전달하는 것이 아닌 class를 전달해줌 어떤 bean을 추가할지 알려줌
                            // 어노테이션을 활용해서 context에 빈을 추가한다고 명시적으로 알려줌
        // context 생성시 어노테이션을 확인하여 추가함
        //-------------------------------------------------------------------------------------------
        //context에 bean을 알려줌

        Parrot p = context.getBean(Parrot.class);   // 동일 타입을 갖는 bean이 많을 경우 에러 발생 - bean메서드의 이름을 적어주기
        // context에서 bean을 가져옴 parrot.class타입의 오브젝트를 가져옴 - parrot class type의 Parrot 가져옴
        // 메드서의 전달인자는 Type을 의미함.
        p.setName("Jiji");
        System.out.println(p.getName());


    }
}

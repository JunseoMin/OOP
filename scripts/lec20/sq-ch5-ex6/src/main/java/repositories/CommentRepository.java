package repositories;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)  // 접근되는 class에 어노테이션 마킹하여 프로토타입 빈으로 생성
public class CommentRepository {
}

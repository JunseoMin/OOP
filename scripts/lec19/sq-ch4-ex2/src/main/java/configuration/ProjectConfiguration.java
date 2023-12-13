package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"proxies", "services", "repositories"}  // 컴포넌트 확인할 수 있는 위치 명시
)
public class ProjectConfiguration {
}

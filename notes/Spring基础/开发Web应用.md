### 视图控制器

某些场景下只需要跳转视图而不需要处理数据和业务逻辑时，可以实现WebMvcConfigurer接口重写addViewControllers方法添加视图控制器

比如说进入系统后直接跳转到欢迎页面

```java
package cn.shaonianyou.tacocloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 视图控制器
 * @date 2021/8/26
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}

```

### 视图模板库

| 模板                     | SpringBoot starter 依赖              |
| :----------------------- | :----------------------------------- |
| FreeMarker               | spring-boot-starter-freemarker       |
| Groovy Templates         | spring-boot-starter-groovy-templates |
| Java Server Pages（JSP） | 无（由Tomcat或Jetty提供）            |
| Mustache                 | spring-boot-starter-mustache         |
| Thymeleaf                | spring-boot-starter-thymeleaf        |

### 禁用模板缓存

模板缓存默认都是开启的，可以通过配置文件设置为false或者DevTools开发期自动禁用缓存

| 模板             | 启用/禁用缓存的属性          |
| :--------------- | :--------------------------- |
| FreeMarker       | spring.freemarker.cache      |
| Groovy Templates | spring.groovy.template.cache |
| Mustache         | spring.mustache.cache        |
| Thymeleaf        | spring.thymeleaf.cache       |


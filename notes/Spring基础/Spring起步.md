### mvnw

mvnw和mvnw.cmd是Maven包装器（wrapper）脚本。借助这些脚本，即便机器上没有安装Maven，也可以构建项目

![mvnw](https://cdn.jsdelivr.net/gh/JOKERZ22/image@master/20210825143804.png)

### SpringBoot starter

SpringBoot starter 依赖的特别之处在于它们本身并不包含库代码，而是传递性地拉取其他的库，有以下3个好处

* 构建文件会显著减小并且易于管理，因为这样不必为每个所需的依赖库都声明依赖；

* 我们能够根据它们所提供的功能来思考依赖，而不是根据库的名称。如果是开发Web应用，那么你只需要添加web starter就可以了，而不必添加一堆单独的库再编写Web应用；

* 我们不必再担心库版本的问题。你可以直接相信给定版本的SpringBoot，传递性引入的库的版本是兼容的。现在，你只需要关心使用的是哪个版本的SpringBoot就可以了；

### SpringBoot插件

pom文件中包含一个SpringBoot插件，有以下功能

* 它提供了一个Maven goal,允许我们使用Maven来运行应用；

* 它会确保依赖的所有库都会包含在可执行JAR文件中，并且能够保证它们在运行时类路径下是可用的；

* 它会在JAR中生成一个manifest文件，将引导类声明为可执行JAR的主类；

### @SpringBootApplication注解

@SpringBootApplication是一个组合注解，组合了以下3个注解

* @SpringBootConfiguration: 将该类声明为配置类，是@Configuration注解的特殊形式；

* @EnableAutoConfiguration: 启用SpringBoot的自动配置，让SpringBoot自动配置它认为我们会用到的组件；

* @CompoentScan: 启用组件扫描，自动发现@Component、@Controller、@Servcice 注解声明的类，将其注册到Spring应用上下文中；

### @WebMvcTest注解

将Controller注册到Spring容器中，提供Spring环境的支持，不必再加@SpringBootTest注解

### DevTools

不是IDE插件，不依赖于特定的IDE。仅用于开发，生产环境中会自动禁用，有如下功能：

* 代码变更后应用会自动重启；

* 当面向浏览器的资源（如模板、JavaScript、样式表）等发生变化时，会自动刷新浏览器；

* 自动禁用模板缓存；

* 如果使用H2数据库的话，内置了H2控制台；

#### 应用自动重启

对Java代码和属性文件做出修改时，DevTools会监控变更。JVM使用两个类加载器分别加载

* 1.Java代码、属性文件、"src/main/"路径下几乎所有内容 这些经常变化的内容；

* 2.依赖库 这些不太可能变化的内容；

监测到变更时，重新加载代码类加载器并重启Spring的应用上下文，依赖类加载器和JVM原封不动，减少启动时间；

依赖库变更时不生效，需手动重启应用

#### 浏览器自动刷新和禁用模板缓存

Thymeleaf和FreeMarker默认会缓存模板解析结果以提高性能，生产环境中有益，开发环境中不利，需修改配置文件手动禁止

DevTools会禁用模板引擎缓存

DevTools配合[LiveReload](http://livereload.com/)服务器的浏览器插件，可以实现自动刷新浏览器

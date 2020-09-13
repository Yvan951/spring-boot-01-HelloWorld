package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 运行SpringBoot应用的主程序
 * @SpringBootApplication 用来标注一个主程序，说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring应用的启动入口，需要将主类添加到参数当中
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}

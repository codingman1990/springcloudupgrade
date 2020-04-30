package com.codingman.springcloudupgrade;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootApplication
public class SpringcloudupgradeApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        //SpringApplication.run(SpringcloudupgradeApplication.class, args);
        Method method = SpringcloudupgradeApplication.class.getMethod("test");
        GetMapping getMapping = method.getDeclaredAnnotation(GetMapping.class);
        System.out.println(RequestMapping.class.isInstance(getMapping));
        System.out.println(getMapping.annotationType().isAnnotationPresent(RequestMapping.class));
        AnnotatedElementUtils.findMergedAnnotation(method, RequestMapping.class);
    }

    @GetMapping
    public void test() {

    }

}

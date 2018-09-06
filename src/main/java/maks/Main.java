package maks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =new AnnotationConfigApplicationContext(Config.class);
        while (true){
            annotationConfigApplicationContext.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(300);
        }
    }
}

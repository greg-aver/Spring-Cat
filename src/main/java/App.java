import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloFirst =
                (HelloWorld) context.getBean("helloworld");
//        System.out.println(beanHelloFirst.getMessage());
        HelloWorld beanHelloSecond =
                (HelloWorld) context.getBean("helloworld");
        System.out.println(
                "beanHelloFirst = beanHelloSecond is " + (beanHelloFirst == beanHelloSecond));

        Cat catFirst = (Cat) context.getBean("cat");
        Cat catSecond = (Cat) context.getBean("cat");
        System.out.println(
                "catFirst = catSecond is " + (catFirst == catSecond));
    }
}
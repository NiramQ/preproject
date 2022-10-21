import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean_1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_1);
        HelloWorld bean_2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_1 == bean_2);
        System.out.println(bean_2);
        Cat beanCat_1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat_1);
        Cat beanCat_2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat_1 == beanCat_2);
        System.out.println(beanCat_2);
    }
}
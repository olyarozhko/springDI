import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.MinusService;
import services.PlusService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MinusService minusService = context.getBean("minusServiceBean", MinusService.class);
        PlusService plusService = context.getBean("plusServiceBean", PlusService.class);
        Calculator calculator = context.getBean("calculatorBean", Calculator.class);

        System.out.println("Xml-configuration:");
        System.out.println("num1 = 3.0, num2 = 2.0: " + new Calculator(plusService, minusService)
                .calculate(3.0, 2.0));
        System.out.println("num1 = 1.0, num2 = 2.0: " + calculator.calculate(1.0, 2.0));

        System.out.print("\nJava Annotations-configuration:\n");
        ApplicationContext appContext = new AnnotationConfigApplicationContext("services");
        System.out.println("num1 = 2.5, num2 = 4.5: " + new Calculator(appContext.getBean(PlusService.class),
                appContext.getBean(MinusService.class)).calculate(2.5, 4.5));
        System.out.println("num1 = 5.5, num2 = 3.5: " + new Calculator(appContext.getBean(PlusService.class),
                appContext.getBean(MinusService.class)).calculate(5.5, 3.5));

        System.out.print("\nJava Code-configuration:\n");
        ApplicationContext appContext2 = new AnnotationConfigApplicationContext(Calculator2Config.class);
        System.out.println("num1 = 5, num2 = 4: " + appContext2.getBean(Calculator2.class).calculate(5, 4));
        System.out.println("num1 = 3, num2 = 4: " + appContext2.getBean(Calculator2.class).calculate(3, 4));
    }
}

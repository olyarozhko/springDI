import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services2.MinusService2;
import services2.PlusService2;

@Configuration
public class Calculator2Config {

    @Bean
    public Calculator2 calculator() {
        Calculator2 calculator = new Calculator2();
        calculator.setPlus(plus());
        calculator.setMinus(minus());
        return calculator;

    }

    @Bean
    public PlusService2 plus() {
        return new PlusService2();
    }

    @Bean
    public MinusService2 minus() {
        return new MinusService2();
    }
}

package services2;

import org.springframework.stereotype.Component;

@Component
public class MinusService2 {

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }
}

package services;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MinusService implements OperationService {

    @Override
    public Double operation(Double number1, Double number2) {
        return number1 - number2;
    }
}

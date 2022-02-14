import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import services.MinusService;
import services.PlusService;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {

    private PlusService plus;
    private MinusService minus;

    public Double calculate(Double number1, Double number2) {
        if (number1 > number2) {
            return minus.operation(number1, number2);
        } else {
            return plus.operation(number1, number2);
        }
    }
}

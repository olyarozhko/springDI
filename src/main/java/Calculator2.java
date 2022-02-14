import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import services2.MinusService2;
import services2.PlusService2;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator2 {

    private PlusService2 plus;
    private MinusService2 minus;

    public Integer calculate(Integer number1, Integer number2) {
        if (number1 > number2) {
            return minus.minus(number1, number2);
        } else {
            return plus.plus(number1, number2);
        }
    }
}

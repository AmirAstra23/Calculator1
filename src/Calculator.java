import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    Integer result;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = this::apply;

    private Integer apply(Integer x, Integer y) {

        if (y != 0) {
            result = x / y;
        } else {
            System.out.println("Ошибка! На ноль делить нельзя!\nПрограмма завершена");
            System.exit(0);
        }
        return result;
    }

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;


}

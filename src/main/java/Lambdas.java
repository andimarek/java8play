import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambdas {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long count = list.stream().filter(x -> x > 5).count();
        System.out.println(count);
    }
}

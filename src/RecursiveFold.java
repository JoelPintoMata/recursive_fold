import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecursiveFold {

    public static void main(String[] args) {

        List<Integer> data1 = Arrays.asList(1, 4, 7);
        List<Integer> data2 = Arrays.asList(123, -2, 477, 3, 14, 6551);

        RecursiveFold obj = new RecursiveFold();

        int result = obj.fold(data1);
        System.out.println(result);

        int yourAnswer = obj.fold(data2);
        System.out.println(yourAnswer);
    }

    private int fold(List<Integer> input) {
        if(input.size() == 1)
            return input.get(0);
        else {
            int current = input.get(0);
            List<Integer> inputAux = input.subList(1, input.size())
                    .stream().map(x ->
                        x + current
                    ).collect(Collectors.toList());
            return fold(inputAux);
        }
    }
}

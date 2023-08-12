
import java.util.ArrayList;
import java.util.List;

public class _02PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            if (i > 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        _02PascalsTriangle Pascals = new _02PascalsTriangle();
        System.out.println(Pascals.generate(5));

    }
}

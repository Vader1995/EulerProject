package net.jarydrester.euler.models.solutions;

import net.jarydrester.euler.R;
import net.jarydrester.euler.models.Problem;

public class MultiplesOfThreeAndFive extends Problem {

    public MultiplesOfThreeAndFive() {
        super(1, R.string.multiple_of_3_and_5_summary, R.string.multiple_of_3_and_5_description);
    }
    @Override
    public String solve(String input) {
        try {
            int value = Integer.parseInt(input);
            return String.valueOf(solve(value));
        } catch (NumberFormatException ex) {
            return "Please only enter an integer";
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }

    private int solve(int threshold) {
        int sum = 0;
        for (int i = 1; i < threshold; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

package net.jarydrester.euler.models.solutions;

import net.jarydrester.euler.R;
import net.jarydrester.euler.models.Problem;

public class LargestPrimeFactor extends Problem {

    public LargestPrimeFactor() {
        super(3, R.string.largest_prime_factor_summary, R.string.largest_prime_factor_description);
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

    private int solve(int product) {
        if (product < 2) {
            throw new IllegalArgumentException("Please enter an integer greater than 1");
        }
        int factor = 2;
        while (product != 1) {
            while (product % factor == 0) {
                product /= factor;
            }
            factor++;
        }
        return factor - 1;
    }
}

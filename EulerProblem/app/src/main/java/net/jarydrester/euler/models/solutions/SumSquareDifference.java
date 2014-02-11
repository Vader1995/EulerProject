package net.jarydrester.euler.models.solutions;

import net.jarydrester.euler.models.Problem;
import net.jarydrester.euler.R;
import java.util.ArrayList;


public class SumSquareDifference extends Problem {
    public SumSquareDifference() {
        super(6, R.string.sum_square_difference_summary, R.string.sum_square_difference_description);
    }

    @Override
    public String solve(String input) {
        try {
            ArrayList<Integer> list = new ArrayList<Integer>();
            String[] inputSplit = input.split(" ");
            for(String i: inputSplit){
                list.add(Integer.parseInt(i));
            }
            return String.valueOf(solve(list));
        }catch (NumberFormatException ex) {
            return "Please only enter integers";
        }
        catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }

    private int solve(ArrayList<Integer> list) {
        if(list.size() < 2) throw new IllegalArgumentException("Please enter in more than one integer.");

        int squareOfNum=0;
        int sum=0;

        //Each iteration will add the next value of the array list to the two sums
        for(int i : list){
            squareOfNum += (i*i); // adds the number squared to the squareOfNum
            sum += i; // adds the number to the sumSquared
        }

        return ((sum*sum-squareOfNum)); //squares sum and subtracts squaredSum
    }
}

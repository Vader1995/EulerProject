package net.jarydrester.euler.models.solutions;

import net.jarydrester.euler.R;
import net.jarydrester.euler.models.Problem;


public class LargestPalindromeProject extends Problem {

    public LargestPalindromeProject() {
        super(4, R.string.largest_palindrome_product_summary, R.string.largest_palindrome_product_description);
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

    private int solve(int value) {
        /* Illegal Argument exceptions */
        if(value < 2) throw new IllegalArgumentException("Please enter an integer greater than 1");
        if(value > 7) throw new IllegalArgumentException("Please enter an integer less than 7.");

        int palindrome=0;
        int multiple;
        int min=(int)Math.pow(10,(value-1));
        int max=(int)Math.pow(10,value)-1;
        for(int first=max; first > min; first--){
            for(int second=max; second > min; second--){
                multiple=first*second;
                if(multiple < palindrome){
                    break;
                }
                if(multiple > palindrome && multiple==reversed(multiple)){
                    //System.out.println(first+"*"+second+"="+multiple);
                    palindrome=multiple;
                }
            }
        }
        return palindrome;
    }
    private int reversed(int multiple){
        int newNum=0;
        while(multiple != 0){
            newNum=newNum*10+multiple%10;
            multiple/=10;
        }
        return newNum;
    }
}

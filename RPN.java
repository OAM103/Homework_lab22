
import java.util.Scanner;
import java.util.Stack;

public class RPN{

    public static void eval(String S) {
        String[] str_s = S.split(" ");
        Stack<Double> stack = new Stack<>();
        for (String str : str_s) {
            try {
                if (str.equals("+")) {
                    double val2 = stack.pop();
                    double val1 = stack.pop();
                    double result = val1 + val2;
                    stack.push(result);

                } else if (str.equals("-")) {
                    double val2 = stack.pop();
                    double val1 = stack.pop();
                    double result = val1 - val2;
                    stack.push(result);

                } else if (str.equals("/")) {
                    double val2 = stack.pop();
                    double val1 = stack.pop();
                    double result = val1 / val2;
                    stack.push(result);

                } else if (str.equals("*")) {
                    double val2 = stack.pop();
                    double val1 = stack.pop();
                    double result = val1 * val2;
                    stack.push(result);

                } else {
                    stack.push(Double.parseDouble(str));
                }

            }catch (IllegalArgumentException e){
                continue;
            }
        }
        double result = stack.pop();
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        eval(S);

    }
}


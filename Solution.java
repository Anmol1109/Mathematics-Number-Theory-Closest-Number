import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the closestNumber function below.
     */
    static int closestNumber(int a, int b, int x) {
        if(b < 0){
            if(a == 1){
                if(x == 1)
                    return 1;
                else
                    return 0;
            }
            else
                return 0;
        }
        else{
            if(a == 1){
                if(x == 1)
                    return 1;
                else
                    return 0;
            }
            else{
                int k = (int)Math.pow(a,b) %  x;
                if(x < 2*k)
                    return (int)(Math.pow(a,b) - k + x);
                else
                    return (int)(Math.pow(a,b) - k);
            }
        }
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] abx = scanner.nextLine().split(" ");

            int a = Integer.parseInt(abx[0].trim());

            int b = Integer.parseInt(abx[1].trim());

            int x = Integer.parseInt(abx[2].trim());

            int result = closestNumber(a, b, x);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

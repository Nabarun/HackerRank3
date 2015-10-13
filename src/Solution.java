import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int askNum(int num){
        int sum =0;
        String numbers=null;
        Scanner s = new Scanner(System.in);
        numbers = s.nextLine();
        StringTokenizer strToken = new StringTokenizer(numbers);
        
        while (strToken.hasMoreTokens()) {          
            int n = Integer.parseInt(strToken.nextToken());
            if(!(n>0 && n<1001)){
                return -1;
            }
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num;
        int sum;
        num = in.nextInt();
        if(!(num>0 && num < 1001)){
            return;
        }
        sum = askNum(num);
        if(sum == -1){
            return;
        }
            
        System.out.println(sum);
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        int limit;
        for(int i=0; i<testCase; i++) {
            limit = scan.nextInt();
            System.out.println(multiple3or5sum(limit));
        }
        scan.close();
    }
    
    private static long multiple3or5sum(int limit) {
        return sum(3, limit) + sum(5, limit) - sum(15, limit);
    }
    
    private static long sum(int limit, int number) {
        long size = (number -1 ) / limit;
        return limit * size * (size + 1) / 2;
    }
}

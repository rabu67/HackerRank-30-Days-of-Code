import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        public static void main(String[] args)
        {

                Scanner scan=new Scanner(System.in);
                int n=scan.nextInt();
                int res=factorial(n);
                System.out.println(res);
        }
      static int factorial(int n)
        {
                for(int i=n-1;i>=1;i--)
                {
                        n=n*i;
                }
                return n;
        }
}
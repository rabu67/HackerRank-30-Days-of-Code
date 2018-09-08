import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            //System.out.println(n);
            String s="";
            for(int i=0;i<n;i++)
            {
                    s=scan.next();
                    char[] ch=s.toCharArray();
                    for(int j=0;j<ch.length;j++)
                    {
                            if(j%2==0)
                            {
                                    System.out.print(ch[j]);
                            }
                    }
                    System.out.print(" ");
                    for(int k=0;k<ch.length;k++)
                    {
                            if(k%2!=0)
                            {
                                    System.out.print(ch[k]);
                            }
                    }
                    System.out.println(" ");
            }
    }
}
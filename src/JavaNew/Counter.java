package JavaNew;

import java.util.Scanner;

public class Counter {
    public static void main(String args[]) {
     
    Scanner sc=new Scanner(System.in);
    String sa=sc.next();
    String sb=sc.next();
    int len1=sa.length();
     int len2=sb.length();
     for(int i=0;i<sb.length();i++)
     {
      for(int j=0;j<sa.length();j++)
      {
          if(sb.charAt(i)==sa.charAt(j))
          {
              len1--;
              len2--;
             sa= sa.substring(0,j)+sa.substring(j+1,sa.length());
             break;
          }
      }
     }
     System.out.print(len1+len2);
    }
}

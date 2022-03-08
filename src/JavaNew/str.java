import java.util.Arrays;  
public class str{    
public static void main(String args[]){ 
int n=28; 
String a="";
for(int i=1;i<=n/2;i++)
{
 if(n%i==0)
{
a=a+Integer.toString(i)+",";
}
}
a=a.substring(0,a.length()-1);
System.out.println("string is:"+a);

} 
}
import java.util.Arrays;  
public class Repitations{    
public static void main(String args[]){  
int count=1;
int a[]={5,5,5,7,7,1,2,3,4,1}; 
System.out.println(a.length); 
for(int i=0;i<a.length-1;i++)
{
if(a[i]==a[i+1])
{
count++;
}
else
{
if(count>1)
{
System.out.println("("+a[i]+","+count+")");
count=1;
}
else
{
System.out.println(a[i]); 
}
}

} 
if(a[a.length-1]==a[a.length-2])
{
System.out.println("("+a[a.length-1]+","+count+")");
}
else
{
System.out.println(a[a.length-1]); 
}

 
}} 
package JavaNew;

public class Permutation {


	public static void main(String[] args) {
		
		String str = "qwerty".toLowerCase();
        int n = str.length();
        char c[]=new char[n];
        for(int i=0;i<n;i++)
        {
        	c[i]=str.charAt(i);
        }
        permutate(c,0,n);
	}

	private static void permutate(char[] str, int start, int end) {
		int i;
		if(start == end)
		{
            System.out.println(str);
            if(checkPalin(str)=="Palindrome")
            {
            	System.out.println(checkPalin(str));
            }
            
		}
		 else
	        {
	                for(i=start;i<end;i++)
	                {
	                        swap(str,start,i);
	                        permutate(str,start+1,end);
	                        swap(str,start,i);
	                }
	        }
	}

	private static String checkPalin(char[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			if(i==str.length/2)
			{
				return "Palindrome";
			}
			else
			{
				if(str[i]!=str[str.length-1-i])
				{
					return "Not Palindrome";
				}
			}
		}
		return "Not Palindrome";
	}

	private static void swap(char[] str,int c, int d) {
		if(c!=d)
		{
			
				char temp=str[c];
				str[c]=str[d];
				str[d]=temp;
		}
		
	}

}

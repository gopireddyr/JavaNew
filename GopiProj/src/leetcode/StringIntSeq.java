package leetcode;
public class StringIntSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="9999991000000";
		if(s.length()>=2)
		{
			System.out.println(getseq(s));
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}
	static boolean getseq(String s)
	{
		int count1=0;
		int count2=0;
		char[] c=s.toCharArray();
		for(int i=0;i<s.length()/2;i++)
		{
			count1=Integer.parseInt(s.substring(0,i+1))+1;
			for(int j=i+1;j<s.length();j++)
			{
				count2=count2*10+Character.getNumericValue(c[j]);
				if(count1==count2)
				{
					count1=count2+1;
					count2=0;
					if(j>=c.length-1)
					{
						return true;
					}
				}
				else if(count1>count2)
				{
					continue;
				}
				else {
					count2=0;
					break;
				}
			}
		}
		return false;
	}
}
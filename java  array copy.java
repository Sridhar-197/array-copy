/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
	    char[] copyFrom={ 'g','r','e','a','t','t','e','r','v','p','r','o','i','s','h','e','r','e'};
	     char[] copyTo=new char[7];
	     System.arraycopy(copyFrom, 5,copyTo,0,7);//2 nd t start la aagum.
	    
		System.out.println(String.valueOf(copyTo));
	}
}

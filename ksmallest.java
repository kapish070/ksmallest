import java.util.*;
public class ksmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    while(a>0)
    {
    	int d=0,count=0;
    	int size=sc.nextInt();
    	int b[]=new int[size];
    	for(int i=0;i<size;i++)
    	{
    		b[i]=sc.nextInt();
    	}
    	int c=sc.nextInt();
    	Arrays.sort(b);
    	for(int i=0;i<size;i++)
    	{
    			if(b[i]<b[i+1])
    			{
    				d=b[i];
    				count++;
    				if(count==c)
    				{
    					break;
    				}
    			}
    		
    		
    	}
    	System.out.print(d);
    	a--;
    }
	}

}

/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int count=0;
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	   for(int j=i+1;j<n;j++)
	   {
	       for(int k=j+1;k<n;k++)
	       {
	           if(a[i]<a[j] && a[j]<a[k])
	           {
	               //System.out.print(a[i]+" "+a[j]+" "+a[k]);
	               //System.out.println();
	               count++;
	           }
	       }
	   }
	}
	System.out.print(count);
	}
}

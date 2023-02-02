import java.util.Scanner;
class MenuDriven
{

  public static void main(String args[])
  {
     int arr[]={4,6,44,21,76,6,11,22};
	 
	 Scanner sc=new Scanner(System.in);
	 int y=sc.nextInt();
	 
	 switch(y)
	 {
		 case 1:
		 {
			  int a=arr.length;
	   int x=22;
	   int res=bs(arr,x,0,a-1);
	   
	   if(res==-1)
		   System.out.println("not found");
	   else
		   System.out.println("the element is found at index "+res);
		 }
		 
		 case 2:
		 {
			  int x=search(arr,4);
        if(x==-1)
        System.out.println("element not found in the array");
        else
        System.out.println("found at index: "+ x);
		 }
		 default:
		  System.out.println("please enter 1 or 2");
	 }
	 
  
  }
  
   static int bs(int arr[], int x, int l, int h)
  {
  
    while(l<=h)
	{
		int m=l+(h-l)/2;
		if (arr[m]==x)
			return m;
		
		if(arr[m]<x)
		  l=m+1;
	  else
		  h=m-1;
	}
	return -1;
   
  }
  
  
   public static int search(int arr[],int a)
    {  
        int i;
       for( i=0;i<arr.length;i++)
       {
        if(arr[i]==a)
        {
            return i;
            
        }
        
       }
       return -1;

    }
}
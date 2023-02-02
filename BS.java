class BS{

  int bs(int arr[], int x, int l, int h)
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
   public static void main(String args[])
   {
	   BS ob=new BS();
	   int arr[]={4,6,44,21,76,6,11,22};
	   int a=arr.length;
	   int x=22;
	   int res=ob.bs(arr,x,0,a-1);
	   
	   if(res==-1)
		   System.out.println("not found");
	   else
		   System.out.println("the element is found at index "+res);
   }
}
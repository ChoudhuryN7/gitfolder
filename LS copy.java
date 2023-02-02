class LS
{

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
    public static void main(String args[])
    {
        int arr[]= new int[]{1,2,3,45,3};
       

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int x=search(arr,45);
        if(x==-1)
        System.out.println("element not found in the array");
        else
        System.out.println("found at index: "+ x);
    }
}
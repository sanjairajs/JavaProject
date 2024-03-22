import java.util.*;
public class Alter
{	
	static Scanner input = new Scanner(System.in);
	static void proceed(){
       int size;
	do{
          System.out.println("Enter Array Size in Even:");
	  size = input.nextInt();
	}
	while(size%2!=0);
	System.out.println("Enter Array "+ size+" Element:");
	int[] arr = new int[size];
	for(int i=0;i<size;i++)
	{
	  arr[i]=input.nextInt();
	}
	for(int i=0;i<size-1;i++)
	{
	  for(int j=i+1;j<size;j++)
	  {
		if(arr[i]>arr[j])
		{
		  int temp=arr[i];	
		     arr[i]=arr[j];
		     arr[j]=temp;
		}
	   }
        }
	
	int k=size-1;
	System.out.println("Display pairing Sort");
	for(int i=0;i<size/2;i++)
	{
		System.out.print(arr[k--]+" "+arr[i]+" ");
	}

}
	

   public static void main(String[] args)
     {
	
	boolean temp = true;
	do{
		System.out.println("\n\nEnter 1 . proceed ");
		System.out.println("Enter 2. Exit:");
		int opt = input.nextInt();
	switch(opt){
		case 1:
			proceed();
			break;
		case 2:
			System.out.println("Exit");
			temp = false;
			break;
		default:
			System.out.println("Enter Wrong number");
	          }
	}	
	while(temp);
	
		input.close();
      }
}
	
	
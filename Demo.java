class PrintArray
{
	public  <T> void printArr(T arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}

class Demo
{
	public static void main(String[] args) {
	
		Print ob=new Print();

		Integer arr[]=new Integer[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		ob.printArr(arr);

	String arrS[]=new String[5];
		for(int i=0;i<arrS.length;i++)
		{
			arrS[i]="abc";
		}

		ob.printArr(arrS);

	}

}
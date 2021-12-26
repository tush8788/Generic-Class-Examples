class Test<T,S>
{
	private T first;
	private S secound;

	Test(T first,S secound)
	{
		this.first=first;
		this.secound=secound;
	}

	void setFirst(T first)
	{
		this.first=first;
	}

	void setSecound(S secound)
	{
		this.secound=secound;
	}

	T getFirst()
	{
		return first;
	}

	S getSecound()
	{
		return secound;
	}

}

class GenericClass
{
	public static void main(String[] args) {
		Test <Integer,String> ob=new Test<>(10,"dream");
		System.out.println(ob.getFirst()+" "+ob.getSecound());
	}
}
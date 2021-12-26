class PairsOfTwo<T>
{
	private T first;
	private T secound;

	PairsOfTwo(T first,T secound)
	{
		this.first=first;
		this.secound=secound;

	}
	void setFirst(T first)
	{
		this.first=first;
	}
	void setSecoud(T secound)
	{
		this.secound=secound;
	}
	T getFirst()
	{
		return first;
	}
	T getSecound()
	{
		return secound;
	}
}

class Pair
{
	public static void main(String[] args) {
		PairsOfTwo<Integer> ob=new PairsOfTwo<Integer>(1,3);
		System.out.println(ob.getFirst()+" "+ob.getSecound());
	}
}
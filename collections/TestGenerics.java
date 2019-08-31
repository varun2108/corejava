package collections;

public class TestGenerics {
	static<T> void genericDisplay(T element)
	{
		System.out.println(element.getClass().getName()+"="+element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericDisplay(11);
		genericDisplay("generics");
		genericDisplay(1.0);
	}

}

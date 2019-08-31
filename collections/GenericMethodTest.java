package collections;

public class GenericMethodTest {

	public static  <T> void printArray(T[] inputArray){
		for (T element : inputArray){
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray={1,2,3,4,5};
		Double[] doubleArray={1.1,2.2,3.3,4.4};
		Character[] charArray={'H','E','L','L','O'};
		
		System.out.println("Array integerArray contains : ");
		printArray(intArray);
		
		System.out.println("\n Array douleArray contains : ");
		printArray(doubleArray);
		
		System.out.println("\nArray charecterArray contains :");
		printArray(charArray);
	}

}

package collections;
import java.util.*;
class Employee222 implements Comparable<Employee222>
{
    String name;
    int age;
    int experience;
    
    public Employee222(String name, int age, int experience) // LINE A
    {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    
    public String toString() // LINE B
    {
        return "Name : " + name + " Age : " + age + " Experience : " + experience;
    }
    
    
	@Override
	public int compareTo(Employee222 o) {
		// TODO Auto-generated method stub
        return experience - o.experience;
	}
}

public class ComparableInterfaceDemo
{

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList(); // LINE D
        list.add(new Employee222("Siva", 35, 12));
        list.add(new Employee222("Maheesh", 25, 3));
        list.add(new Employee222("Narayan", 26, 2));
        list.add(new Employee222("Srinath", 24, 3));
        System.out.println(list); // LINE E
        Collections.sort(list); // LINE F
        System.out.println(list);
    }
}

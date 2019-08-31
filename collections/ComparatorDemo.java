package collections;
import java.util.*;
class ComparatorDemo
{
    public static void main (String[] args)
        {
             ArrayList<Student1> ar = new ArrayList<Student1>();
             ar.add(new Student1(111, "bbbb", "london"));
             ar.add(new Student1(131, "aaaa", "nyc"));
             ar.add(new Student1(121, "cccc", "jaipur"));

             System.out.println("Unsorted");
             for (int i=0; i<ar.size(); i++)
             System.out.println(ar.get(i));

             Collections.sort(ar, new Sortbyroll());

             System.out.println("\nSorted by rollno");
             for (int i=0; i<ar.size(); i++)
             System.out.println(ar.get(i));

             Collections.sort(ar, new Sortbyname());

             System.out.println("\nSorted by name");
             for (int i=0; i<ar.size(); i++)
             System.out.println(ar.get(i));
     }       
}


package collections;
import java.util.*;
public class MyGenericArrayList {
   public static void main(String[] args) {
      // type safe to hold a list of Strings
      ArrayList<String> strLst = new ArrayList<String>();
   
      strLst.add("alpha");   // compiler checks if argument is of type String
      strLst.add("beta");
   
      for (int i = 0; i < strLst.size(); ++i) {
         String str = strLst.get(i);   // compiler inserts the downcasting operator (String)
         System.out.println(str);
      }
      Integer a=123;
      strLst.add(a.toString());
      System.out.println(strLst);   // compiler detected argument is NOT String, issues compilation error
   }
}
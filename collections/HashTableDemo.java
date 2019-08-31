package collections;

import java.util.*;

public class HashTableDemo {

   public static void main(String args[]) {
      // Create a hash map
      Hashtable balance = new Hashtable();
      Enumeration names;
      String str;
      double bal;

      balance.put("Jack", new Double(3434.34));
      balance.put("Ravi", new Double(123.22));
      balance.put("Mike", new Double(1378.00));
      balance.put("Daisy", new Double(99.22));
      balance.put("Navi", new Double(-19.08));

      // Show all balances in hash table.
      names = balance.keys();
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " +
         balance.get(str));
      }
      System.out.println();
      // Deposit 1,000 into Daisy's account
      bal = ((Double)balance.get("Daisy")).doubleValue();
      balance.put("Daisy", new Double(bal+1000));
      System.out.println("Daisy's new balance: " +
      balance.get("Daisy"));
      System.out.println("Ravi's new balance : "+balance.get("Ravi"));
   }
}


package collections;

import java.util.*;  

class PriorityQueueDemo{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  
System.out.println("head:"+queue.element());   
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  

queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
int i=3;
while(i<3){  
System.out.println(itr.next());  
i++;
}  
}  
} 
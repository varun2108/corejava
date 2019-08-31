package corejava;

abstract class Employee{
	String name;
	double basic;
	String address;
	
	Employee(){
		
	}
	Employee(String str,double sal,String addr){
		name=str;
		basic= sal;
		address= addr;
	}
	void show(){
		System.out.println("Name :\t\t\t "+name);
		System.out.println("Address :\t\t\t "+address);
		System.out.println("Basic :\t\t\t "+basic);
	}
	abstract double totalpay();
	double deduction(int leave){
		double lesspay;
		
		if(leave<=5){
			lesspay=(0.25*basic);
		}
		else{
			lesspay=(0.5*basic);
		}
		return lesspay;
	}
}
class Manager extends Employee{
	String department;
	Manager(){
		
	}
	Manager(String str,double sal,String addr,String dept){
		super(str,sal,addr);
	}
	void show(){
		super.show();
		System.out.println("Department :\t\t +department");
	}
	double totalpay(){
		double totalamount=0;
		double hra=(basic*0.08);
		double da=(basic*0.3);
		double ma=1500;
		totalamount=basic+hra+da+ma;
		return totalamount;
	}
}
class Director extends Employee{
	double ta;
	Director(){
		}
	
	Director(String str,double sal,String addr,double allowence){
		super(str,sal,addr);
		ta=allowence;
	}
	void show(){
		super.show();
		System.out.println("Transport allowence :\t"+ta);
	}
	double totalpay(){
		double totalamount=0;
		double hra=(basic*0.20);
		double da=(basic*0.5);
		double ma=4500;
		double ea=5000;
		totalamount=basic+hra+da+ma+ea+ta;
		return totalamount;
	}
}
public class EmployeePay {

	 EmployeePay() {
	    }

	     

	    public static void main(String[] args) {
	       Manager mgrObj = new Manager("Henry", 5500.65, "Sydney", "Accounts");
	       double payTotal = mgrObj.totalpay();
	       double less = mgrObj.deduction(5);
	       double netPay = payTotal - less;
	       System.out.println("\nManager Details");
	       System.out.println("===================================");
	       mgrObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);
	       Director dirObj = new Director("Stephen", 32400.00, "New York",
	       8000);
	       payTotal = dirObj.totalpay();
	       less = dirObj.deduction(5);
	       netPay = payTotal - less;
	       System.out.println("\n\nDirector Details");
	       System.out.println("============================");
	       dirObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);
	    }

}

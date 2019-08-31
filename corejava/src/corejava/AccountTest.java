package corejava;

class Account{
    String name;
    protected double balance;
    Account(String str,double amt){
        name = str;
        balance =amt;
    }
    String getname(){
        return name;
    }
    double grtbalance(){
        return balance;
    }
    void deposit(double amt){
        balance+=amt;
        System.out.println("Depositing: "+amt);
    }
    void withdraw(double amt){
        balance-=amt;
        System.out.println("withDrawing :"+amt);
    }
}
class SavingAccount extends Account{
    double interestRate;
    SavingAccount(String str,double amt,double rate){
        super(str,amt);
        interestRate=rate;
    }
}
class CheckingAccount extends Account{
    double overDraft;
        CheckingAccount(String str,double amt){
            super(str,amt);
        }
    CheckingAccount(String str,double amt,double draft){
        super(str,amt);
        overDraft=draft;
    }
    void withdraw(double amt){
        System.out.println("Overdraft Amount: "+overDraft);
        if(amt <= balance){
            balance-=amt;
            System.out.println("withdrawing: "+ amt);
        }
        else if((amt>balance)&&(amt>(balance+overDraft))){
            System.out.println("Sorry! you cant withdraw");
        }
        else{
            double result=amt-balance;
            overDraft-=result;
            balance=0;
            
            System.out.println("Withdrawing : "+amt);
            System.out.println("Current Overdraft Amount :"+overDraft);
        }
    }
}
class AccountTest{
    public static void main(String[] args){
        Account sAccountobj=new SavingAccount("jhon",500,4);
        System.out.println("\nSaving Account Details");
        System.out.println("--------------------------------");
        System.out.println(""+sAccountobj.getname()+" has an initial Balance of :"+sAccountobj.grtbalance());
        sAccountobj.deposit(200);
        sAccountobj.withdraw(200);
        System.out.println(""+sAccountobj.getname()+"at the end of transaction has a balance of:"+sAccountobj.grtbalance());

        System.out.println("\n Checking Account Details");
        System.out.println("-----------------------");
        Account cAccountobj = new CheckingAccount("stephen",200,200);
        System.out.println(""+cAccountobj.getname()+"Has an inital balance of :"+cAccountobj.grtbalance());
        cAccountobj.deposit(200);
        cAccountobj.withdraw(500);
                System.out.println(""+cAccountobj.getname()+"at the end of transaction :"+cAccountobj.grtbalance());
    }
}

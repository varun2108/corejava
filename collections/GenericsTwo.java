package collections;

class TwoGenericClass<P, Q>{
    P ob1;
    Q ob2;

    TwoGenericClass(P o1, Q o2){
        ob1=o1;
        ob2=o2;
    }

    void getType(){
        System.out.println("Type of P is: " + ob1.getClass().getName());
        System.out.println("Type of Q is: " + ob2.getClass().getName());

    }

    P getobj1(){
        return ob1;
    }

    Q getobj2(){
        return ob2;
    }


}

class GenericsTwo{
    public static void main(String [] args){
        TwoGenericClass<Double, String> ob = new TwoGenericClass<Double, String>(100.22,"Generics Demo");

        ob.getType();

        double d = ob.getobj1();
        System.out.println("Value: " + d);

        String s = ob.getobj2();
        System.out.println("Value: " + s);
    }
}

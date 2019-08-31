/** This class demonstrates using string methods.  */

class StringsMethods {

    
    protected StringsMethods() {
    }

  
    private String firstString = "This is a new String";
    private String secondString = "This is a new String";
    private String concatString;
    private String replacedString;

    private boolean equal;

    /** This method checks equality of strings, concatenates and
                   replace characters. */

    void test() {
        equal = firstString.equals(secondString);
        concatString = "The appendage will come behind me "
                      .concat(secondString);
        replacedString = firstString.replace('i', 'z');
    }


    void print() {

        System.out.println("The concatenated value: " + concatString);
        System.out.println("Replacing i's with z's: " + replacedString);

        if (equal) {
             System.out.println("The two strings are equal");
        } else {
             System.out.println("The strings are not equal");
        }
    }



    public static void main(final String []args) {
        StringsMethods objString = new StringsMethods();
        objString.test();
        objString.print();

        String s10="Hello World";
        System.out.println(s10.substring(2));
         System.out.println(s10.substring(2,3));









    }
}

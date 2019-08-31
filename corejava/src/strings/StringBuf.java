package strings;

public class StringBuf {
	protected StringBuf(){
		
	}
	public static void main(final String[] args){
		StringBuffer buf=new StringBuffer("Java");
		buf.append(" Guide Ver1/"); //append //Java Guide Ver1/7
		buf.append(3);
		int index=5;//insert //Java Student Guide ver1/7
		buf.insert(index, "Student ");
		index =23; //set
		buf.setCharAt(index,'.');
		int start = 24;//for replace
		int end = 25;
		buf.replace(start,end,"8");
		String s=buf.toString();
		System.out.println(s);
		StringBuffer s1=new StringBuffer("Hello");
		int c=s1.capacity();
		System.out.println(c);
		System.out.println(s1.reverse());
	}
}

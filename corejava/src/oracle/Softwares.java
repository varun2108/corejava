package oracle;

public class Softwares {

	public Softwares(){
		
	}
	public final void printSoftware(){
		int i;
		String[] arrOracle={"oracle8i","Oracle9i","Oracle10G"};
		for(i=0;i<3;i++){
			System.out.println(arrOracle[i]);
		}
	}
}

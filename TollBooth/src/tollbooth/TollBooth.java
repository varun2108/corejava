/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tollbooth;

/**
 *
 * @author DELL
 */
public class TollBooth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Truck t1=new Nissan(5,1500);
        Truck t2=new Benz(4,1200);
        TollComaney nelmangla=new TollComaney();
        nelmangla.cal_Display(t1);
        nelmangla.cal_Display(t2);
        nelmangla.collect_reset();
             
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tollbooth;

/**
 *
 * @author DELL
 */
public class TollComaney implements Toll{
    private static int no_vehicle;
    private static double tot_amount;
    public void collect_reset(){
        System.out.println("Thank you for Collecting And Resting the Toll\n number of vehiles Passed\t: "+no_vehicle+"\nTotal Ammount\t: "+tot_amount);
        no_vehicle=0;
        tot_amount=0;
    }
    public void cal_Display(Truck truck){
        int axil=truck.getaxils();
        double tons=truck.totons();
        double toll=axil*5;
        toll+=tons*20;
        no_vehicle++;
        tot_amount+=toll;
        System.out.println(" \t\tWell Come To My Toll Companey");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\t\tVehicle Information");
        truck.display();
        System.out.println("Ammount to be paid : "+toll);
        System.out.println("********************************************************************************");
        System.out.println("\t\tTodays TollBooth Ststus");
        
        System.out.println("Number of vehicles passed the Toll:"+no_vehicle+"\tTotal Ammount Collected:"+tot_amount);
        System.out.println("---------------------------------------Happy Journey------------------------------");
        System.out.println();
    }
}

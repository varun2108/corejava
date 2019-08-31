/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tollbooth;

/**
 *
 * @author DELL
 */
public class Nissan implements Truck{
   private int axils;
   private double weight;
    @Override
  public void display(){
      System.out.println("Brand : Nissan \tAxils : "+axils+" \tWeight :"+weight);
  }
   Nissan(int axils1,double weight){
       this.axils=axils1;
       this.weight=weight;
   }
    @Override
   public double totons(){
       return this.weight/100;
   }
    public int getaxils(){
        return this.axils;
    }
}
    


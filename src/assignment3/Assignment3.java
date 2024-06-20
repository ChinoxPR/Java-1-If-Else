/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3;
//import so program can use input in my Program
import javax.swing.JOptionPane;
/**
 *
 * @author John Hernandez 6/7/2024
 * 
 */
public class Assignment3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      // DECLARING VARIABLES 
      int month;
      int day;
      int year;
      int possibleNumberToEqualYear;
        
      //Create STRING FOR JOPTIONPANE TO RECYCLE
      String str;
        
      //INPUT
      // ASSIGNING VARIBALES WITH JOPTIONPANE
      // CONVERT STRING str TO INT month,day,year
      str = JOptionPane.showInputDialog("Please enter the Month");
      month = Integer.parseInt(str);
      
      str = JOptionPane.showInputDialog("Please enter the Day");
      day = Integer.parseInt(str);
      
      str = JOptionPane.showInputDialog("Please enter two-digit Year");
      year = Integer.parseInt(str);
      
      // Calculations
      possibleNumberToEqualYear = month *day;
      
      // if else statement for variable possibleNumberToEqualYear to match variable year
      if(possibleNumberToEqualYear == year)
      {
       System.out.println("Date is Magic");
      }
      else
      {
         System.out.println("Date is not Magic");
      }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistorsarray;

import javax.swing.JOptionPane;

/**
 *
 * @author omsay9559
 */
public class ResistorsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("first band ");
        //System.out.println(""+ FirstBand);
        //FirstBand();
//    System.out.println(""+ FirstBand());
//    System.out.println(""+ SecondBand());
//    System.out.println(""+ ThirdBand());
        int band1=FirstBand();
       // int band2= SecondBand();
        //int band3 = ThirdBand();
        int bandValue = (((band1*10)+band2)*10^band3);
        System.out.println(""+ bandValue);
    }
    public static int FirstBand () {
        String myInput;
       
         //collect phrase from user
        myInput = JOptionPane.showInputDialog("Please enter the first band's colour");
        //Convert all characters to uppercase, remove all spaces 
        myInput=myInput.toUpperCase();
        
        String colour []=new String [10];
                colour [0] = "BLACK";
                colour [2] = "BROWN";
                colour [3] = "RED";
                colour [4] = "ORANGE";
                colour [5] = "YELLOW";
                colour [6] = "GREEN";
                colour [7] = "BLUE";
                colour [8] = "VIOLET";
                colour [9] = "GREY";
                
                switch (myInput) {
            case colour [0] :
                ThirdBand=0;
                break;
            case "BROWN":
                ThirdBand=1;
                break;
            case "RED":
                ThirdBand=2;
                break;
            case "ORANGE":
                ThirdBand=3;
                break;
            case "YELLOW":
                ThirdBand=4;
                break;
            case "GREEN":
                ThirdBand=5;
                break;
            case "BLUE":
                ThirdBand=6;
                break;
            case "VIOLET":
                ThirdBand=7;
                break;
            case "GREY":
                ThirdBand=8;
                break;
            case "WHITE":
                ThirdBand=9;
                break;
        }
        return ThirdBand;
        }
        return FirstBand;
        
    }
    }
    
}

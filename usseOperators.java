
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guangjian.bao
 */
import java.util.Scanner;
public class usseOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tallFeet, tallInches,tallCertimeters;
        Scanner tallInput = new Scanner(System.in);
        System.out.println("How many feet tall are you?");
        tallFeet = tallInput.nextInt();
        System.out.println("How many inches are you?");
        tallInches = tallInput.nextInt();
        tallCertimeters = tallFeet*12*2.54 + tallInches*2.54;
        System.out.println("You are "+tallCertimeters+" certimeters");
    }
}

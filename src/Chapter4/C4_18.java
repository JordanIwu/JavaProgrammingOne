
package Chapter4;

/**
 *Finds out information about a student in a school based off of information entered in by the user
 * @author Jordan Iwuchukwu
 */
import java.util.Scanner;
public class C4_18{
	public static void main (String[] args) {
            /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

   	Scanner input = new Scanner(System.in);
   	System.out.print("Enter two characters");
   	String a=input.next().toUpperCase();
   	char b = a.charAt(0);
   	char c= a.charAt(1);
   	String output="";
   	switch(b){
       	case 'M':
           	output = "Mathematics"; break;
       	case 'C' :
           	output ="Computer Science"; break;
       	case 'I':
           	output ="Information Technology"; break;
       	default :
           	output ="Invalid input"; break;
   	}
   	if (!(output.equals("Invalid input"))){
   	switch (c) {
       	case '1':
           	output +=" Freshman"; break;
       	case '2':
           	output += " Sophomore"; break;
       	case '3':
           	output += " Junior"; break;
       	case '4':
           	output += " Senior"; break;
       	default :
           	output = "Invalid input"; break;
   	}
   	}
   	System.out.println(output);
	}  
}


package orthofx.com;
import java.util.Scanner;

public class Marks
{

	   public static void main(String[] args)
	   {
	      
	      int score ;
	      Scanner sc= new Scanner(System.in);
	      System.out.println("Enter marks");
	      score= sc.nextInt(); 
	      String grade =null;
	      
	      switch(score/10) 
	      {
	        case 10:
	        case 9:
	           grade = "Amazing";
	           break;
	        case 8:
	           grade = "Good";
	           break;
	        case 7:
	           grade = "All right";
	           break;
	        default:
	           grade = "Okay";
	           break;
	      }
	      
	      
	      System.out.println(grade);
	    }

}



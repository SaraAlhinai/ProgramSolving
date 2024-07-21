//Problem 3:

import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    String num1;
    String num2;
    
    // Enter username and press Enter
    System.out.println("Enter your choice:"); 
    num1 = myObj.nextLine();
    System.out.println("Enter the number of lines:"); 
    num2 = myObj.nextLine();
    
  for(int i=1; i<num1; i++) { 
  for(int j=1; j<num2; j++) { 
      System.out.print(num1); 
  } 
  }
  System.out.println(num2);  
    //System.out.println("Username is: " + num1);  
   // System.out.println("Username is: " + num2); 
  }
}

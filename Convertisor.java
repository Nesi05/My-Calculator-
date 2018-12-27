/*Nesi Mpanzu
Project Convertisor
Celcius Fahenheit */


import java.util.Scanner;

class Convertisor {
  public static void main(String[] args) {
    //our objet Scanner
    Scanner sc = new Scanner(System.in);

    //initialisation des variables
    double toConvert, convert=0;
    char response=' ', mode = ' ';

    System.out.println("CONVERTISOR DEGREES CELSIUS AND DEGREES FAHRENHEIT");
    System.out.println("-------------------------------------------------");
    
    do{//as long as reponse = O // principale loop
       
      do{//as long as reponse isn't Y or N
        mode = ' ';
        System.out.println("Choose your conversion's mode : ");
        System.out.println("1 - Convertisor Celsius - Fahrenheit");
        System.out.println("2 - Convertisor Fahrenheit - Celsius ");
        mode = sc.nextLine().charAt(0);
       
        if(mode != '1' && mode != '2')
          System.out.println("Unknown mode, Please Select a correct mode.");

      }while (mode != '1' && mode != '2');
       
      //enter the temperature to convert
      System.out.println("Temperature to convert :");
      toConvert = sc.nextDouble();
      //Empty the ligne read
      sc.nextLine();
     
      //Calculate according to the mode and return result
      if(mode == '1'){
        convert = ((9.0/5.0) * toConvert) + 32.0;
        System.out.print(toConvert + " °C is the equivalence of: ");
        System.out.println(arrondi(convert, 2) + " °F.");
      }
      else{
        convert = ((toConvert - 32) * 5) / 9;
        System.out.print(toConvert + " °F is the equivalence of: ");
        System.out.println(arrondi(convert, 2) + " °C.");
      }
     
      //Restart or Quite
      do{       
        System.out.println("Would you like to convert another temperature ?(Y/N)");
        response = sc.nextLine().charAt(0);
       
      }while(response != 'Y' && response != 'N');
     
    }while(response == 'Y');
    
  System.out.println("Au revoir !");
    
  //End of program
  }
    
  public static double arrondi(double A, int B) {
    return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
  } 
}
import java.util.Scanner;
public class dms {

    // calculate the bmi
    public static double bmi(double h, double w) {
        double squareofh = h * h;
        double bmi = w / squareofh;
        return bmi;
    }
     // show the results based on the bmi
    static void res(double c) {

        if (c < 18.5)
        System.out.println("Underweight");
        else if(c >= 18.5 && c <= 24.9)
        System.out.println("Normal Weight");
        else if(c > 24.9 && c <= 29.9 )
        System.out.println("Overweight");
        else
        System.out.println("Obessed");
    }
    public static void main(String[] args) {

     Scanner s = new Scanner(System.in);
     System.out.print("Enter the height: ");
     double height = s.nextDouble();
     
     System.out.print("Enter the weight: ");
     double weight = s.nextDouble();
     s.close();

     if (height <= 0 || weight <= 0)
     System.out.println("Invalid input");
     else
     {
        double result = bmi(height, weight);
        res(result);
        System.out.println ("With BMI: " + result); 
    }
  }
}

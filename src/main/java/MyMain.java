import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int total = 0;
        int input = Integer.parseInt(binary);
        int power = 1;
        while (input>0) {
            total += (input%10)*power;
            power *= 2;
            input /= 10;
        }
        return total;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean cont = true;
        while (cont){
            System.out.println("Please enter a number in binary to be converted to base 10: ");
            System.out.println("That equals "+binaryToDecimal(scan.next())+" in base 10. Would like to convert another number?");
            if (!scan.next().equals("yes")) cont = false;           
        }
        System.out.println("Goodbye.");
        scan.close();
    }
}

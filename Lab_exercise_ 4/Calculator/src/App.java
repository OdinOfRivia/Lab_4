import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        char operator;
        Double num1, num2, result;
        boolean continueOrNot = true; 
        String yesOrNo = "YesOrNo";

        Scanner input = new Scanner(System.in);

        
        while(continueOrNot){
        System.out.println("PLease type the first number");
        num1 = input.nextDouble();

        System.out.println("Choose an operator:\n >Type + for addition \n >Type - for substractiong \n >Type * for multiplication \n >Type / for division");
        operator = input.next().charAt(0);

        System.out.println("PLease type the second number");
        num2 = input.nextDouble();

       
        switch (operator){

            case '+':
            result = num1 + num2; 
            System.out.println( num1 + " + " + num2 + " = " +result);
            break;
            
            case '-':
            result = num1 - num2; 
            System.out.println( num1 + " - " + num2 + " = " +result);
            break;

            case '*':
            result = num1 * num2; 
            System.out.println( num1 + " * " + num2 + " = " +result);
            break;

            case '/':
            result = num1 / num2; 
            System.out.println( num1 + " / " + num2 + " = " +result);

            if(result == Double.POSITIVE_INFINITY || num2 == 0){
                System.out.println("Canot divide by " + num2);
            }
            break;


            }

            System.out.println("Do you want to continue or quit");
            yesOrNo = input.next();

            if(yesOrNo.equals("Continue") || yesOrNo.equals("continue")){
                continueOrNot = true;
            }else{
                continueOrNot = false;
            }

         }
        input.close();
        

       
    }
}

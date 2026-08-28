import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        class MyCustomException extends Exception{
            public MyCustomException(String msg){
                super(msg); 
            }
        }
    }
}

public class App {

    public void xyz() throws ArithmeticException {
        int result = 100/0;
    }
    public static void main(String[] args) {
        try{
            xyz();
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println("divide by zero....");
        }
        Scanner input = new Scanner(System.in);

        try{
        System.out.println("Enter nominator val");
        int nom = input.nextInt();
        System.out.println("Enter Denominator val");
        int denom = input.nextInt();
        if(denom == 0){
            throw new ArithmeticException("denominator cannot be zero");
        }

        int res = nom/denominator;
        }
        catch(InputMismatchException e){
            //e.printStackTrace();
            System.out.println("invalid input.......");
        }

        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("invalid operation.......");
        }

        catch(Exception e){
            //e.printStackTrace();
            System.out.println("exception occured.......");
        }

        System.out.println("Enter Address");
        String addr = input.nextLine();
        System.out.println("for rent or sale");
        String type = input.nextLine();

        boolean valid =false;
        do { 
            try{
                System.out.println("amount (RM)");
                int amount = input.nextInt();
                System.out.println("Enter Rate");
                // double rate = input.nextDouble();
                int rate = input.nextInt();
                
                double result = amount/rate;
                
                valid = true;
            }

            catch(InputMismatchException e){
                //e.printStackTrace();
                System.out.println("invalid input.......");
            }

            catch(ArithmeticException e){
                //e.printStackTrace();
                System.out.println("invalid operation.......");
            }

            catch(Exception e){
                //e.printStackTrace();
                System.out.println("exception occured.......");
            }

            finally{
                System.out.println("execude code inside finally........");
                input.nextLine(); //optionQWal to clear the buffer
            }
        } while (!valid);

        int choice;
        
        do {
            System.out.println("=================================");
            System.out.println(" REAL ESTATE MANAGEMENT SYSTEM BY <your groupname here>");
            System.out.println("=================================");
            System.out.println("Login as :");
            System.out.println("1. Agent / Staff");
            System.out.println("2. Property Owner");
            System.out.println("3. Tenant / Prospective Tenant");
            System.out.println("0. Exit");
            System.out.print("Enter choice: [0-3]");


            choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Agent / Staff menu should be implemented here.");
                    break;
                case 2:
                    System.out.println("Property Owner menu should be implemented here.");
                    break;
                case 3:
                    System.out.println("Tenant menu should be implemented here.");
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }


        } while (choice != 0);


        input.close();
    }
}
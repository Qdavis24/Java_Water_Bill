import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){

        Customer cmer = new Customer();


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Enter Customer Name: ");
            name = bufferedReader.readLine();
            System.out.print("Enter Customer Type (1: SingleFamily, 2: Duplex): ");
            customerType = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter gallons used: ");
            gallonsUsed = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("the bill is " + bill);

    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        Customer cmer = new Customer();
        cmer.getCustomerInput();
        cmer.setGallonsUsed(-100000);
        cmer.calculateBill();
        cmer.printBill();
    }

}

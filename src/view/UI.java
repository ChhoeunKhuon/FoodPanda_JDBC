package view;

import controller.CustomerController;
import model.dto.CreateCustomerDto;
import utils.DBException;

import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);
    private void option(){
        System.out.println("=*=".repeat(20));
        System.out.println("1. Customer");
        System.out.println("2. Product");
        System.out.println("3. Order products");
        System.out.println("0/99. to Exit");
        System.out.println("=*=".repeat(20));
    }
    private void processOption() throws DBException {
        while(true) {
            String option = "";
            while (!option.equalsIgnoreCase("exit")) {
                option();
                System.out.print("Insert option: ");
                option = sc.nextLine();
                switch (option) {
                    case "0":
                        System.out.println("0. Exit");
                        System.exit(0);
                        break;
                    case "1":
                        CustomerController.processOption();
                        break;
                    case "2":
                        System.out.println("Product");
                        break;
                    case "3":
                        System.out.println("Order");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
            }
        }
    }
    public static void customerServicesMenu() {
        System.out.println("""
                1. Add new Customer
                2. List all Customers
                3. Delete by Id
                4. Update by Id
                5. Search by Id
                B/Back: Back to Main
                """);
    }
    public void userInterface() throws DBException {
        processOption();
    }
}

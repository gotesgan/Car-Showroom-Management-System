import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("====================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** ======================");
        System.out.println();
        System.out.println("============================== *** ENTER YOUR CHOICE *** ================================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("============================== *** ENTER 0 TO EXIT *** ================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];              //here we create array as object.
        Employees employees[] = new Employees[5];           //We don't use database in this project, that's why we use array here.
        Cars cars[] = new Cars[5];                          //If we don't use array here, then we have to make objects repeatedly. 
                                                            //For Ex.:cars1, cars2, cars3,......
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;                                   //we can use any random no. here rather than 100 also.

        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                
                    case 2:
                        employees[employees_counter] = new Employees();
                        employees[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        cars[car_counter].set_details();
                        cars[car_counter] = new Cars();
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CARS");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    
                    case 4:
                        for(int i=0;i<showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].Exit");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for(int i=0;i<employees_counter;i++){
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].Exit");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for(int i=0;i<car_counter;i++){
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].Exit");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }
}

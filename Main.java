enum DayOfWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}
enum BaseballJerseys{
    RUTH(3),
    ROBINSON(42),
    RIVERA(42),
    JETER(2),
    JUDGE(99);

    private final int jerseyNum;
    public int getJerseyNum(){
        return this.jerseyNum;
    }
    BaseballJerseys(int jerseyNum){
        this.jerseyNum=jerseyNum;
    }
}

public class Main {
    public static void main(String[] args) {
        DayOfWeek day=DayOfWeek.WEDNESDAY;
        BaseballJerseys j=BaseballJerseys.ROBINSON;
        System.out.println(j.getJerseyNum());





    }
}
//FOR PIZZA PARLOR
//SET THE CODE SUCH THAT THE CODE WILL PRINT OUR MENU(ASK THE USER TO TYPE A NUMBER), TELL YOU
//WHAT PIZZA FLAVOR YOU TYPED. LOOP TO PRINT THE MENU. IF THEY DON'T TYPE A PROPER NUMBER
//YOU NEED TO THROW AN EXCEPTION AND SET THE PIZZA TO PLAIN

//turn enum into array
/*       for(DayOfWeek d: DayOfWeek.values()){
            System.out.println(d.toString());
        }
*/

//Turn number back into enum
// System.out.println(DayOfWeek.values()[n]);
//get ordinal value of int
//        System.out.println(day.ordinal());

//switch code for day enum
/*switch(day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Its a weekday");
                break;

            case SATURDAY, SUNDAY:
                System.out.println("Its a weekend");
                break;

            default:
                System.out.println("Unknown day");


        }

         */


/*
import java.util.Scanner;




/*
StringBuilder sb=new StringBuilder();
       sb.append("abc");
       for (int i=0; i < 50; i++){
           System.out.println(i+">");
           sb.append("x");
           System.out.println(sb);
           System.out.println(sb.capacity());
       }
       System.out.println(sb.capacity());
*/



/*

import java.util.InputMismatchException;
import java.util.Scanner;


enum PizzaParlor {
    Plain(1),
    Chicken(2),
    Pepperoni(3),
    Veggie(4);


    private final int pizzaMenuNum;
    PizzaParlor(int pizzaMenuNum) {
        this.pizzaMenuNum = pizzaMenuNum;
    }
    public int getPizzaMenuNum() {
        return pizzaMenuNum;
    }
    public static PizzaParlor getByNumber(int number) {
        for (PizzaParlor pizza : PizzaParlor.values()) {
            if (pizza.getPizzaMenuNum() == number) {
                return pizza;
            }
        }
        return null;
    }
}


public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("What flavor pizza would you like? Enter a number corresponding to the pizza flavor:\n");

        for (PizzaParlor p : PizzaParlor.values()) {
            System.out.println(p.getPizzaMenuNum() + " - " + p.toString());
        }


        try {
            System.out.print("\nPlease enter your choice (1-" + PizzaParlor.values().length + "): ");
            int n = s.nextInt();


            if (n < 1 || n > PizzaParlor.values().length) {
                System.out.println("Invalid choice. Please enter a number between 1 and " + PizzaParlor.values().length);
            } else {
                PizzaParlor selectedPizza = PizzaParlor.getByNumber(n);
                System.out.println("You picked: " + selectedPizza);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
            s.close();


    }
}















 */

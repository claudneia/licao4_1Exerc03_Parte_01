package licao4_1exerc03_parte_01;

public class Calculator3 {
    public static double tax = .05;
    public static double tip = .15;
    
    public static void findTotal(double price, String name){
        double total = price*(1+tax+tip);
        
        System.out.println(name+" $" +total);

    }
}

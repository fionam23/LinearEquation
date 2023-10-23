import java.io.InputStream;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first Coordinate Point:");
        String coordinate1 = s.nextLine();
        System.out.println("Enter your second Coordinate Point:");
        String coordinate2 = s.nextLine();
        LinearEquation newEquation = new LinearEquation(coordinate1, coordinate2);

        String[] str = newEquation.toString().split(";");
        for(String v: str){
            System.out.println(v);
        }
        System.out.println("Please enter an x value to find the y");

        String xCoord = s.nextLine();

        System.out.println();
        System.out.println("Solved coordinate point is: ("+Double.parseDouble(xCoord)+","+newEquation.solveForY(Integer.parseInt(xCoord))+")");


    }
}
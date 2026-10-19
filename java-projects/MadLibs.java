import  java.util.Scanner;

public class MadLibs {
    public static void main (String[] args){
        int wholeNum;
        String name;
        String adjective;
        String place;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MadLibs!");
        System.out.print("Enter a whole number: ");
        wholeNum=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a name: ");
        name=scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective=scanner.nextLine();
        System.out.print("Enter a place: ");
        place=scanner.nextLine(); 
        System.out.printf("A very "+ adjective + " " + name + " walks " + wholeNum + " miles to " + place + "!");
    }
}
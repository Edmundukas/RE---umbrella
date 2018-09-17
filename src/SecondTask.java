import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){

        System.out.println("pasirinkite ka norite skaiciuoti\n1-staciojo trikampio plotas \n2 - staciakampio plotas \n3 - kvadrato plotas\n4-apskritimo plotas");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                //double result = triangle(scanner);
                System.out.println("Trikampio plotas yra" + triangle(scanner));
                break;
            case 2:
                System.out.print("Staciakampio plotas yra" + rectangular(scanner));
                break;
            case 3:
                System.out.print("Kvadrato plotas yra" + square(scanner));
                break;
            case 4:
                System.out.print("Apskritimo plotas" + circle(scanner));
                break;
            default:
                System.out.println("Netiko nei vienas");
                break;






        }
    }
    private static double circle(Scanner scanner){

    }


    private static double square(Scanner scanner){
        return 0;
    }
    private static double rectangular(Scanner scanner) {
        return 0;
    }
    private static double triangle(Scanner scanner) {

        System.out.print("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.print("Iveskite b statini");
        double b = scanner.nextDouble();
        return(a * b)/2;
    }



}

import java.util.Scanner;

public class FiveTask {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Iveskite nuvaziuotusKm");
        double nuvaziuotiKm = sc.nextDouble();
        System.out.println("Iveskite kuro sanaudas");
        double kurosan = sc.nextDouble();
        double vidurkis = (kurosan * 100/ nuvaziuotiKm);
        System.out.println("Vidurkis Yra" +  vidurkis);


    }
}

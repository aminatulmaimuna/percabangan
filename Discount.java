import java.util.Scanner;
public class Discount{
    public static void main(String[] args) throws Exception{
        double totalBelanja, discount;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja >= 1000000)  {
            discount = (5 * totalBelanja)/100; 
            totalBelanja = totalBelanja - discount;
        }   
        
        System.out.print("Total yang dibayar: " + totalBelanja);
        inputan.close();
   }
}


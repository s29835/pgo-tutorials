import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if(liczba>0){
            System.out.println("Liczba jest dodatnia");
        }
        if(liczba<0){
            System.out.println("Liczba jest ujemna");
        }
        if(liczba==0){
            System.out.println("Liczba jest równa zero");
        }


    }
}


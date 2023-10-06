import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int num=0;
        System.out.println("Elije un numero: ");
        n = sc.nextInt();
        while (num < n){
            num++;
            System.out.println(num);
        }
        
    }
    
}

import java.util.Scanner;
 
public class triangulodepascal
{            
    public static void main(String[] args) {
          
        int n = 5;
  
        for (int i = 0; i < n; i++) {
            int numero = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", numero);
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
  
    }
  
}
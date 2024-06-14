import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int i = 0; 
       int sum = 0;
       
        System.out.println("Digite um número (0 para fechar)");
       
       int num = sc.nextInt();
         
       while(num != 0) //soma numeros ate 10 numeros inseridos, caso apertar 0, o programa encerra e mostra o resultado
       {
           System.out.println("Digite um número (0 para fechar)");
            sum = sum + num;
            num = sc.nextInt();
            i++;
            
       if(i >= 10)
        {
            break;
        }
       }
       
        System.out.println("Resultado das somas: " + sum);
       sc.close();
    }
}

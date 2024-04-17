import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  
        
        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
       
        System.out.println("Digite o número da agencia:");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo Inicial:");
        float saldo = scanner.nextFloat();

        //Exibir a mensagem da conta criada
        String msg = "Olá ".concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(" conta ")
        .concat(""+numero)
        .concat(" e seu saldo ")
        .concat(""+saldo)
        .concat(" já está disponivel para saque.");
 
        System.out.println( msg );
         
    }
}

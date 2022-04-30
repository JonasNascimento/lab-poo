import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    private static ObjetoRemotoSignos_IF stub;
    private static Registry registry;

    public static void executarCliente(String[] args){
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            registry = LocateRegistry.getRegistry(host);
            stub = (ObjetoRemotoSignos_IF) registry.lookup("mensagemSign");
            Scanner scan = new Scanner(System.in);
            String entrada = "";
            while(!entrada.equals("Sair")){
                System.out.println("Digite um signo: ");
                entrada = scan.nextLine();
                if(!entrada.equals("Sair"))
                    System.out.println("Mensagem: "+ stub.getMensagemSigno(entrada));

            }


        }catch (Exception e){
            System.err.println("Cliente exception: "+ e.toString());
        }
    }

    public static void main(String[] args){
        executarCliente(args);
        System.out.println("Fim.");
    }


}

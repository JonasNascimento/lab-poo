import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;


public class ServidorDeSignos implements ObjetoRemotoSignos_IF{
    private Map<String,List<String>> mapaSignos;

    ServidorDeSignos(){
        mapaSignos = new HashMap<>();
        mapaSignos.put("Aquario",List.of("mensagem aquario 1","mensagem aquario 2"));
        mapaSignos.put("Peixes",List.of("mensagem peixes 1","mensagem peixes 2"));
        mapaSignos.put("Aries",List.of("mensagem aries 1","mensagem aries 2"));
        mapaSignos.put("Touro",List.of("mensagem touro 1","mensagem touro 2"));
        mapaSignos.put("Gemeos",List.of("mensagem gemeos 1","mensagem gemeos 2"));
        mapaSignos.put("Cancer",List.of("mensagem cancer 1","mensagem cancer 2"));
        mapaSignos.put("Leao",List.of("mensagem leao 1","mensagem leao 2"));
        mapaSignos.put("Virgem",List.of("mensagem virgem 1","mensagem virgem 2"));
        mapaSignos.put("Libra",List.of("mensagem libra 1","mensagem libra 2"));
        mapaSignos.put("Escorpiao",List.of("mensagem escorpiao 1", "mensagem escorpiao 2"));
        mapaSignos.put("Sagitario",List.of("mensagem sargitario 1","mensagem sargitario 2"));
        mapaSignos.put("Capricornio",List.of("mensagem capricornio 1","mensagem capricornio 2"));


    }


    public String getMensagemSigno(String umSigno) {
        int tamanho = mapaSignos.get(umSigno).size();
        Random random = new Random();
        int i = random.nextInt(tamanho);

        if(mapaSignos.containsKey(umSigno))
            return mapaSignos.get(umSigno).get(i);
        else return null;
    }

    public static void main(String[] args){
        try{
            ServidorDeSignos obj = new ServidorDeSignos();
            ObjetoRemotoSignos_IF stub = (ObjetoRemotoSignos_IF) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("mensagemSign", stub);

            System.err.println("Servidor de Signos pronto...");

        }catch(Exception e){
            System.err.println("Servidor Exception: " + e.toString());
        }
    }
}

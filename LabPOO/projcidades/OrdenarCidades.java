package br.edu.ifpb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OrdenarCidades {
    List<Cidade> cidades = new ArrayList<Cidade>();
    public void ordenarArquivoCidades(String origem){
        try(FileReader fr = new FileReader( origem);
            BufferedReader br = new BufferedReader(fr);)

        {
            String linha = null;

            while((linha = br.readLine())!=null)
            {
                String palavras[] = linha.split(", ");

                Cidade c = new Cidade(palavras[0],palavras[1],palavras[2]);
                cidades.add(c);

                for(Cidade cidade : cidades) {
                    System.out.println(cidade.getNome());
                }
            }
        } catch(FileNotFoundException e){
            System.out.println("arquivo nao existe");
        } catch (IOException e){
            System.out.println("erro na varredura do arquivo");
        }
    }
}

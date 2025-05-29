import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class LeitorSimples {
    public static void main(String[] args) {

try {
    FileWriter escrever = new FileWriter("NomeArquivo.txt");
    FileReader ler = new FileReader("NomeArquivo.txt");
    BufferedReader buffer = new BufferedReader(ler);

    escrever.write("Minha frase de teste");
    escrever.close();

    String lerArquivo;
    
    while((lerArquivo = buffer.readLine()) != null){
        System.out.println(lerArquivo);
    }

} catch (IOException e) {
    System.out.println("Erro ao ler o arquivo.");
    e.printStackTrace();

        }
    }
}

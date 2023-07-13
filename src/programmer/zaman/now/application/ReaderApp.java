package programmer.zaman.now.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderApp {
    public static void main(String[] args) {
        //tyr(resource)
        /**try("mendeskripsikan variable yang kira2 sebuah object turunan autoclosable")
        otomatis akan dihapus, jadi tidak perlu finally**/
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
        //Buffered reader turunan dari autoclosable
            while(true){
                String line = reader.readLine();
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }
            //setelah selesai try, maka otomatis akan diclose
        }
        catch (Throwable throwable){
            System.out.println("Error membaca file "+ throwable.getMessage());
        }
    }
}
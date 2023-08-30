import java.io.IOException;
import java.nio.file.*;
public class task2 {
 
    public static String readFileAsString(String fileName) throws IOException
    {
        String data = "";
        data = new String(
            Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
 
    public static void main(String[] args) throws IOException
    {
        String data = readFileAsString("task3.java");
        String[] arr=data.split(" ");
        int res=0;
        for(int i=0; i<arr.length; i++){
            res++;
        }
        System.out.println("Number of words in the file are : "+res);
    }
}
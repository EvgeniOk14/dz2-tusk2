import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class solvation2 {
    public static String[] ReadLineFromFile(String pathway) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size += 1;
        }
        br.close();
        
        String[] listData = new String[size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;
    }

    public static StringBuilder PrintLine(String line) {
        String line1 = line.replaceAll("\"", "");
        StringBuilder result = new StringBuilder("");
        String[] arrayData = line1.split(",");
        String[] listName = { "Студент ", " получил ", " по предмету " };
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String[] arrayData = ReadLineFromFile("file.txt");
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
        }
    }
}

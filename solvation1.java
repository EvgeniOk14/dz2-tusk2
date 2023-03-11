import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class solvation1 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new FileReader("f.txt"));
        int arrSize = 0;
        String lineForGetArraySize;
            while((lineForGetArraySize = br.readLine()) != null) 
            {
                arrSize+=1;
            }
            br.close();
        String [] commonLineArray = new String[arrSize];
        BufferedReader buff = new BufferedReader(new FileReader("f.txt"));
        String strForCommonLine;
        int count = 0;
            while(true)
            {
                strForCommonLine = buff.readLine();
                    if(strForCommonLine == null)
                    {
                        break;
                    }    
                commonLineArray[count] = strForCommonLine; 
                count+=1;   
            }
        buff.close();
         for(int i = 0; i < commonLineArray.length; i++)
            {  
                String lineWithoutGap = commonLineArray[i].replaceAll("\"", "");
                StringBuilder result = new StringBuilder("");
                String [] newArray = lineWithoutGap.split(",");
                String [] studentList = {"Студент "," получил "," по предмету "};
                    for(int j = 0; j < newArray.length; j++)
                    {
                        String [] data = newArray[j].split(":");
                        result.append(studentList[j]);
                        result.append(data[1]);
                    }
                System.out.println(result);
            }              
 }
}
        
       


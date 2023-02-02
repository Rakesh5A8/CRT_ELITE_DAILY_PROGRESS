import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int hourInt = Integer.parseInt(s.substring(0,2));
        String time = s.substring(8);
        time = time.toLowerCase();
        
        boolean night = time.equals("pm");
        
        if(night){
            if(hourInt != 12){ // check for time after noon PM
                hourInt += 12;
                return "" + hourInt + s.substring(2,8);
            }
        }else{
            if(hourInt == 12){ // check for midnight AM case
                return "00" + s.substring(2,8);
            }
        }
        return s.substring(0,8);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

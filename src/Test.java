
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Uncomment below classes to send network request if needed.
// import java.net.HttpURLConnection;
// import java.net.URL;

class test {
    public static void main(String args[] ) throws Exception {
        String inputData = "";
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData += thisLine + "\n";
        }
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }
    public static boolean codeHere(String inputData) {
        boolean flag = false;
        // Use this function to write your solution;
        String data[] =inputData.split("\n");
        System.out.println("Data 0 is " +data[0]);
        System.out.println("Data 1 is " + data[1]);
        String[] sArray =data[1].split(" ");
        System.out.println("String array is  1 is " + sArray[0]);

        for (int i=0;i<sArray.length;i++){
            String subString =sArray[i].toLowerCase();
            
            for(int j=0;j<data[0].length()/2;j++){
                System.out.println("i value"+i);
                System.out.println("j value "+j);
                if(data[0].substring(j,subString.length()).toLowerCase()==subString){
                flag=true;
                break;
                }  
        }

        System.out.println("Flag value is " +flag);
    }
    
return flag;
}
}
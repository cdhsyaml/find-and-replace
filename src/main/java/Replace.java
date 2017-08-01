import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/1/17.
 */
public class Replace {

    public String findAndReplace(String inputString , String replaceString, String placerString){

       String[] inputArray = inputString.split("");

        List<String> outputArray = new ArrayList<>();

       for (int i =0; i<inputArray.length ; i++){
           if (inputArray[i].equals(replaceString)){
               replaceString = placerString;
           }
           String outputString;

            inputArray.join();

       }

       return inputArray[];

    }

}

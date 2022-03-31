package com.solvd.fileHandler;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class March31 {

    public static void task(String path) throws IOException{
        File directory = new File(path);

        String file = FileUtils.readFileToString(directory, "UTF-8").toLowerCase();
        file = StringUtils.replaceChars(file, ',', ' ');
        file = StringUtils.replaceChars(file, '.', ' ');
        file = StringUtils.replaceChars(file, '"', ' ');
        HashMap<String, Integer> result= new HashMap<>();
        int count=0;
        for (String var1 : StringUtils.split(file)){
            if(result.containsKey(var1)){
                result.put(var1, result.get(var1)+1);
            }else
                result.put(var1, 1);
                count++;
        }
        FileUtils.writeStringToFile(new File("src/main/resources/result.txt"), "The number of unique words is: "+ count+"\n"+"The Number of ocurrences of each words in the file is: "+ result.toString(), "UTF-8");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mitsuki
 */
public class CSVUtil {
    public static void main(String[] args) throws Exception {
        String file = "output.csv";
        FileWriter writer = new FileWriter(file);
        
        Crawler crawler = new Crawler();
        List<Info> list = crawler.crawl();
        
        CSVHelper.writeLine(writer, Arrays.asList("Name", "Stars", "Language"));
        for(Info info: list) {
            List<String> tocsv = new ArrayList<>();
            tocsv.add(info.getName());
            tocsv.add(info.getStars());
            tocsv.add(info.getLanguage());
            
            CSVHelper.writeLine(writer, tocsv);
        }
        writer.flush();
        writer.close();
            
    }
}

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Mitsuki
 */
public class Crawler {

    public Crawler() {
    }
    
    
    public List<Info> crawl() throws IOException {
        String url = "https://github.com/trending?since=weekly%5D";
        Document doc = Jsoup.connect(url).get();
        
        Elements names = doc.getElementsByClass("h3 lh-condensed");
        Elements languages = doc.getElementsByClass("f6 text-gray mt-2");
        
        String name;
        String language;
        String stars;
        List<Info> list = new ArrayList<>();
        for(int i = 0; i<languages.size(); i++) {
            name = names.get(i).text();
            language = languages.get(i).getElementsByClass("d-inline-block ml-0 mr-3").text();
            String temp = languages.get(i).getElementsByClass("muted-link d-inline-block mr-3").get(0).text();
            if(temp.contains(",")) {
                stars = temp.split(",")[0].concat(temp.split(",")[1]);
            } else {
                stars = temp;
            }
            Info item = new Info(name, stars, language);
            list.add(item);
            
        }
        System.out.println(list.size());
        list.forEach(x->System.out.println(x.toString()));      
        return list;
    }
}

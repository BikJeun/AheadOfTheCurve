/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

/**
 *
 * @author Mitsuki
 */
public class Info {
    private String name;
    private String stars;
    private String language;

    public Info() {
    }
    

    public Info(String name, String stars, String language) {
        this.name = name;
        this.stars = stars;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    } 
    
    public String toString() {
        return name + " " + stars + " " + language;
    }
    
}

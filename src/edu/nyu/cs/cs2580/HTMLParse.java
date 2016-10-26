package edu.nyu.cs.cs2580;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by sanchitmehta on 26/10/16.
 */
public class HTMLParse {

    public HTMLDocument getDocument(File fileName) throws IOException {

        org.jsoup.nodes.Document doc = Jsoup.parse(fileName, "UTF-8", "https://en.wikipedia.org/wiki/Courant_Institute_of_Mathematical_Sciences");
        Element body = doc.body();
        System.out.println(doc.title().replaceFirst("- Wikipedia, the free encyclopedia",""));
        String bodyText = new String(body.text().toLowerCase());
        String title = doc.title();
        HTMLDocument htmlDoc = new HTMLDocument(bodyText,title);
        return htmlDoc;
    }
}

package info.srihawong.wordpressreader;

import android.util.Log;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by godsid on 4/2/14.
 */
public class XMLParser {
    //Vars to save the info
    private String text;
    private String number;

    private MyParser myparser;

    public void fetchInfo(String urls) {
        try {
            URL url = new URL(urls);

            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            XMLReader xr = sp.getXMLReader();



            xr.setContentHandler(myparser);

            Log.i("ExampleParse", "Parsing starting");
            xr.parse(new InputSource(url.openStream()));
            Log.i("ExampleParse", "Parsing done");

            //Get parsed info
            text=myparser.getText();
            number=myparser.getNumber();

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FactoryConfigurationError e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

import java.io.FileWriter;
import java.io.IOException;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
public class CreateXMLFile {
    enum REST {
        Get, Put, Post, Delete;
    }
    public static void main(String[] args) {
        /*<?xml version="1.0" encoding="UTF-8"?>
            <cars>
              <supercars company="Ferrari">
                <carname type="formula one">Ferrari 101</carname>
                <carname type="sports">Ferrari 202</carname>
              </supercars>
            </cars>
        */

        try{
            //root element
            Element process = new Element("process");
            Document document = new Document();
            GenMethods m = new GenMethods();

            Element riot = m.GenerationRest(process, REST.Get, "http://capteurTemperature/declencher", "","",400);
            riot.detach();
            document.setRootElement(riot);

            XMLOutputter xmlOutput = new XMLOutputter();
            // display ml -----------------------------------------------------------------
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(document, System.out);

            // output to any OutputStream (creating file) ---------------------------------
            /*FileWriter fileWriter = new FileWriter("C:\\Users\\Lenovo\\file4.xml");
            xmlOutput.output(doc, fileWriter);*/

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
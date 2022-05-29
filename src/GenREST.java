import org.jdom2.Attribute;
import org.jdom2.Element;

public class GenREST {
    private Element root;
    private String Uri;

    public GenREST(Element root, String Uri){

    }
    public Element getRoot() {
        return root;
    }

    public void setRoot(Element root) {
        this.root = root;
    }

    public String getUri() {
        return Uri;
    }

    public void setUri(String uri) {
        Uri = uri;
    }

    //Methode de generation des activites REST dans le fichier XML -----
    public Element GenerationRest(Element root, REST Type, String uri){
        Element extensionActivity, var;
        Header header;

        //creation des activites REST --------------------------------
        extensionActivity = new Element("extensionActivity");
        switch (Type){
            case Get: var = new Element("Get");
                var.setAttribute("uri",uri);
            case Put: var = new Element("Put");
                var.setAttribute("uri",uri);
            case Post: var = new Element("Post");
                var.setAttribute("uri",uri);
            case Delete: var = new Element("Delete");
                var.setAttribute("uri",uri);
        }
        //creation du header ------------------------------------------


        return root;
    }
}

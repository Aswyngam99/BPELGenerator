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
    public Element GenerationRest(Element root, REST Type, String uri, String Accept, String Content_Type, int Code){
        Element extensionActivity, var;
        Element header;
        //creation des activites REST ----------------------------------------------------------------------------
        //Creation de l'activite d'extension--------------------------
        extensionActivity = new Element("extensionActivity");
        //creation du header ------------------------------------------
        header = new Element("header");
        header.setAttribute("accept",Accept);
        header.setAttribute("content-type",Content_Type);
        header.setAttribute("code",Integer.toString(Code));
        switch (Type){
            case Get: var = new Element("Get");
                var.setAttribute("uri",uri);
                extensionActivity.addContent(var);
                var.addContent(header);
            case Put: var = new Element("Put");
                var.setAttribute("uri",uri);
                extensionActivity.addContent(var);
                var.addContent(header);
            case Post: var = new Element("Post");
                var.setAttribute("uri",uri);
                extensionActivity.addContent(var);
                var.addContent(header);
            case Delete: var = new Element("Delete");
                var.setAttribute("uri",uri);
                extensionActivity.addContent(var);
                var.addContent(header);
        }
        root.addContent(extensionActivity);
        return root;
    }
}

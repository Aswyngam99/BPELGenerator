import org.jdom2.Element;

public class GenMethods {

    //Methode de generation des activites REST dans le fichier XML -----
    public Element GenerationRest(Element root, CreateXMLFile.REST Type, String uri, String Accept, String Content_Type, int Code){
        Element extensionActivity, var, header;
        //creation des activites REST ----------------------------------------------------------------------------
        //Creation de l'activite d'extension--------------------------
        extensionActivity = new Element("extensionActivity");
        //post,get,put,delete activites-------------------------------
        var = new Element("var");
        //creation du header ------------------------------------------
        header = new Element("header");
        header.setAttribute("accept",Accept);
        header.setAttribute("content-type",Content_Type);
        header.setAttribute("code",Integer.toString(Code));
        switch (Type){
            case Get: var = new Element("Get");
                var.setAttribute("uri",uri);
                /*System.out.println("get");*/
                break;
            case Put: var = new Element("Put");
                var.setAttribute("uri",uri);
                /*System.out.println("put");*/
                break;
            case Post: var = new Element("Post");
                var.setAttribute("uri",uri);
               /* System.out.println("post");*/
                break;
            case Delete: var = new Element("Delete");
                var.setAttribute("uri",uri);
                /*System.out.println("delete");*/
                break;
        }
        extensionActivity.addContent(var);
        var.addContent(header);
        root.addContent(extensionActivity);
        return root;
    }
}

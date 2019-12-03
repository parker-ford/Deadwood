// Example Code for parsing XML file
// Dr. Moushumi Sharmin
// CSCI 345

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ParseXML {

    private Scene[] allScene = new Scene[12];


    // building a document from the XML file
    // returns a Document object after loading the book.xml file.
    public Document getDocFromFile(String filename)
            throws ParserConfigurationException {
        {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = null;

            try {
                doc = db.parse(filename);
            } catch (Exception ex) {
                System.out.println("XML parse failure");
                ex.printStackTrace();
            }
            return doc;
        } // exception handling

    }

    // reads data from XML file and prints data
    public Scene[] readSceneData(Document d) {


        Element root = d.getDocumentElement();

        NodeList setlist = root.getElementsByTagName("set");


        for (int i = 0; i < setlist.getLength(); i++) {
            //make scene
            int setTakes;


            //reads data from the nodes
            Node set = setlist.item(i);
            String setName = set.getAttributes().getNamedItem("name").getNodeValue();
            allScene[i]=new Scene(setName);

            /*NodeList setChildNodes = set.getChildNodes();
            for(int j=0; j<setChildNodes.getLength(); j++){
                Node setChild = setChildNodes.item(j);
                if("takes".equals(setChild.getNodeName())){
                    NodeList takesChild = setChild.getChildNodes();
                    int counter = 0;
                    for(int k=0; k< takesChild.getLength(); k++){
                        System.out.println(takesChild.item(k).getNodeName());
                        if("take".equals(takesChild.item(k).getNodeName())){
                            counter++;
                            setTakes=counter;
                        }
                    }
                }
            }
            //int setTakes = takeList.getLength() ;
            System.out.println("4");
            NodeList partList = set.getAttributes().getNamedItem("parts").getChildNodes();
            System.out.println("5");
            //allScene[i].addScene(setName,setTakes);
            System.out.println("6");

            String[] partNamesArr = new String[partList.getLength()];
            String[] partLineArr = new String[partList.getLength()];
            int[] partNumArr = new int[partList.getLength()];
            for(int j=0; j<partList.getLength(); j++){
                Node part = partList.item(j);
                partNamesArr[j]=part.getAttributes().getNamedItem("name").getNodeValue();
                partLineArr[j]=part.getAttributes().getNamedItem("").getNodeValue();
                partNumArr[j]=Integer.parseInt(part.getAttributes().getNamedItem("level").getNodeValue());
                allScene[i].addPart(partNamesArr[j],partLineArr[j],partNumArr[j]);
                System.out.println(partNamesArr[j] + " name");
                System.out.println(partLineArr[j] + " line");
                System.out.println(partNumArr[j] + " num");*/
        }
        allScene[10]= new Scene("Trailer");
        allScene[11] = new Scene("Office");
        return allScene;


    }
}//class
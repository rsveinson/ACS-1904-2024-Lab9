import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
 */

public class CatsXML{
    public static void main(String[] args)throws FileNotFoundException {
        ArrayList<Cat> cats = new ArrayList<>();

        // add some cats
        cats.add(new Cat("Emerson", 17));
        cats.add(new Cat("Rincewind", 1));
        cats.add(new Cat("Alax", 16));

        printList(cats);

        // **** write the cats to an xml file ****
        // open the output stream
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("cats.xml"));

        /* write the ArrayList to the file
         * one Cat at a time
         */
        for(Cat c : cats){
            encoder.writeObject(c);
        }
        encoder.close();

        //*******************************************************
        /* add your code below to  open
         * the stream, read the Cat objects
         * from the XML file and
         * print them to the terminal window.
         */
        

        // ****** now read it back *************
        System.out.println();
        System.out.println("--------------- Print file contents ---------------");
        
        XMLDecoder decoder = null;
        /*use a try-catch here to open the stream
         * or print a "File Not Fount" error and set 
         * decoder to null if the file is not found.
         */
        

        ArrayList<Cat> newCats = new ArrayList<>();

        if(decoder != null){
            System.out.println("Reading XML file.");
            loadCats(newCats, decoder);
            decoder.close();
        }// end decoder not null

        System.out.println();
        printList(newCats);
        

        System.out.println("end of program");
    }

    public static void loadCats(ArrayList<Cat> cats, XMLDecoder decoder){
        /* add you code here to read Cat objects
         * from the stream until end of file is reached.
         * 
         */
    }

    /*****************************************
     * Description: Print a list of Cats
     * 
     * @param        ArrayList<Cat>: a list of cats
     * 
     * @return       nothing
     * ****************************************/
    public static void printList(ArrayList<Cat> list){
        for(Cat c : list){
            System.out.println(c);
        }
    }
}


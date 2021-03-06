package com.phenix.adobepremiereproject;

import com.phenix.adobepremiereproject.AdobeTitle.Font.ChicagoFont;
import com.phenix.adobepremiereproject.AdobeTitle.Text;
import java.io.IOException;

/**
 * Test la classe de génération de projet Adobe.
 *
 * @author Edouard
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Helloow");

        AdobePremiereProject projet = new AdobePremiereProject("C:\\TMP\\Razzia_FTR_PR422HQ");

        // --- Elements ---
        /*Folder elements = new Folder("ELEMENTS", true);
        projet.addElement(elements);

        {
            Folder image = new Folder(elements, "IMAGE", true);

            projet.addElement(image);
            projet.addElement(new Folder(image, "1.77", false));
            projet.addElement(new Folder(image, "2.39", false));
        }
        {
            Folder audio = new Folder(elements, "AUDIO", true);
            projet.addElement(audio);

            {
                Folder audio_24 = new Folder(audio, "24", false);
                projet.addElement(audio_24);

                Folder audio_25 = new Folder(audio, "25", false);
                projet.addElement(audio_25);
            }
        }

        // --- Exports ---
        Folder export = new Folder("EXPORTS", true);
        projet.addElement(export);

        {
            projet.addElement(new Folder(export, "_REF", false));
            projet.addElement(new Folder(export, "PAD", false));
            projet.addElement(new Folder(export, "MASTER", false));
            projet.addElement(new Folder(export, "H264", false));
            projet.addElement(new Folder(export, "DVD", false));
            projet.addElement(new Folder(export, "BLU-RAY", false));
        }*/
        Title titre = new Title("TITRE");

        Text a = new Text();
        a.setText("A");
        a.setPositionX(0);
        a.setPositionY(0);
        a.setFont(new ChicagoFont());
        a.setItalic(true);

        titre.addText(a);

        Sequence sequence = new Sequence("sequence");

        // Ajoute le titre à la séquence.
        //sequence.add(titre);
        projet.addElement(sequence);

        projet.addElement(titre);
        try {
            // Génère le projet.
            projet.close();
        } catch (IOException ex) {
            System.out.println("Erreur : " + ex);
        }

    }

}

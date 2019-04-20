/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostgreSQL;

import com.itextpdf.text.Document;

import com.itextpdf.text.DocumentException;

import com.itextpdf.text.Paragraph;

import com.itextpdf.text.Rectangle;

import com.itextpdf.text.pdf.PdfPTable;

import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Desktop;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import javax.swing.JFileChooser;

import javax.swing.filechooser.FileNameExtensionFilter;

public class GeneraPDF {

    public void createPDFTable(PdfPTable tabla2, File Destino, Rectangle TamanioPagina) {

        /*Declaramos documento como un objeto Document

         Asignamos el tamaño de hoja y los margenes */

        Document documento = new Document(TamanioPagina, 80, 80, 75, 75);

        //writer es declarado como el método utilizado para escribir en el archivo

        PdfWriter writer = null;

        try {

            //Obtenemos la instancia del archivo a utilizar

            writer = PdfWriter.getInstance(documento, new FileOutputStream(Destino + ".pdf"));

        } catch (FileNotFoundException | DocumentException ex) {

            ex.getMessage();

        }

        //Agregamos un titulo al archivo

        documento.addTitle("Archivo pdf generado desde Java");

        //Agregamos el autor del archivo

        documento.addAuthor("Robert");

        //Abrimos el documento para edición

        documento.open();

        try {

            documento.add(new Paragraph(" "));

            documento.add(tabla2);

        } catch (DocumentException ex) {

            ex.getMessage();

        }

        documento.close(); //Cerramos el documento

        writer.close(); //Cerramos writer

        try {

            File path  = new File(Destino + ".pdf");

            Desktop.getDesktop().open(path);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void createPDFText(String jText, File Destino, Rectangle TamanioPagina) {

        /*Declaramos documento como un objeto Document

         Asignamos el tamaño de hoja y los margenes */

        Document documento = new Document(TamanioPagina, 80, 80, 75, 75);

        //writer es declarado como el método utilizado para escribir en el archivo

        PdfWriter writer = null;

        try {

            //Obtenemos la instancia del archivo a utilizar

            writer = PdfWriter.getInstance(documento, new FileOutputStream(Destino + ".pdf"));

        } catch (FileNotFoundException | DocumentException ex) {

            ex.getMessage();

        }

        //Agregamos un titulo al archivo

        documento.addTitle("Archivo pdf generado desde Java");

        //Agregamos el autor del archivo

        documento.addAuthor("Robert");

        //Abrimos el documento para edición

        documento.open();

        //Declaramos un texto como Paragraph

        //Le podemos dar formado como alineación, tamaño y color a la fuente.

        Paragraph parrafo = new Paragraph();

        parrafo.setAlignment(Paragraph.ALIGN_JUSTIFIED);

        //parrafo.setFont(FontFactory.getFont("Sans", 20, Font.BOLD, BaseColor.BLUE));

        parrafo.add(jText);

        try {

            //Agregamos el texto al documento

            documento.add(parrafo);

            //Agregamos un salto de linea

            documento.add(new Paragraph(" "));

        } catch (DocumentException ex) {

            ex.getMessage();

        }

        documento.close(); //Cerramos el documento

        writer.close(); //Cerramos writer

        try {

            File path = new File(Destino + ".pdf");

            Desktop.getDesktop().open(path);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void createPdfTextTable(PdfPTable tabla2, String jText, File Destino, Rectangle TamanioPagina) {

        /*Declaramos documento como un objeto Document

         Asignamos el tamaño de hoja y los margenes */

        Document documento = new Document(TamanioPagina, 80, 80, 75, 75);

        //writer es declarado como el método utilizado para escribir en el archivo

        PdfWriter writer = null;

        try {

            //Obtenemos la instancia del archivo a utilizar

            writer = PdfWriter.getInstance(documento, new FileOutputStream(Destino + ".pdf"));

        } catch (FileNotFoundException | DocumentException ex) {

            ex.getMessage();

        }

        //Agregamos un titulo al archivo

        documento.addTitle("Archivo pdf generado desde Java");

        //Agregamos el autor del archivo

        documento.addAuthor("Robert");

        //Abrimos el documento para edición

        documento.open();

        //Declaramos un texto como Paragraph

        //Le podemos dar formado como alineación, tamaño y color a la fuente.

        Paragraph parrafo = new Paragraph();

        parrafo.setAlignment(Paragraph.ALIGN_JUSTIFIED);

        parrafo.add(jText);

        try {

            //Agregamos el texto al documento

            documento.add(parrafo);

            //Agregamos un salto de linea

            documento.add(new Paragraph(" "));

            //Agregamos la tabla al documento haciendo

            //la llamada al método tabla()

            documento.add(tabla2);

        } catch (DocumentException ex) {

            ex.getMessage();

        }

        documento.close(); //Cerramos el documento

        writer.close(); //Cerramos writer

        try {

            File path = new File(Destino + ".pdf");

            Desktop.getDesktop().open(path);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public File Colocar_Destino(File ruta_destino) {

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF", "pdf", "PDF");

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileFilter(filter);

        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {

            ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();

        }

        return ruta_destino;

    }

}


package com.example.demo;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import java.io.FileOutputStream;

public class Prueba {

    private static final String DESTINATION = "src/main/resources/prueba.pdf";

    public static void prueba() throws Exception {
        try {

            // Crear un FileOutputStream para guardar el PDF en un archivo
            FileOutputStream fos = new FileOutputStream(DESTINATION);

            // Crear un PdfWriter para escribir en el FileOutputStream
            PdfWriter writer = new PdfWriter(fos);

            // Crear un PdfDocument
            PdfDocument pdfDoc = new PdfDocument(writer);

            // Crear un Document para agregar contenido
            Document document = new Document(pdfDoc);

            // Crear un formulario
            PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);

            // Crear un campo de texto
            PdfTextFormField textField = PdfTextFormField.createText(pdfDoc, new com.itextpdf.kernel.geom.Rectangle(50, 750, 200, 20), "textField", "Texto inicial");
            textField.setFontSize(5);
            form.addField(textField);
            
               // Crear un formulario
            PdfAcroForm form2 = PdfAcroForm.getAcroForm(pdfDoc, false);
            form2.getField("textField").setValue("otro texto");

            // Cerrar el documento
            document.close();

            // Confirmar que el PDF fue creado
            System.out.println("PDF creado y guardado en 'src/main/resources/prueba.pdf' con éxito!");

        } catch (Exception e) {
            throw e;
        }
    }

}

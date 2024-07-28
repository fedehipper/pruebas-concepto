package com.example.demo.controller.rest;

import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import static com.itextpdf.forms.fields.PdfFormField.createText;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import java.util.HashMap;
import java.util.Map;

public class FormularioPdf {

    private static final String SOURCE = "src/main/resources/documento.pdf";
    private static final String DESTINATION = "src/main/resources/documento-modified.pdf";
    private static final String DESTINATION_CON_VALORES = "src/main/resources/documento-con-valores.pdf";

    public static void agregarFormulario() throws IOException {
        PdfReader reader = new PdfReader(SOURCE);
        PdfWriter writer = new PdfWriter(DESTINATION);
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        agregarFormulario(pdfDocument);
    }

    private static void agregarFormulario(PdfDocument pdfDocument) throws MalformedURLException {

        Map<String, PdfTextFormField> camposPaginaUno = new HashMap<>();
        camposPaginaUno.put("campoA", createText(pdfDocument, new Rectangle(235, 650, 224, 9), "nameA", ""));
        camposPaginaUno.put("campoB", createText(pdfDocument, new Rectangle(475, 650, 35, 9), "nameB", ""));
        camposPaginaUno.put("campoC", createText(pdfDocument, new Rectangle(227, 616, 215, 11), "nameC", ""));
        camposPaginaUno.put("campoD", createText(pdfDocument, new Rectangle(92, 597, 114, 11), "nameD", ""));
        camposPaginaUno.put("campoE", createText(pdfDocument, new Rectangle(174, 580, 164, 11), "nameE", ""));
        camposPaginaUno.put("campoF", createText(pdfDocument, new Rectangle(355, 580, 35, 11), "nameF", ""));
        camposPaginaUno.put("campoG", createText(pdfDocument, new Rectangle(414, 580, 23, 11), "nameG", ""));
        camposPaginaUno.put("campoH", createText(pdfDocument, new Rectangle(470, 580, 50, 11), "nameH", ""));
        camposPaginaUno.put("campoI", createText(pdfDocument, new Rectangle(136, 563, 84, 11), "nameI", ""));
        camposPaginaUno.put("campoJ", createText(pdfDocument, new Rectangle(243, 563, 60, 11), "nameJ", ""));
        camposPaginaUno.put("campoK", createText(pdfDocument, new Rectangle(358, 563, 115, 11), "nameK", ""));
        camposPaginaUno.put("campoL", createText(pdfDocument, new Rectangle(180, 545, 203, 11), "nameL", ""));
        camposPaginaUno.put("campoM", createText(pdfDocument, new Rectangle(246, 525, 10, 11), "nameM", ""));
        camposPaginaUno.put("campoN", createText(pdfDocument, new Rectangle(322, 525, 10, 11), "nameN", ""));
        camposPaginaUno.put("campoO", createText(pdfDocument, new Rectangle(92, 472, 10, 11), "nameO", ""));
        camposPaginaUno.put("campoP", createText(pdfDocument, new Rectangle(151, 472, 10, 11), "nameP", ""));
        camposPaginaUno.put("campoQ", createText(pdfDocument, new Rectangle(244, 470, 10, 11), "nameQ", ""));
        camposPaginaUno.put("campoR", createText(pdfDocument, new Rectangle(340, 470, 10, 11), "nameR", ""));
        camposPaginaUno.put("campoS", createText(pdfDocument, new Rectangle(92, 437, 145, 11), "nameS", ""));
        camposPaginaUno.put("campoT", createText(pdfDocument, new Rectangle(242, 437, 107, 11), "nameT", ""));
        camposPaginaUno.put("campoU", createText(pdfDocument, new Rectangle(369, 437, 32, 11), "nameU", ""));
        camposPaginaUno.put("campoV", createText(pdfDocument, new Rectangle(451, 437, 68, 11), "nameV", ""));
        camposPaginaUno.put("campoW", createText(pdfDocument, new Rectangle(160, 418, 65, 11), "nameW", ""));
        camposPaginaUno.put("campoX", createText(pdfDocument, new Rectangle(92, 401, 15, 11), "nameX", ""));
        camposPaginaUno.put("campoY", createText(pdfDocument, new Rectangle(128, 401, 15, 11), "nameY", ""));
        camposPaginaUno.put("campoZ", createText(pdfDocument, new Rectangle(158, 401, 26, 11), "nameZ", ""));
        camposPaginaUno.put("campoAA", createText(pdfDocument, new Rectangle(231, 401, 25, 11), "nameAA", ""));
        camposPaginaUno.put("campoAB", createText(pdfDocument, new Rectangle(433, 250, 100, 22), "nameAB", ""));
        camposPaginaUno.put("campoAC", createText(pdfDocument, new Rectangle(433, 231, 100, 22), "nameAC", ""));
        camposPaginaUno.put("campoAD", createText(pdfDocument, new Rectangle(433, 212, 100, 22), "nameAD", ""));
        camposPaginaUno.put("campoAE", createText(pdfDocument, new Rectangle(433, 164, 100, 50), "nameAE", ""));
        camposPaginaUno.put("campoCheckTablaA", createText(pdfDocument, new Rectangle(92, 173, 12, 11), "nameCheckTablaA", ""));
        camposPaginaUno.put("campoCheckTablaB", createText(pdfDocument, new Rectangle(181, 173, 12, 11), "nameCheckTablaB", ""));
        camposPaginaUno.put("campoCheckTablaC", createText(pdfDocument, new Rectangle(255, 165, 20, 26), "nameCheckTablaC", ""));
        camposPaginaUno.put("campoCheckTablaD", createText(pdfDocument, new Rectangle(285, 173, 12, 11), "nameCheckTablaD", ""));
        camposPaginaUno.put("campoCheckTablaE", createText(pdfDocument, new Rectangle(345, 170, 20, 26), "nameCheckTablaE", ""));
        camposPaginaUno.put("campoAF", createText(pdfDocument, new Rectangle(433, 144, 100, 22), "nameAF", ""));
        camposPaginaUno.put("campoAG", createText(pdfDocument, new Rectangle(433, 125, 100, 22), "nameAG", ""));
        camposPaginaUno.put("campoAH", createText(pdfDocument, new Rectangle(433, 102, 100, 27), "nameAH", ""));
        camposPaginaUno.put("campoAI", createText(pdfDocument, new Rectangle(433, 82, 100, 22), "nameAI", ""));
        camposPaginaUno.put("campoAJ", createText(pdfDocument, new Rectangle(433, 82, 100, 22), "nameAJ", ""));

        camposPaginaUno
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    formField.setFontSize(10);
                    PdfTextFormField textFormatField = camposPaginaUno.get(key);
                    formField.addKid(textFormatField);
                    PdfAcroForm.getAcroForm(pdfDocument, true)
                            .addField(formField, pdfDocument.getPage(1));
                });

        Map<String, PdfTextFormField> camposPaginaDos = new HashMap<>();
        camposPaginaDos.put("campoAK", createText(pdfDocument, new Rectangle(432, 703, 100, 22), "nameAK", ""));
        camposPaginaDos.put("campoAL", createText(pdfDocument, new Rectangle(432, 657, 100, 50), "nameAL", ""));
        camposPaginaDos.put("campoCheckTablaF", createText(pdfDocument, new Rectangle(92, 667, 12, 11), "nameCheckTablaF", ""));
        camposPaginaDos.put("campoCheckTablaG", createText(pdfDocument, new Rectangle(232, 667, 12, 11), "nameCheckTablaG", ""));
        camposPaginaDos.put("campoAM", createText(pdfDocument, new Rectangle(432, 632, 100, 27), "nameAM", ""));
        camposPaginaDos.put("campoAN", createText(pdfDocument, new Rectangle(432, 608, 100, 27), "nameAN", ""));
        camposPaginaDos.put("campoAO", createText(pdfDocument, new Rectangle(432, 584, 100, 27), "nameAO", ""));
        camposPaginaDos.put("campoAP", createText(pdfDocument, new Rectangle(432, 565, 100, 20), "nameAP", ""));
        camposPaginaDos.put("campoAQ", createText(pdfDocument, new Rectangle(432, 545, 100, 20), "nameAQ", ""));
        camposPaginaDos.put("campoAR", createText(pdfDocument, new Rectangle(432, 526, 100, 20), "nameAR", ""));
        camposPaginaDos.put("campoAS", createText(pdfDocument, new Rectangle(432, 508, 100, 20), "nameAS", ""));
        camposPaginaDos.put("campoAT", createText(pdfDocument, new Rectangle(432, 488, 100, 20), "nameAT", ""));
        camposPaginaDos.put("campoAU", createText(pdfDocument, new Rectangle(439, 330, 80, 26), "nameAU", ""));
        camposPaginaDos.put("campoAV", createText(pdfDocument, new Rectangle(439, 310, 80, 22), "nameAV", ""));
        camposPaginaDos.put("campoAW", createText(pdfDocument, new Rectangle(439, 292, 80, 22), "nameAW", ""));
        camposPaginaDos.put("campoAX", createText(pdfDocument, new Rectangle(439, 273, 80, 22), "nameAX", ""));
        camposPaginaDos.put("campoAY", createText(pdfDocument, new Rectangle(439, 252, 80, 22), "nameAY", ""));

        camposPaginaDos
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    formField.setFontSize(10);
                    PdfTextFormField textFormatField = camposPaginaDos.get(key);
                    formField.addKid(textFormatField);
                    PdfAcroForm.getAcroForm(pdfDocument, true)
                            .addField(formField, pdfDocument.getPage(2));
                });

        Map<String, PdfTextFormField> camposPaginaTres = new HashMap<>();
        camposPaginaTres.put("campoAZ", createText(pdfDocument, new Rectangle(325, 278, 179, 22), "nameAY", ""));
        camposPaginaTres.put("campoBA", createText(pdfDocument, new Rectangle(91, 278, 179, 22), "nameBA", ""));
        camposPaginaTres.put("campoBB", createText(pdfDocument, new Rectangle(200, 208, 115, 22), "nameBB", ""));
        camposPaginaTres.put("campoBC", createText(pdfDocument, new Rectangle(251, 185, 140, 22), "nameBC", ""));
        camposPaginaTres.put("campoBD", createText(pdfDocument, new Rectangle(186, 597, 245, 22), "nameBD", ""));
        camposPaginaTres.put("campoBE", createText(pdfDocument, new Rectangle(186, 372, 245, 22), "nameBE", ""));
        camposPaginaTres.put("campoBF", createText(pdfDocument, new Rectangle(50, 480, 225, 22), "nameBF", ""));
        camposPaginaTres.put("campoBG", createText(pdfDocument, new Rectangle(350, 480, 225, 22), "nameBG", ""));

        camposPaginaTres
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    formField.setFontSize(10);
                    PdfTextFormField textFormatField = camposPaginaTres.get(key);
                    formField.addKid(textFormatField);
                    PdfAcroForm.getAcroForm(pdfDocument, true)
                            .addField(formField, pdfDocument.getPage(3));
                });

        Document document = new Document(pdfDocument);
        document.close();
    }

    public static void agregarValoresAlFormulario() throws IOException {
        PdfReader reader = new PdfReader(DESTINATION);
        PdfWriter writer = new PdfWriter(DESTINATION_CON_VALORES);
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        agregarValores(pdfDocument);
        
        Document document = new Document(pdfDocument);
        document.close();
    }

    private static void agregarValores(PdfDocument pdfDocument) {
        // para ver todos los campos del formulario
        PdfAcroForm.getAcroForm(pdfDocument,false).getFormFields();
        
        
        // para setearle un valor
        PdfAcroForm.getAcroForm(pdfDocument, false)
               .getField("campoCheckTablaG").setValue("X");
    }

}

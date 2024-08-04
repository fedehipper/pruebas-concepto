package com.example.demo;

import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import static com.itextpdf.forms.fields.PdfFormField.createText;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;

import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import java.util.HashMap;
import java.util.Map;

public class FormularioPdf {

    private static final String SOURCE = "src/main/resources/documento.pdf";
    private static final String DESTINATION = "src/main/resources/documento-modificado.pdf";
    private static final String DESTINATION_CON_VALORES = "src/main/resources/documento-con-valores.pdf";

    public static void agregarFormulario() throws IOException {
        PdfReader reader = new PdfReader(SOURCE);
        PdfWriter writer = new PdfWriter(DESTINATION);
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        agregarFormulario(pdfDocument);
    }

    private static void agregarFormulario(PdfDocument pdfDocument) throws MalformedURLException {

        Map<String, PdfTextFormField> camposPaginaUno = new HashMap<>();
        camposPaginaUno.put("usuario", createText(pdfDocument, new Rectangle(151, 585, 380, 10), "usuario", ""));
        camposPaginaUno.put("domicilio", createText(pdfDocument, new Rectangle(154, 569, 375, 10), "domicilio", ""));
        camposPaginaUno.put("superficieCubierta", createText(pdfDocument, new Rectangle(184, 553, 345, 10), "superficieCubierta", ""));
        camposPaginaUno.put("destino", createText(pdfDocument, new Rectangle(144, 537, 384, 10), "destino", ""));
        camposPaginaUno.put("cantidadOperarios", createText(pdfDocument, new Rectangle(233, 521, 295, 10), "cantidadOperarios", ""));

        camposPaginaUno.put("cantidadA", createText(pdfDocument, new Rectangle(80, 439, 58, 10), "cantidadA", ""));
        camposPaginaUno.put("descripcionA", createText(pdfDocument, new Rectangle(142, 439, 113, 10), "descripcionA", ""));
        camposPaginaUno.put("hpA", createText(pdfDocument, new Rectangle(257, 439, 109, 10), "hpA", ""));
        camposPaginaUno.put("kwA", createText(pdfDocument, new Rectangle(367, 439, 160, 10), "kwA", ""));

        camposPaginaUno.put("cantidadB", createText(pdfDocument, new Rectangle(80, 427, 58, 10), "cantidadB", ""));
        camposPaginaUno.put("descripcionB", createText(pdfDocument, new Rectangle(142, 427, 113, 10), "descripcionB", ""));
        camposPaginaUno.put("hpB", createText(pdfDocument, new Rectangle(257, 427, 109, 10), "hpB", ""));
        camposPaginaUno.put("kwB", createText(pdfDocument, new Rectangle(367, 427, 160, 10), "kwB", ""));

        camposPaginaUno.put("cantidadC", createText(pdfDocument, new Rectangle(80, 416, 58, 10), "cantidadC", ""));
        camposPaginaUno.put("descripcionC", createText(pdfDocument, new Rectangle(142, 416, 113, 10), "descripcionC", ""));
        camposPaginaUno.put("hpC", createText(pdfDocument, new Rectangle(257, 416, 109, 10), "hpC", ""));
        camposPaginaUno.put("kwC", createText(pdfDocument, new Rectangle(367, 416, 160, 10), "kwC", ""));

        camposPaginaUno.put("cantidadD", createText(pdfDocument, new Rectangle(80, 405, 58, 10), "cantidadD", ""));
        camposPaginaUno.put("descripcionD", createText(pdfDocument, new Rectangle(142, 405, 113, 10), "descripcionD", ""));
        camposPaginaUno.put("hpD", createText(pdfDocument, new Rectangle(257, 405, 109, 10), "hpD", ""));
        camposPaginaUno.put("kwD", createText(pdfDocument, new Rectangle(367, 405, 160, 10), "kwD", ""));

        camposPaginaUno.put("cantidadE", createText(pdfDocument, new Rectangle(80, 394, 58, 10), "cantidadE", ""));
        camposPaginaUno.put("descripcionE", createText(pdfDocument, new Rectangle(142, 394, 113, 10), "descripcionE", ""));
        camposPaginaUno.put("hpE", createText(pdfDocument, new Rectangle(257, 394, 109, 10), "hpE", ""));
        camposPaginaUno.put("kwE", createText(pdfDocument, new Rectangle(367, 394, 160, 10), "kwE", ""));

        camposPaginaUno.put("cantidadF", createText(pdfDocument, new Rectangle(80, 383, 58, 10), "cantidadF", ""));
        camposPaginaUno.put("descripcionF", createText(pdfDocument, new Rectangle(142, 383, 113, 10), "descripcionF", ""));
        camposPaginaUno.put("hpF", createText(pdfDocument, new Rectangle(257, 383, 109, 10), "hpF", ""));
        camposPaginaUno.put("kwF", createText(pdfDocument, new Rectangle(367, 383, 160, 10), "kwF", ""));

        camposPaginaUno.put("cantidadG", createText(pdfDocument, new Rectangle(80, 372, 58, 10), "cantidadG", ""));
        camposPaginaUno.put("descripcionG", createText(pdfDocument, new Rectangle(142, 372, 113, 10), "descripcionG", ""));
        camposPaginaUno.put("hpG", createText(pdfDocument, new Rectangle(257, 372, 109, 10), "hpG", ""));
        camposPaginaUno.put("kwG", createText(pdfDocument, new Rectangle(367, 372, 160, 10), "kwG", ""));

        camposPaginaUno.put("cantidadH", createText(pdfDocument, new Rectangle(80, 361, 58, 10), "cantidadH", ""));
        camposPaginaUno.put("descripcionH", createText(pdfDocument, new Rectangle(142, 361, 113, 10), "descripcionH", ""));
        camposPaginaUno.put("hpH", createText(pdfDocument, new Rectangle(257, 361, 109, 10), "hpH", ""));
        camposPaginaUno.put("kwH", createText(pdfDocument, new Rectangle(367, 361, 160, 10), "kwH", ""));

        camposPaginaUno.put("cantidadI", createText(pdfDocument, new Rectangle(80, 350, 58, 10), "cantidadI", ""));
        camposPaginaUno.put("descripcionI", createText(pdfDocument, new Rectangle(142, 350, 113, 10), "descripcionI", ""));
        camposPaginaUno.put("hpI", createText(pdfDocument, new Rectangle(257, 350, 109, 10), "hpI", ""));
        camposPaginaUno.put("kwI", createText(pdfDocument, new Rectangle(367, 350, 160, 10), "kwI", ""));

        camposPaginaUno.put("cantidadJ", createText(pdfDocument, new Rectangle(80, 339, 58, 10), "cantidadJ", ""));
        camposPaginaUno.put("descripcionJ", createText(pdfDocument, new Rectangle(142, 339, 113, 10), "descripcionJ", ""));
        camposPaginaUno.put("hpJ", createText(pdfDocument, new Rectangle(257, 339, 109, 10), "hpJ", ""));
        camposPaginaUno.put("kwJ", createText(pdfDocument, new Rectangle(367, 339, 160, 10), "kwJ", ""));

        camposPaginaUno.put("cantidadK", createText(pdfDocument, new Rectangle(80, 328, 58, 10), "cantidadK", ""));
        camposPaginaUno.put("descripcionK", createText(pdfDocument, new Rectangle(142, 328, 113, 10), "descripcionK", ""));
        camposPaginaUno.put("hpK", createText(pdfDocument, new Rectangle(257, 328, 109, 10), "hpK", ""));
        camposPaginaUno.put("kwK", createText(pdfDocument, new Rectangle(367, 328, 160, 10), "kwK", ""));

        camposPaginaUno.put("cantidadL", createText(pdfDocument, new Rectangle(80, 317, 58, 10), "cantidadL", ""));
        camposPaginaUno.put("descripcionL", createText(pdfDocument, new Rectangle(142, 317, 113, 10), "descripcionL", ""));
        camposPaginaUno.put("hpL", createText(pdfDocument, new Rectangle(257, 317, 109, 10), "hpL", ""));
        camposPaginaUno.put("kwL", createText(pdfDocument, new Rectangle(367, 317, 160, 10), "kwL", ""));

        camposPaginaUno.put("cantidadM", createText(pdfDocument, new Rectangle(80, 306, 58, 10), "cantidadM", ""));
        camposPaginaUno.put("descripcionM", createText(pdfDocument, new Rectangle(142, 306, 113, 10), "descripcionM", ""));
        camposPaginaUno.put("hpM", createText(pdfDocument, new Rectangle(257, 306, 109, 10), "hpM", ""));
        camposPaginaUno.put("kwM", createText(pdfDocument, new Rectangle(367, 306, 160, 10), "kwM", ""));

        camposPaginaUno.put("cantidadN", createText(pdfDocument, new Rectangle(80, 295, 58, 10), "cantidadN", ""));
        camposPaginaUno.put("descripcionN", createText(pdfDocument, new Rectangle(142, 295, 113, 10), "descripcionN", ""));
        camposPaginaUno.put("hpN", createText(pdfDocument, new Rectangle(257, 295, 109, 10), "hpN", ""));
        camposPaginaUno.put("kwN", createText(pdfDocument, new Rectangle(367, 295, 160, 10), "kwN", ""));

        camposPaginaUno.put("cantidadO", createText(pdfDocument, new Rectangle(80, 280, 58, 10), "cantidadO", ""));
        camposPaginaUno.put("descripcionO", createText(pdfDocument, new Rectangle(142, 280, 113, 10), "descripcionO", ""));
        camposPaginaUno.put("hpO", createText(pdfDocument, new Rectangle(257, 280, 109, 10), "hpO", ""));
        camposPaginaUno.put("kwO", createText(pdfDocument, new Rectangle(367, 280, 160, 10), "kwO", ""));

        camposPaginaUno.put("cantidadP", createText(pdfDocument, new Rectangle(80, 267, 58, 10), "cantidadP", ""));
        camposPaginaUno.put("descripcionP", createText(pdfDocument, new Rectangle(142, 267, 113, 10), "descripcionP", ""));
        camposPaginaUno.put("hpP", createText(pdfDocument, new Rectangle(257, 267, 109, 10), "hpP", ""));
        camposPaginaUno.put("kwP", createText(pdfDocument, new Rectangle(367, 267, 160, 10), "kwP", ""));

        camposPaginaUno.put("potenciaTotal", createText(pdfDocument, new Rectangle(242, 245, 105, 10), "potenciaTotal", ""));
        camposPaginaUno.put("potenciaMaxima", createText(pdfDocument, new Rectangle(257, 219, 90, 10), "potenciaMaxima", ""));

        camposPaginaUno.put("firma", createText(pdfDocument, new Rectangle(75, 120, 90, 10), "firma", ""));
        camposPaginaUno.put("fecha", createText(pdfDocument, new Rectangle(225, 120, 90, 10), "fecha", ""));
        camposPaginaUno.put("aclaracion", createText(pdfDocument, new Rectangle(360, 120, 90, 10), "aclaracion", ""));

        camposPaginaUno
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    PdfTextFormField textFormatField = camposPaginaUno.get(key);
                    textFormatField.setFontSizeAutoScale();
                    textFormatField.setColor(ColorConstants.BLUE);
                    formField.addKid(textFormatField);
                    PdfAcroForm.getAcroForm(pdfDocument, true)
                            .addField(formField, pdfDocument.getPage(1));
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
        PdfAcroForm.getAcroForm(pdfDocument, false).getFormFields();

        // para setearle un valor
        Map<String, String> campoConValor = new HashMap<>();
        campoConValor.put("usuario", "Un usuario");

        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(pdfDocument, true);
        campoConValor
                .keySet()
                .forEach(claveCampoConValor -> {
                    acroForm
                            .getField(claveCampoConValor)
                            .setValue(campoConValor.get(claveCampoConValor));
                });

        acroForm.flattenFields();
        pdfDocument.close();

    }

}

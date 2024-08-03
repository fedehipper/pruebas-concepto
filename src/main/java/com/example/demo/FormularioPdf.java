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
        camposPaginaUno.put("calle", createText(pdfDocument, new Rectangle(124, 646, 267, 10), "calle", ""));
        camposPaginaUno.put("numero", createText(pdfDocument, new Rectangle(410, 646, 100, 10), "numero", ""));
        camposPaginaUno.put("entreCalleA", createText(pdfDocument, new Rectangle(124, 632, 194, 10), "entreCalleA", ""));
        camposPaginaUno.put("entreCalleB", createText(pdfDocument, new Rectangle(330, 632, 180, 10), "entreCalleB", ""));
        camposPaginaUno.put("localidad", createText(pdfDocument, new Rectangle(152, 618, 235, 10), "localidad", ""));
        camposPaginaUno.put("partido", createText(pdfDocument, new Rectangle(140, 605, 245, 10), "partido", ""));
        camposPaginaUno.put("codigoPostal", createText(pdfDocument, new Rectangle(181, 591, 144, 10), "codigoPostal", ""));
        camposPaginaUno.put("telefono", createText(pdfDocument, new Rectangle(351, 591, 156, 10), "telefono", ""));

        camposPaginaUno.put("cantidadA", createText(pdfDocument, new Rectangle(84, 530, 73, 10), "cantidadA", ""));
        camposPaginaUno.put("tipoArtefactoA", createText(pdfDocument, new Rectangle(155, 530, 180, 10), "tipoArtefactoA", ""));
        camposPaginaUno.put("hpA", createText(pdfDocument, new Rectangle(333, 530, 93, 10), "hpA", ""));
        camposPaginaUno.put("kwA", createText(pdfDocument, new Rectangle(425, 530, 85, 10), "kwA", ""));

        camposPaginaUno.put("cantidadB", createText(pdfDocument, new Rectangle(84, 517, 73, 10), "cantidadB", ""));
        camposPaginaUno.put("tipoArtefactoB", createText(pdfDocument, new Rectangle(155, 517, 180, 10), "tipoArtefactoB", ""));
        camposPaginaUno.put("hpB", createText(pdfDocument, new Rectangle(333, 517, 93, 10), "hpB", ""));
        camposPaginaUno.put("kwB", createText(pdfDocument, new Rectangle(425, 517, 85, 10), "kwB", ""));

        camposPaginaUno.put("cantidadC", createText(pdfDocument, new Rectangle(84, 504, 73, 10), "cantidadC", ""));
        camposPaginaUno.put("tipoArtefactoC", createText(pdfDocument, new Rectangle(155, 504, 180, 10), "tipoArtefactoC", ""));
        camposPaginaUno.put("hpC", createText(pdfDocument, new Rectangle(333, 504, 93, 10), "hpC", ""));
        camposPaginaUno.put("kwC", createText(pdfDocument, new Rectangle(425, 504, 85, 10), "kwC", ""));

        camposPaginaUno.put("cantidadD", createText(pdfDocument, new Rectangle(84, 491, 73, 10), "cantidadD", ""));
        camposPaginaUno.put("tipoArtefactoD", createText(pdfDocument, new Rectangle(155, 491, 180, 10), "tipoArtefactoD", ""));
        camposPaginaUno.put("hpD", createText(pdfDocument, new Rectangle(333, 491, 93, 10), "hpD", ""));
        camposPaginaUno.put("kwD", createText(pdfDocument, new Rectangle(425, 491, 85, 10), "kwD", ""));

        camposPaginaUno.put("cantidadE", createText(pdfDocument, new Rectangle(84, 478, 73, 10), "cantidadE", ""));
        camposPaginaUno.put("tipoArtefactoE", createText(pdfDocument, new Rectangle(155, 478, 180, 10), "tipoArtefactoE", ""));
        camposPaginaUno.put("hpE", createText(pdfDocument, new Rectangle(333, 478, 93, 10), "hpE", ""));
        camposPaginaUno.put("kwE", createText(pdfDocument, new Rectangle(425, 478, 85, 10), "kwE", ""));

        camposPaginaUno.put("cantidadF", createText(pdfDocument, new Rectangle(84, 517, 73, 10), "cantidadF", ""));
        camposPaginaUno.put("tipoArtefactoF", createText(pdfDocument, new Rectangle(155, 517, 180, 10), "tipoArtefactoF", ""));
        camposPaginaUno.put("hpF", createText(pdfDocument, new Rectangle(333, 517, 93, 10), "hpF", ""));
        camposPaginaUno.put("kwF", createText(pdfDocument, new Rectangle(425, 517, 85, 10), "kwF", ""));

        camposPaginaUno.put("cantidadG", createText(pdfDocument, new Rectangle(84, 465, 73, 10), "cantidadG", ""));
        camposPaginaUno.put("tipoArtefactoG", createText(pdfDocument, new Rectangle(155, 465, 180, 10), "tipoArtefactoG", ""));
        camposPaginaUno.put("hpG", createText(pdfDocument, new Rectangle(333, 465, 93, 10), "hpG", ""));
        camposPaginaUno.put("kwG", createText(pdfDocument, new Rectangle(425, 465, 85, 10), "kwG", ""));

        camposPaginaUno.put("cantidadH", createText(pdfDocument, new Rectangle(84, 452, 73, 10), "cantidadH", ""));
        camposPaginaUno.put("tipoArtefactoH", createText(pdfDocument, new Rectangle(155, 452, 180, 10), "tipoArtefactoH", ""));
        camposPaginaUno.put("hpH", createText(pdfDocument, new Rectangle(333, 452, 93, 10), "hpH", ""));
        camposPaginaUno.put("kwH", createText(pdfDocument, new Rectangle(425, 452, 85, 10), "kwH", ""));

        camposPaginaUno.put("cantidadI", createText(pdfDocument, new Rectangle(84, 439, 73, 10), "cantidadI", ""));
        camposPaginaUno.put("tipoArtefactoI", createText(pdfDocument, new Rectangle(155, 439, 180, 10), "tipoArtefactoI", ""));
        camposPaginaUno.put("hpI", createText(pdfDocument, new Rectangle(333, 439, 93, 10), "hpI", ""));
        camposPaginaUno.put("kwI", createText(pdfDocument, new Rectangle(425, 439, 85, 10), "kwI", ""));

        camposPaginaUno.put("cantidadJ", createText(pdfDocument, new Rectangle(84, 426, 73, 10), "cantidadJ", ""));
        camposPaginaUno.put("tipoArtefactoJ", createText(pdfDocument, new Rectangle(155, 426, 180, 10), "tipoArtefactoJ", ""));
        camposPaginaUno.put("hpJ", createText(pdfDocument, new Rectangle(333, 426, 93, 10), "hpJ", ""));
        camposPaginaUno.put("kwJ", createText(pdfDocument, new Rectangle(425, 426, 85, 10), "kwJ", ""));

        camposPaginaUno.put("cantidadK", createText(pdfDocument, new Rectangle(84, 413, 73, 10), "cantidadK", ""));
        camposPaginaUno.put("tipoArtefactoK", createText(pdfDocument, new Rectangle(155, 413, 180, 10), "tipoArtefactoK", ""));
        camposPaginaUno.put("hpK", createText(pdfDocument, new Rectangle(333, 413, 93, 10), "hpK", ""));
        camposPaginaUno.put("kwK", createText(pdfDocument, new Rectangle(425, 413, 85, 10), "kwK", ""));

        camposPaginaUno.put("cantidadL", createText(pdfDocument, new Rectangle(84, 400, 73, 10), "cantidadL", ""));
        camposPaginaUno.put("tipoArtefactoL", createText(pdfDocument, new Rectangle(155, 400, 180, 10), "tipoArtefactoL", ""));
        camposPaginaUno.put("hpL", createText(pdfDocument, new Rectangle(333, 400, 93, 10), "hpL", ""));
        camposPaginaUno.put("kwL", createText(pdfDocument, new Rectangle(425, 400, 85, 10), "kwL", ""));

        camposPaginaUno.put("cantidadM", createText(pdfDocument, new Rectangle(84, 387, 73, 10), "cantidadM", ""));
        camposPaginaUno.put("tipoArtefactoM", createText(pdfDocument, new Rectangle(155, 387, 180, 10), "tipoArtefactoM", ""));
        camposPaginaUno.put("hpM", createText(pdfDocument, new Rectangle(333, 387, 93, 10), "hpM", ""));
        camposPaginaUno.put("kwM", createText(pdfDocument, new Rectangle(425, 387, 85, 10), "kwM", ""));

        camposPaginaUno.put("cantidadN", createText(pdfDocument, new Rectangle(84, 374, 73, 10), "cantidadN", ""));
        camposPaginaUno.put("tipoArtefactoN", createText(pdfDocument, new Rectangle(155, 374, 180, 10), "tipoArtefactoN", ""));
        camposPaginaUno.put("hpN", createText(pdfDocument, new Rectangle(333, 374, 93, 10), "hpN", ""));
        camposPaginaUno.put("kwN", createText(pdfDocument, new Rectangle(425, 374, 85, 10), "kwN", ""));

        camposPaginaUno.put("cantidadO", createText(pdfDocument, new Rectangle(84, 361, 73, 10), "cantidadO", ""));
        camposPaginaUno.put("tipoArtefactoO", createText(pdfDocument, new Rectangle(155, 361, 180, 10), "tipoArtefactoO", ""));
        camposPaginaUno.put("hpO", createText(pdfDocument, new Rectangle(333, 361, 93, 10), "hpO", ""));
        camposPaginaUno.put("kwO", createText(pdfDocument, new Rectangle(425, 361, 85, 10), "kwO", ""));

        camposPaginaUno.put("cantidadP", createText(pdfDocument, new Rectangle(84, 348, 73, 10), "cantidadP", ""));
        camposPaginaUno.put("tipoArtefactoP", createText(pdfDocument, new Rectangle(155, 348, 180, 10), "tipoArtefactoP", ""));
        camposPaginaUno.put("hpP", createText(pdfDocument, new Rectangle(333, 348, 93, 10), "hpP", ""));
        camposPaginaUno.put("kwP", createText(pdfDocument, new Rectangle(425, 348, 85, 10), "kwP", ""));

        camposPaginaUno.put("cantidadQ", createText(pdfDocument, new Rectangle(84, 335, 73, 10), "cantidadQ", ""));
        camposPaginaUno.put("tipoArtefactoQ", createText(pdfDocument, new Rectangle(155, 335, 180, 10), "tipoArtefactoQ", ""));
        camposPaginaUno.put("hpQ", createText(pdfDocument, new Rectangle(333, 335, 93, 10), "hpQ", ""));
        camposPaginaUno.put("kwQ", createText(pdfDocument, new Rectangle(425, 335, 85, 10), "kwQ", ""));

        camposPaginaUno.put("cantidadR", createText(pdfDocument, new Rectangle(84, 322, 73, 10), "cantidadR", ""));
        camposPaginaUno.put("tipoArtefactoR", createText(pdfDocument, new Rectangle(155, 322, 180, 10), "tipoArtefactoR", ""));
        camposPaginaUno.put("hpR", createText(pdfDocument, new Rectangle(333, 322, 93, 10), "hpR", ""));
        camposPaginaUno.put("kwR", createText(pdfDocument, new Rectangle(425, 322, 85, 10), "kwR", ""));

        camposPaginaUno.put("cantidadS", createText(pdfDocument, new Rectangle(84, 309, 73, 10), "cantidadS", ""));
        camposPaginaUno.put("tipoArtefactoS", createText(pdfDocument, new Rectangle(155, 309, 180, 10), "tipoArtefactoS", ""));
        camposPaginaUno.put("hpS", createText(pdfDocument, new Rectangle(333, 309, 93, 10), "hpS", ""));
        camposPaginaUno.put("kwS", createText(pdfDocument, new Rectangle(425, 309, 85, 10), "kwS", ""));

        camposPaginaUno.put("totalCarga", createText(pdfDocument, new Rectangle(188, 272, 312, 10), "totalCarga", ""));
        camposPaginaUno.put("demandaMaximaSimultanea", createText(pdfDocument, new Rectangle(265, 250, 235, 10), "demandaMaximaSimultanea", ""));
        camposPaginaUno.put("ramo", createText(pdfDocument, new Rectangle(123, 228, 375, 10), "ramo", ""));
        camposPaginaUno.put("presentarPlanoSi", createText(pdfDocument, new Rectangle(340, 206, 33, 10), "presentarPlanoSi", ""));
        camposPaginaUno.put("presentarPlanoNo", createText(pdfDocument, new Rectangle(396, 206, 33, 10), "presentarPlanoNo", ""));

        camposPaginaUno.put("potenciaAutorizada", createText(pdfDocument, new Rectangle(283, 136, 145, 10), "potenciaAutorizada", ""));
        camposPaginaUno.put("totalSolicitado", createText(pdfDocument, new Rectangle(195, 115, 235, 10), "totalSolicitado", ""));

        camposPaginaUno.put("firma", createText(pdfDocument, new Rectangle(125, 71, 147, 10), "firma", ""));
        camposPaginaUno.put("aclaracion", createText(pdfDocument, new Rectangle(351, 71, 155, 10), "aclaracion", ""));

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
        campoConValor.put("calle", "12 de Agosto");
   

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

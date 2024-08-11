package com.example.demo;

import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import static com.itextpdf.forms.fields.PdfFormField.createMultilineText;
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
        camposPaginaUno.put("fecha", createText(pdfDocument, new Rectangle(380, 710, 140, 10), "fecha", ""));
        camposPaginaUno.put("nombreCalle", createText(pdfDocument, new Rectangle(230, 547, 280, 10), "nombreCalle", ""));
        camposPaginaUno.put("numeroCalle", createText(pdfDocument, new Rectangle(84, 530, 50, 10), "numeroCalle", ""));
        camposPaginaUno.put("sumatoriaCaudalEquiposSimultaneos", createText(pdfDocument, new Rectangle(236, 496, 274, 10), "sumatoriaCaudalEquiposSimultaneos", ""));
        camposPaginaUno.put("presionCaudalEquiposSimultaneos", createText(pdfDocument, new Rectangle(181, 478, 43, 10), "presionCaudalEquiposSimultaneos", ""));
        camposPaginaUno.put("consumoMensualEstimado", createText(pdfDocument, new Rectangle(215, 239, 60, 10), "consumoMensualEstimado", ""));
        camposPaginaUno.put("horario", createText(pdfDocument, new Rectangle(285, 204, 200, 10), "horario", ""));
        camposPaginaUno.put("empresaSolicitante", createText(pdfDocument, new Rectangle(155, 118, 350, 10), "empresaSolicitante", ""));
       
  
        camposPaginaUno.put("equipos", createMultilineText(pdfDocument, new Rectangle(85, 275, 440, 200), "equipos", ""));

        
        camposPaginaUno
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    PdfTextFormField textFormatField = camposPaginaUno.get(key);
                    if ("equipos".equals(key)) {
                        textFormatField.setFontSize(8);
                    } else {
                        textFormatField.setFontSizeAutoScale();
                    }

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
        campoConValor.put("equipos", "Había una vez, en un reino lejano llamado Aldoria, un joven llamado Elian. Elian era un campesino que vivía en las afueras de un pequeño pueblo, rodeado de campos de trigo dorado y bosques encantados. Desde niño, había soñado con aventuras más allá de su tranquila vida, deseando descubrir los secretos que el mundo tenía para ofrecer.\n"
                + "\n"
                + "Una noche, mientras contemplaba las estrellas desde su ventana, Elian vio una luz brillante cruzar el cielo. Era una estrella fugaz, pero esta vez, parecía diferente, como si estuviera guiada por un propósito. Al día siguiente, decidió seguir su intuición y dirigirse hacia el bosque encantado, donde la luz había desaparecido.\n"
                + "\n"
                + "El bosque encantado era un lugar de misterios y magia, habitado por criaturas fantásticas y árboles antiguos que susurraban secretos al viento. Elian caminó durante horas, adentrándose cada vez más en el bosque, hasta que llegó a un claro iluminado por una luz dorada. En el centro del claro, encontró una piedra brillante con inscripciones antiguas.");

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

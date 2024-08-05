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
        camposPaginaUno.put("fecha", createText(pdfDocument, new Rectangle(105, 676, 140, 10), "fecha", ""));
        camposPaginaUno.put("actividad", createText(pdfDocument, new Rectangle(307, 676, 140, 10), "actividad", ""));
        camposPaginaUno.put("firma", createText(pdfDocument, new Rectangle(105, 656, 220, 8), "firma", ""));
        camposPaginaUno.put("telefonos", createText(pdfDocument, new Rectangle(368, 656, 170, 8), "telefonos", ""));
        camposPaginaUno.put("numeroCalle", createText(pdfDocument, new Rectangle(368, 650, 170, 8), "numeroCalle", ""));
        camposPaginaUno.put("calle", createText(pdfDocument, new Rectangle(105, 650, 220, 8), "calle", ""));
        camposPaginaUno.put("entreCalleA", createText(pdfDocument, new Rectangle(105, 643, 170, 8), "entreCalleA", ""));
        camposPaginaUno.put("entreCalleB", createText(pdfDocument, new Rectangle(335, 643, 190, 8), "entreCalleB", ""));
        camposPaginaUno.put("localidad", createText(pdfDocument, new Rectangle(120, 636, 200, 8), "localidad", ""));

        camposPaginaUno.put("artefactoA", createText(pdfDocument, new Rectangle(87, 597, 155, 8), "artefactoA", ""));
        camposPaginaUno.put("cantidadA", createText(pdfDocument, new Rectangle(242, 597, 33, 8), "cantidadA", ""));
        camposPaginaUno.put("picoMaximoUnitarioA", createText(pdfDocument, new Rectangle(275, 597, 60, 8), "picoMaximoUnitarioA", ""));
        camposPaginaUno.put("picoMaximoTotalA", createText(pdfDocument, new Rectangle(335, 597, 32, 8), "picoMaximoTotalA", ""));
        camposPaginaUno.put("consumoPromedioDiarioA", createText(pdfDocument, new Rectangle(367, 597, 60, 8), "consumoPromedioDiarioA", ""));
        camposPaginaUno.put("diasLaboralesMesA", createText(pdfDocument, new Rectangle(427, 597, 22, 8), "diasLaboralesMesA", ""));
        camposPaginaUno.put("consumoMensualA", createText(pdfDocument, new Rectangle(449, 597, 92, 8), "consumoMensualA", ""));

        camposPaginaUno.put("artefactoB", createText(pdfDocument, new Rectangle(87, 587, 155, 8), "artefactoB", ""));
        camposPaginaUno.put("cantidadB", createText(pdfDocument, new Rectangle(242, 587, 33, 8), "cantidadB", ""));
        camposPaginaUno.put("picoMaximoUnitarioB", createText(pdfDocument, new Rectangle(275, 587, 60, 8), "picoMaximoUnitarioB", ""));
        camposPaginaUno.put("picoMaximoTotalB", createText(pdfDocument, new Rectangle(335, 587, 32, 8), "picoMaximoTotalB", ""));
        camposPaginaUno.put("consumoPromedioDiarioB", createText(pdfDocument, new Rectangle(367, 587, 60, 8), "consumoPromedioDiarioB", ""));
        camposPaginaUno.put("diasLaboralesMesB", createText(pdfDocument, new Rectangle(427, 587, 22, 8), "diasLaboralesMesB", ""));
        camposPaginaUno.put("consumoMensualB", createText(pdfDocument, new Rectangle(449, 587, 92, 8), "consumoMensualB", ""));

        camposPaginaUno.put("artefactoC", createText(pdfDocument, new Rectangle(87, 577, 155, 8), "artefactoC", ""));
        camposPaginaUno.put("cantidadC", createText(pdfDocument, new Rectangle(242, 577, 33, 8), "cantidadC", ""));
        camposPaginaUno.put("picoMaximoUnitarioC", createText(pdfDocument, new Rectangle(275, 577, 60, 8), "picoMaximoUnitarioC", ""));
        camposPaginaUno.put("picoMaximoTotalC", createText(pdfDocument, new Rectangle(335, 577, 32, 8), "picoMaximoTotalC", ""));
        camposPaginaUno.put("consumoPromedioDiarioC", createText(pdfDocument, new Rectangle(367, 577, 60, 8), "consumoPromedioDiarioC", ""));
        camposPaginaUno.put("diasLaboralesMesC", createText(pdfDocument, new Rectangle(427, 577, 22, 8), "diasLaboralesMesC", ""));
        camposPaginaUno.put("consumoMensualC", createText(pdfDocument, new Rectangle(449, 577, 92, 8), "consumoMensualC", ""));

        camposPaginaUno.put("artefactoD", createText(pdfDocument, new Rectangle(87, 565, 155, 8), "artefactoD", ""));
        camposPaginaUno.put("cantidadD", createText(pdfDocument, new Rectangle(242, 565, 33, 8), "cantidadD", ""));
        camposPaginaUno.put("picoMaximoUnitarioD", createText(pdfDocument, new Rectangle(275, 565, 60, 8), "picoMaximoUnitarioD", ""));
        camposPaginaUno.put("picoMaximoTotalD", createText(pdfDocument, new Rectangle(335, 565, 32, 8), "picoMaximoTotalD", ""));
        camposPaginaUno.put("consumoPromedioDiarioD", createText(pdfDocument, new Rectangle(367, 565, 60, 8), "consumoPromedioDiarioD", ""));
        camposPaginaUno.put("diasLaboralesMesD", createText(pdfDocument, new Rectangle(427, 565, 22, 8), "diasLaboralesMesD", ""));
        camposPaginaUno.put("consumoMensualD", createText(pdfDocument, new Rectangle(449, 565, 92, 8), "consumoMensualD", ""));

        camposPaginaUno.put("artefactoE", createText(pdfDocument, new Rectangle(87, 554, 155, 8), "artefactoE", ""));
        camposPaginaUno.put("cantidadE", createText(pdfDocument, new Rectangle(242, 554, 33, 8), "cantidadE", ""));
        camposPaginaUno.put("picoMaximoUnitarioE", createText(pdfDocument, new Rectangle(275, 554, 60, 8), "picoMaximoUnitarioE", ""));
        camposPaginaUno.put("picoMaximoTotalE", createText(pdfDocument, new Rectangle(335, 554, 32, 8), "picoMaximoTotalE", ""));
        camposPaginaUno.put("consumoPromedioDiarioE", createText(pdfDocument, new Rectangle(367, 554, 60, 8), "consumoPromedioDiarioE", ""));
        camposPaginaUno.put("diasLaboralesMesE", createText(pdfDocument, new Rectangle(427, 554, 22, 8), "diasLaboralesMesE", ""));
        camposPaginaUno.put("consumoMensualE", createText(pdfDocument, new Rectangle(449, 554, 92, 8), "consumoMensualE", ""));

        camposPaginaUno.put("artefactoF", createText(pdfDocument, new Rectangle(87, 542, 155, 8), "artefactoF", ""));
        camposPaginaUno.put("cantidadF", createText(pdfDocument, new Rectangle(242, 542, 33, 8), "cantidadF", ""));
        camposPaginaUno.put("picoMaximoUnitarioF", createText(pdfDocument, new Rectangle(275, 542, 60, 8), "picoMaximoUnitarioF", ""));
        camposPaginaUno.put("picoMaximoTotalF", createText(pdfDocument, new Rectangle(335, 542, 32, 8), "picoMaximoTotalF", ""));
        camposPaginaUno.put("consumoPromedioDiarioF", createText(pdfDocument, new Rectangle(367, 542, 60, 8), "consumoPromedioDiarioF", ""));
        camposPaginaUno.put("diasLaboralesMesF", createText(pdfDocument, new Rectangle(427, 542, 22, 8), "diasLaboralesMesF", ""));
        camposPaginaUno.put("consumoMensualF", createText(pdfDocument, new Rectangle(449, 542, 92, 8), "consumoMensualF", ""));

        camposPaginaUno.put("artefactoG", createText(pdfDocument, new Rectangle(87, 532, 155, 8), "artefactoG", ""));
        camposPaginaUno.put("cantidadG", createText(pdfDocument, new Rectangle(242, 532, 33, 8), "cantidadG", ""));
        camposPaginaUno.put("picoMaximoUnitarioG", createText(pdfDocument, new Rectangle(275, 532, 60, 8), "picoMaximoUnitarioG", ""));
        camposPaginaUno.put("picoMaximoTotalG", createText(pdfDocument, new Rectangle(335, 532, 32, 8), "picoMaximoTotalG", ""));
        camposPaginaUno.put("consumoPromedioDiarioG", createText(pdfDocument, new Rectangle(367, 532, 60, 8), "consumoPromedioDiarioG", ""));
        camposPaginaUno.put("diasLaboralesMesG", createText(pdfDocument, new Rectangle(427, 532, 22, 8), "diasLaboralesMesG", ""));
        camposPaginaUno.put("consumoMensualG", createText(pdfDocument, new Rectangle(449, 532, 92, 8), "consumoMensualG", ""));

        camposPaginaUno.put("artefactoH", createText(pdfDocument, new Rectangle(87, 520, 155, 8), "artefactoH", ""));
        camposPaginaUno.put("cantidadH", createText(pdfDocument, new Rectangle(242, 520, 33, 8), "cantidadH", ""));
        camposPaginaUno.put("picoMaximoUnitarioH", createText(pdfDocument, new Rectangle(275, 520, 60, 8), "picoMaximoUnitarioH", ""));
        camposPaginaUno.put("picoMaximoTotalH", createText(pdfDocument, new Rectangle(335, 520, 32, 8), "picoMaximoTotalH", ""));
        camposPaginaUno.put("consumoPromedioDiarioH", createText(pdfDocument, new Rectangle(367, 520, 60, 8), "consumoPromedioDiarioH", ""));
        camposPaginaUno.put("diasLaboralesMesH", createText(pdfDocument, new Rectangle(427, 520, 22, 8), "diasLaboralesMesH", ""));
        camposPaginaUno.put("consumoMensualH", createText(pdfDocument, new Rectangle(449, 520, 92, 8), "consumoMensualH", ""));

        camposPaginaUno.put("artefactoI", createText(pdfDocument, new Rectangle(87, 510, 155, 8), "artefactoI", ""));
        camposPaginaUno.put("cantidadI", createText(pdfDocument, new Rectangle(242, 510, 33, 8), "cantidadI", ""));
        camposPaginaUno.put("picoMaximoUnitarioI", createText(pdfDocument, new Rectangle(275, 510, 60, 8), "picoMaximoUnitarioI", ""));
        camposPaginaUno.put("picoMaximoTotalI", createText(pdfDocument, new Rectangle(335, 510, 32, 8), "picoMaximoTotalI", ""));
        camposPaginaUno.put("consumoPromedioDiarioI", createText(pdfDocument, new Rectangle(367, 510, 60, 8), "consumoPromedioDiarioI", ""));
        camposPaginaUno.put("diasLaboralesMesI", createText(pdfDocument, new Rectangle(427, 510, 22, 8), "diasLaboralesMesI", ""));
        camposPaginaUno.put("consumoMensualI", createText(pdfDocument, new Rectangle(449, 510, 92, 8), "consumoMensualI", ""));

        camposPaginaUno.put("artefactoJ", createText(pdfDocument, new Rectangle(87, 498, 155, 8), "artefactoJ", ""));
        camposPaginaUno.put("cantidadJ", createText(pdfDocument, new Rectangle(242, 498, 33, 8), "cantidadJ", ""));
        camposPaginaUno.put("picoMaximoUnitarioJ", createText(pdfDocument, new Rectangle(275, 498, 60, 8), "picoMaximoUnitarioJ", ""));
        camposPaginaUno.put("picoMaximoTotalJ", createText(pdfDocument, new Rectangle(335, 498, 32, 8), "picoMaximoTotalJ", ""));
        camposPaginaUno.put("consumoPromedioDiarioJ", createText(pdfDocument, new Rectangle(367, 498, 60, 8), "consumoPromedioDiarioJ", ""));
        camposPaginaUno.put("diasLaboralesMesJ", createText(pdfDocument, new Rectangle(427, 498, 22, 8), "diasLaboralesMesJ", ""));
        camposPaginaUno.put("consumoMensualJ", createText(pdfDocument, new Rectangle(449, 498, 92, 8), "consumoMensualJ", ""));

        camposPaginaUno.put("artefactoK", createText(pdfDocument, new Rectangle(87, 487, 155, 8), "artefactoK", ""));
        camposPaginaUno.put("cantidadK", createText(pdfDocument, new Rectangle(242, 487, 33, 8), "cantidadK", ""));
        camposPaginaUno.put("picoMaximoUnitarioK", createText(pdfDocument, new Rectangle(275, 487, 60, 8), "picoMaximoUnitarioK", ""));
        camposPaginaUno.put("picoMaximoTotalK", createText(pdfDocument, new Rectangle(335, 487, 32, 8), "picoMaximoTotalK", ""));
        camposPaginaUno.put("consumoPromedioDiarioK", createText(pdfDocument, new Rectangle(367, 487, 60, 8), "consumoPromedioDiarioK", ""));
        camposPaginaUno.put("diasLaboralesMesK", createText(pdfDocument, new Rectangle(427, 487, 22, 8), "diasLaboralesMesK", ""));
        camposPaginaUno.put("consumoMensualK", createText(pdfDocument, new Rectangle(449, 487, 92, 8), "consumoMensualK", ""));

        camposPaginaUno.put("artefactoL", createText(pdfDocument, new Rectangle(87, 476, 155, 8), "artefactoL", ""));
        camposPaginaUno.put("cantidadL", createText(pdfDocument, new Rectangle(242, 476, 33, 8), "cantidadL", ""));
        camposPaginaUno.put("picoMaximoUnitarioL", createText(pdfDocument, new Rectangle(275, 476, 60, 8), "picoMaximoUnitarioL", ""));
        camposPaginaUno.put("picoMaximoTotalL", createText(pdfDocument, new Rectangle(335, 476, 32, 8), "picoMaximoTotalL", ""));
        camposPaginaUno.put("consumoPromedioDiarioL", createText(pdfDocument, new Rectangle(367, 476, 60, 8), "consumoPromedioDiarioL", ""));
        camposPaginaUno.put("diasLaboralesMesL", createText(pdfDocument, new Rectangle(427, 476, 22, 8), "diasLaboralesMesL", ""));
        camposPaginaUno.put("consumoMensualL", createText(pdfDocument, new Rectangle(449, 476, 92, 8), "consumoMensualL", ""));

        camposPaginaUno.put("artefactoM", createText(pdfDocument, new Rectangle(87, 465, 155, 8), "artefactoM", ""));
        camposPaginaUno.put("cantidadM", createText(pdfDocument, new Rectangle(242, 465, 33, 8), "cantidadM", ""));
        camposPaginaUno.put("picoMaximoUnitarioM", createText(pdfDocument, new Rectangle(275, 465, 60, 8), "picoMaximoUnitarioM", ""));
        camposPaginaUno.put("picoMaximoTotalM", createText(pdfDocument, new Rectangle(335, 465, 32, 8), "picoMaximoTotalM", ""));
        camposPaginaUno.put("consumoPromedioDiarioM", createText(pdfDocument, new Rectangle(367, 465, 60, 8), "consumoPromedioDiarioM", ""));
        camposPaginaUno.put("diasLaboralesMesM", createText(pdfDocument, new Rectangle(427, 465, 22, 8), "diasLaboralesMesM", ""));
        camposPaginaUno.put("consumoMensualM", createText(pdfDocument, new Rectangle(449, 465, 92, 8), "consumoMensualM", ""));

        camposPaginaUno.put("artefactoN", createText(pdfDocument, new Rectangle(87, 454, 155, 8), "artefactoN", ""));
        camposPaginaUno.put("cantidadN", createText(pdfDocument, new Rectangle(242, 454, 33, 8), "cantidadN", ""));
        camposPaginaUno.put("picoMaximoUnitarioN", createText(pdfDocument, new Rectangle(275, 454, 60, 8), "picoMaximoUnitarioN", ""));
        camposPaginaUno.put("picoMaximoTotalN", createText(pdfDocument, new Rectangle(335, 454, 32, 8), "picoMaximoTotalN", ""));
        camposPaginaUno.put("consumoPromedioDiarioN", createText(pdfDocument, new Rectangle(367, 454, 60, 8), "consumoPromedioDiarioN", ""));
        camposPaginaUno.put("diasLaboralesMesN", createText(pdfDocument, new Rectangle(427, 454, 22, 8), "diasLaboralesMesN", ""));
        camposPaginaUno.put("consumoMensualN", createText(pdfDocument, new Rectangle(449, 454, 92, 8), "consumoMensualN", ""));

        camposPaginaUno.put("fechaHoraCaudalExistente", createText(pdfDocument, new Rectangle(173, 430, 32, 8), "fechaHoraCaudalExistente", ""));
        camposPaginaUno.put("fechaDiaCaudalExistente", createText(pdfDocument, new Rectangle(205, 430, 36, 8), "fechaDiaCaudalExistente", ""));
        camposPaginaUno.put("fechaMesCaudalExistente", createText(pdfDocument, new Rectangle(241, 430, 34, 8), "fechaMesCaudalExistente", ""));

        camposPaginaUno.put("fechaHoraCaudalIncremento", createText(pdfDocument, new Rectangle(173, 423, 32, 8), "fechaHoraCaudalIncremento", ""));
        camposPaginaUno.put("fechaDiaCaudalIncremento", createText(pdfDocument, new Rectangle(205, 423, 36, 8), "fechaDiaCaudalIncremento", ""));
        camposPaginaUno.put("fechaMesCaudalIncremento", createText(pdfDocument, new Rectangle(241, 423, 34, 8), "fechaMesCaudalIncremento", ""));

        camposPaginaUno.put("fechaHoraCaudalInicial", createText(pdfDocument, new Rectangle(173, 416, 32, 8), "fechaHoraCaudalInicial", ""));
        camposPaginaUno.put("fechaDiaCaudalInicial", createText(pdfDocument, new Rectangle(205, 416, 36, 8), "fechaDiaCaudalInicial", ""));
        camposPaginaUno.put("fechaMesCaudalInicial", createText(pdfDocument, new Rectangle(241, 416, 34, 8), "fechaMesCaudalInicial", ""));
        
        camposPaginaUno.put("caudalExistenteCantidad", createText(pdfDocument, new Rectangle(133, 430, 34, 8), "caudalExistenteCantidad", ""));
        camposPaginaUno.put("caudalIncrementoCantidad", createText(pdfDocument, new Rectangle(133, 423, 34, 8), "caudalIncrementoCantidad", ""));
        camposPaginaUno.put("caudalInicialCantidad", createText(pdfDocument, new Rectangle(133, 416, 34, 8), "caudalInicialCantidad", ""));
        camposPaginaUno.put("caudalFuturoCantidad", createText(pdfDocument, new Rectangle(173, 400, 32, 8), "caudalFuturoCantidad", ""));
        camposPaginaUno.put("caudalTotalCantidad", createText(pdfDocument, new Rectangle(173, 394, 32, 8), "caudalTotalCantidad", ""));
        
        camposPaginaUno.put("estacionalSi", createText(pdfDocument, new Rectangle(229, 393, 12, 8), "estacionalSi", ""));
        camposPaginaUno.put("estacionalNo", createText(pdfDocument, new Rectangle(264, 393, 12, 8), "estacionalNo", ""));
        
        camposPaginaUno.put("consumoAnualEstimado", createText(pdfDocument, new Rectangle(241, 378, 36, 8), "consumoAnualEstimado", ""));
        
        camposPaginaUno.put("fechaEstimadaIniciacionConsumoDia", createText(pdfDocument, new Rectangle(200, 378, 14, 6), "fechaEstimadaIniciacionConsumoDia", ""));
        camposPaginaUno.put("fechaEstimadaIniciacionConsumoMes", createText(pdfDocument, new Rectangle(214, 378, 14, 6), "fechaEstimadaIniciacionConsumoMes", ""));
        camposPaginaUno.put("fechaEstimadaIniciacionConsumoAnio", createText(pdfDocument, new Rectangle(228, 378, 15, 6), "fechaEstimadaIniciacionConsumoAnio", ""));
        
        camposPaginaUno.put("observaciones", createMultilineText(pdfDocument, new Rectangle(85, 253, 455, 100), "observaciones", ""));

        
        
        camposPaginaUno
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    PdfTextFormField textFormatField = camposPaginaUno.get(key);
                    if ("observaciones".equals(key)) {
                        textFormatField.setFontSize(6);
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
        campoConValor.put("observaciones", "Había una vez, en un reino lejano llamado Aldoria, un joven llamado Elian. Elian era un campesino que vivía en las afueras de un pequeño pueblo, rodeado de campos de trigo dorado y bosques encantados. Desde niño, había soñado con aventuras más allá de su tranquila vida, deseando descubrir los secretos que el mundo tenía para ofrecer.\n"
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

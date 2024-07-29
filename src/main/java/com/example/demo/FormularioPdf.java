package com.example.demo;

import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import static com.itextpdf.forms.fields.PdfFormField.createText;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.kernel.colors.WebColors;
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
        camposPaginaUno.put("fechaDiaMes", createText(pdfDocument, new Rectangle(235, 650, 224, 9), "fechaDiaMes", ""));
        camposPaginaUno.put("fechaAnio", createText(pdfDocument, new Rectangle(475, 650, 35, 9), "fechaAnio", ""));
        camposPaginaUno.put("suscriptorNombre", createText(pdfDocument, new Rectangle(227, 616, 215, 11), "suscriptorNombre", ""));
        camposPaginaUno.put("suscriptorDni", createText(pdfDocument, new Rectangle(92, 597, 114, 11), "suscriptorDni", ""));
        camposPaginaUno.put("direccionDomicilio", createText(pdfDocument, new Rectangle(174, 580, 164, 11), "direccionDomicilio", ""));
        camposPaginaUno.put("direccionNumero", createText(pdfDocument, new Rectangle(355, 580, 35, 11), "direccionNumero", ""));
        camposPaginaUno.put("direccionPiso", createText(pdfDocument, new Rectangle(414, 580, 23, 11), "direccionPiso", ""));
        camposPaginaUno.put("direccionDepartamento", createText(pdfDocument, new Rectangle(470, 580, 50, 11), "direccionDepartamento", ""));
        camposPaginaUno.put("direccionLocalidad", createText(pdfDocument, new Rectangle(136, 563, 84, 11), "direccionLocalidad", ""));
        camposPaginaUno.put("direccionCodigoPostal", createText(pdfDocument, new Rectangle(243, 563, 60, 11), "direccionCodigoPostal", ""));
        camposPaginaUno.put("telefono", createText(pdfDocument, new Rectangle(358, 563, 115, 11), "telefono", ""));
        camposPaginaUno.put("mail", createText(pdfDocument, new Rectangle(180, 545, 203, 11), "mail", ""));
        camposPaginaUno.put("caracterPropietario", createText(pdfDocument, new Rectangle(246, 525, 12, 11), "caracterPropietario", ""));
        camposPaginaUno.put("caracterApoderado", createText(pdfDocument, new Rectangle(322, 525, 12, 11), "caracterApoderado", ""));
        camposPaginaUno.put("factibilidadAgua", createText(pdfDocument, new Rectangle(92, 472, 12, 11), "factibilidadAgua", ""));
        camposPaginaUno.put("factibilidadCloaca", createText(pdfDocument, new Rectangle(151, 472, 12, 11), "factibilidadCloaca", ""));
        camposPaginaUno.put("factibilidadAmpliacion", createText(pdfDocument, new Rectangle(244, 470, 12, 11), "factibilidadAmpliacion", ""));
        camposPaginaUno.put("factibilidadRenovacion", createText(pdfDocument, new Rectangle(340, 470, 12, 11), "factibilidadRenovacion", ""));
        camposPaginaUno.put("predioCalle", createText(pdfDocument, new Rectangle(92, 437, 259, 11), "predioCalle", ""));
        camposPaginaUno.put("predioNumero", createText(pdfDocument, new Rectangle(369, 437, 32, 11), "predioNumero", ""));
        camposPaginaUno.put("predioLocalidad", createText(pdfDocument, new Rectangle(451, 437, 68, 11), "predioLocalidad", ""));
        camposPaginaUno.put("predioPartido", createText(pdfDocument, new Rectangle(159, 418, 65, 11), "predioPartido", ""));
        camposPaginaUno.put("catastroCirc", createText(pdfDocument, new Rectangle(88, 401, 19, 8), "catastroCirc", ""));
        camposPaginaUno.put("catastroSec", createText(pdfDocument, new Rectangle(124, 401, 19, 8), "catastroSec", ""));
        camposPaginaUno.put("catastroMz", createText(pdfDocument, new Rectangle(155, 401, 26, 8), "catastroMz", ""));
        camposPaginaUno.put("catastroParcela", createText(pdfDocument, new Rectangle(231, 401, 25, 11), "catastroParcela", ""));
        camposPaginaUno.put("codigoZonificacion", createText(pdfDocument, new Rectangle(433, 250, 100, 22), "codigoZonificacion", ""));
        camposPaginaUno.put("tiempoEstimadoEjecucionObra", createText(pdfDocument, new Rectangle(433, 231, 100, 22), "tiempoEstimadoEjecucionObra", ""));
        camposPaginaUno.put("destinoObra", createText(pdfDocument, new Rectangle(433, 212, 100, 22), "destinoObra", ""));
        camposPaginaUno.put("superficieTotalCubierta", createText(pdfDocument, new Rectangle(433, 164, 100, 50), "superficieTotalCubierta", ""));
        camposPaginaUno.put("superficieTotalCubiertaComplejoGlobal", createText(pdfDocument, new Rectangle(92, 174, 12, 11), "superficieTotalCubiertaComplejoGlobal", ""));
        camposPaginaUno.put("superficieTotalCubiertaCantidadTorres", createText(pdfDocument, new Rectangle(181, 174, 12, 11), "superficieTotalCubiertaCantidadTorres", ""));
        camposPaginaUno.put("superficieTotalCubiertaCantidadTorresNumero", createText(pdfDocument, new Rectangle(255, 165, 20, 26), "superficieTotalCubiertaCantidadTorresNumero", ""));
        camposPaginaUno.put("superficieTotalCubiertaTorre", createText(pdfDocument, new Rectangle(285, 174, 12, 11), "superficieTotalCubiertaTorre", ""));
        camposPaginaUno.put("superficieTotalCubiertaTorreNumero", createText(pdfDocument, new Rectangle(345, 170, 20, 26), "superficieTotalCubiertaTorreNumero", ""));
        camposPaginaUno.put("cantidadUnidadesFuncionales", createText(pdfDocument, new Rectangle(433, 144, 100, 22), "cantidadUnidadesFuncionales", ""));
        camposPaginaUno.put("alturaEdificioSobreRasante", createText(pdfDocument, new Rectangle(433, 125, 100, 22), "alturaEdificioSobreRasante", ""));
        camposPaginaUno.put("volumenTotalReservaSanitaria", createText(pdfDocument, new Rectangle(433, 102, 100, 27), "volumenTotalReservaSanitaria", ""));
        camposPaginaUno.put("volumenContraIncendio", createText(pdfDocument, new Rectangle(433, 82, 100, 22), "volumenContraIncendio", ""));

        camposPaginaUno
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    formField.setFontSizeAutoScale();
                    PdfTextFormField textFormatField = camposPaginaUno.get(key);
                    formField.addKid(textFormatField);
                    PdfAcroForm.getAcroForm(pdfDocument, true)
                            .addField(formField, pdfDocument.getPage(1));
                });

        Map<String, PdfTextFormField> camposPaginaDos = new HashMap<>();
        camposPaginaDos.put("volumenTanque", createText(pdfDocument, new Rectangle(432, 703, 100, 22), "volumenTanque", ""));
        camposPaginaDos.put("volumenTanqueIncendios", createText(pdfDocument, new Rectangle(432, 657, 100, 50), "volumenTanqueIncendios", ""));
        camposPaginaDos.put("sistemaExclusivo", createText(pdfDocument, new Rectangle(92, 667, 12, 11), "sistemaExclusivo", ""));
        camposPaginaDos.put("sistemaMixto", createText(pdfDocument, new Rectangle(232, 667, 12, 11), "sistemaMixto", ""));
        camposPaginaDos.put("cantidadCanillas", createText(pdfDocument, new Rectangle(432, 632, 100, 27), "cantidadCanillas", ""));
        camposPaginaDos.put("cantidadInodoros", createText(pdfDocument, new Rectangle(432, 608, 100, 27), "cantidadInodoros", ""));
        camposPaginaDos.put("caudalConsumo", createText(pdfDocument, new Rectangle(432, 584, 100, 27), "caudalConsumo", ""));
        camposPaginaDos.put("caudalVolcamiento", createText(pdfDocument, new Rectangle(432, 565, 100, 20), "caudalVolcamiento", ""));
        camposPaginaDos.put("cantidadConexionesAgua", createText(pdfDocument, new Rectangle(432, 545, 100, 20), "cantidadConexionesAgua", ""));
        camposPaginaDos.put("cantidadHabitantes", createText(pdfDocument, new Rectangle(432, 526, 100, 20), "cantidadHabitantes", ""));
        camposPaginaDos.put("cantidadConexionesCloaca", createText(pdfDocument, new Rectangle(432, 508, 100, 20), "cantidadConexionesCloaca", ""));
        camposPaginaDos.put("numeroCuentaContrato", createText(pdfDocument, new Rectangle(432, 488, 100, 20), "numeroCuentaContrato", ""));
        camposPaginaDos.put("planoOCroquis", createText(pdfDocument, new Rectangle(439, 330, 80, 26), "planoOCroquis", ""));
        camposPaginaDos.put("fotocopiaTituloPropiedad", createText(pdfDocument, new Rectangle(439, 310, 80, 22), "fotocopiaTituloPropiedad", ""));
        camposPaginaDos.put("fotocopiaDni", createText(pdfDocument, new Rectangle(439, 292, 80, 22), "fotocopiaDni", ""));
        camposPaginaDos.put("fotocopiaPoderHabilitante", createText(pdfDocument, new Rectangle(439, 273, 80, 22), "fotocopiaPoderHabilitante", ""));
        camposPaginaDos.put("fotocopiaUltimaFacturaServicioAysa", createText(pdfDocument, new Rectangle(439, 252, 80, 22), "fotocopiaUltimaFacturaServicioAysa", ""));

        camposPaginaDos
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    formField.setFontSizeAutoScale();
                    PdfTextFormField textFormatField = camposPaginaDos.get(key);
                    formField.addKid(textFormatField);
                    PdfAcroForm.getAcroForm(pdfDocument, true)
                            .addField(formField, pdfDocument.getPage(2));
                });

        Map<String, PdfTextFormField> camposPaginaTres = new HashMap<>();
        camposPaginaTres.put("responsableAtu", createText(pdfDocument, new Rectangle(325, 278, 179, 22), "nameAY", ""));
        camposPaginaTres.put("FirmaSolicitante", createText(pdfDocument, new Rectangle(91, 278, 179, 22), "nameBA", ""));
        camposPaginaTres.put("telefonoContacto", createText(pdfDocument, new Rectangle(200, 208, 115, 22), "nameBB", ""));
        camposPaginaTres.put("mailContacto", createText(pdfDocument, new Rectangle(251, 185, 140, 22), "nameBC", ""));
        camposPaginaTres.put("calleSuperior", createText(pdfDocument, new Rectangle(186, 597, 245, 15), "nameBD", ""));
        camposPaginaTres.put("calleInferior", createText(pdfDocument, new Rectangle(186, 372, 245, 15), "nameBE", ""));
        camposPaginaTres.put("calleIzquierda", createText(pdfDocument, new Rectangle(0, 480, 150, 15), "nameBF", ""));
        camposPaginaTres.put("calleDerecha", createText(pdfDocument, new Rectangle(430, 480, 150, 15), "nameBG", ""));

        camposPaginaTres
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    formField.setFontSizeAutoScale();
                    PdfTextFormField textFormatField = camposPaginaTres.get(key);
                    formField.addKid(textFormatField);
                    PdfAcroForm.getAcroForm(pdfDocument, true)
                            .addField(formField, pdfDocument.getPage(3));
                });

        Map<String, PdfTextFormField> camposRectanguloUbicacionObra = new HashMap<>();
        camposRectanguloUbicacionObra.put("calleSuperiorA", createText(pdfDocument, new Rectangle(200, 550, 22, 22), "calleSuperiorA", ""));
        camposRectanguloUbicacionObra.put("calleSuperiorB", createText(pdfDocument, new Rectangle(250, 550, 22, 22), "calleSuperiorB", ""));
        camposRectanguloUbicacionObra.put("calleSuperiorC", createText(pdfDocument, new Rectangle(300, 550, 22, 22), "calleSuperiorC", ""));
        camposRectanguloUbicacionObra.put("calleSuperiorD", createText(pdfDocument, new Rectangle(350, 550, 22, 22), "calleSuperiorD", ""));
        camposRectanguloUbicacionObra.put("calleSuperiorE", createText(pdfDocument, new Rectangle(400, 550, 22, 22), "calleSuperiorE", ""));

        camposRectanguloUbicacionObra.put("calleDerechaA", createText(pdfDocument, new Rectangle(400, 515, 22, 22), "calleDerechaA", ""));
        camposRectanguloUbicacionObra.put("calleDerechaB", createText(pdfDocument, new Rectangle(400, 480, 22, 22), "calleDerechaB", ""));
        camposRectanguloUbicacionObra.put("calleDerechaC", createText(pdfDocument, new Rectangle(400, 445, 22, 22), "calleDerechaC", ""));

        camposRectanguloUbicacionObra.put("calleIzquierdaA", createText(pdfDocument, new Rectangle(200, 515, 22, 22), "calleIzquierdaA", ""));
        camposRectanguloUbicacionObra.put("calleIzquierdaB", createText(pdfDocument, new Rectangle(200, 480, 22, 22), "calleIzquierdaB", ""));
        camposRectanguloUbicacionObra.put("calleIzquierdaC", createText(pdfDocument, new Rectangle(200, 445, 22, 22), "calleIzquierdaC", ""));

        camposRectanguloUbicacionObra.put("calleInferiorA", createText(pdfDocument, new Rectangle(200, 410, 22, 22), "calleInferiorA", ""));
        camposRectanguloUbicacionObra.put("calleInferiorB", createText(pdfDocument, new Rectangle(250, 410, 22, 22), "calleInferiorB", ""));
        camposRectanguloUbicacionObra.put("calleInferiorC", createText(pdfDocument, new Rectangle(300, 410, 22, 22), "calleInferiorC", ""));
        camposRectanguloUbicacionObra.put("calleInferiorD", createText(pdfDocument, new Rectangle(350, 410, 22, 22), "calleInferiorD", ""));
        camposRectanguloUbicacionObra.put("calleInferiorE", createText(pdfDocument, new Rectangle(400, 410, 22, 22), "calleInferiorE", ""));

        camposRectanguloUbicacionObra
                .keySet()
                .forEach(key -> {
                    PdfFormField formField = PdfFormField.createEmptyField(pdfDocument);
                    formField.setFieldName(key);
                    formField.setFontSizeAutoScale();
                    formField.setColor(WebColors.getRGBColor("#263a71"));

                    PdfTextFormField textFormatField = camposRectanguloUbicacionObra.get(key);
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
        PdfAcroForm.getAcroForm(pdfDocument, false).getFormFields();

        // para setearle un valor
        Map<String, String> campoConValor = new HashMap<>();
        campoConValor.put("fechaDiaMes", "12 de Agosto");
        campoConValor.put("fechaAnio", "2024");
        campoConValor.put("suscriptorNombre", "La mejor empresa constructora");
        campoConValor.put("suscriptorDni", "112233445566");
        campoConValor.put("direccionDomicilio", "Calle Falsa");
        campoConValor.put("direccionNumero", "123");
        campoConValor.put("direccionPiso", "5");
        campoConValor.put("direccionDepartamento", "8B");
        campoConValor.put("direccionLocalidad", "Lomas de Zamora");
        campoConValor.put("direccionCodigoPostal", "1832");
        campoConValor.put("telefono", "1122332211");
        campoConValor.put("mail", "unemaildealguien@gmail.com");
        campoConValor.put("caracterPropietario", "X");
        campoConValor.put("caracterApoderado", "X");
        campoConValor.put("factibilidadAgua", "X");
        campoConValor.put("factibilidadCloaca", "X");
        campoConValor.put("factibilidadAmpliacion", "X");
        campoConValor.put("factibilidadRenovacion", "X");
        campoConValor.put("predioCalle", "La calle nueva");
        campoConValor.put("predioNumero", "9999");
        campoConValor.put("predioLocalidad", "Una localidad");
        campoConValor.put("predioPartido", "Un partido");
        campoConValor.put("catastroCirc", "CIRC");
        campoConValor.put("catastroSec", "SEC");
        campoConValor.put("catastroMz", "UU");
        campoConValor.put("catastroParcela", "PARCELA");
        campoConValor.put("codigoZonificacion", "R2all");
        campoConValor.put("tiempoEstimadoEjecucionObra", "7 años");
        campoConValor.put("destinoObra", "Escuela de Mutantes");
        campoConValor.put("superficieTotalCubierta", "67 km cuadrados");
        campoConValor.put("superficieTotalCubiertaComplejoGlobal", "X");
        campoConValor.put("superficieTotalCubiertaCantidadTorres", "X");
        campoConValor.put("superficieTotalCubiertaCantidadTorresNumero", "84");
        campoConValor.put("superficieTotalCubiertaTorre", "X");
        campoConValor.put("superficieTotalCubiertaTorreNumero", "44");
        campoConValor.put("cantidadUnidadesFuncionales", "999");
        campoConValor.put("alturaEdificioSobreRasante", "1999 metros");
        campoConValor.put("volumenTotalReservaSanitaria", "899 litros");
        campoConValor.put("volumenContraIncendio", "8777 litros");

        // pagina 2
        campoConValor.put("volumenTanque", "1999 litros");
        campoConValor.put("volumenTanqueIncendios", "899 litros");
        campoConValor.put("sistemaExclusivo", "X");
        campoConValor.put("sistemaMixto", "X");
        campoConValor.put("cantidadCanillas", "879");
        campoConValor.put("cantidadInodoros", "877");
        campoConValor.put("caudalConsumo", "877 litros");
        campoConValor.put("caudalVolcamiento", "877 litros");
        campoConValor.put("cantidadConexionesAgua", "877");
        campoConValor.put("cantidadHabitantes", "8777");
        campoConValor.put("cantidadConexionesCloaca", "87");
        campoConValor.put("numeroCuentaContrato", "87779897767");

        // pagina 3
        campoConValor.put("calleSuperior", "Nombre de la calle superior");
        campoConValor.put("calleIzquierda", "Nombre de la calle izquierda");
        campoConValor.put("calleDerecha", "Nombre de la calle derecha");
        campoConValor.put("calleInferior", "Nombre de la calle inferior");
        campoConValor.put("telefonoContacto", "7878979797");
        campoConValor.put("mailContacto", "contacto@gmail.com");

        // cuadro obra
        campoConValor.put("calleSuperiorA", "X");
        campoConValor.put("calleSuperiorB", "X");
        campoConValor.put("calleSuperiorC", "X");
        campoConValor.put("calleSuperiorD", "X");
        campoConValor.put("calleSuperiorE", "X");
        campoConValor.put("calleDerechaA", "X");
        campoConValor.put("calleDerechaB", "X");
        campoConValor.put("calleDerechaC", "X");
        campoConValor.put("calleIzquierdaA", "X");
        campoConValor.put("calleIzquierdaB", "X");
        campoConValor.put("calleIzquierdaC", "X");
        campoConValor.put("calleInferiorA", "X");
        campoConValor.put("calleInferiorB", "X");
        campoConValor.put("calleInferiorC", "X");
        campoConValor.put("calleInferiorD", "X");
        campoConValor.put("calleInferiorE", "X");

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

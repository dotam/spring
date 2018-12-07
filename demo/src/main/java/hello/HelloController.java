package hello;

import com.aspose.pdf.Document;
import com.aspose.pdf.HtmlLoadOptions;
import com.aspose.pdf.HtmlSaveOptions;
import com.aspose.pdf.LettersPositioningMethods;
import com.aspose.words.CssStyleSheetType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() throws Exception{
        String name = "F:\\cv\\nam\\David_Prat";
        String name2 = "F:\\cv\\nam\\Jade+McKenna+-+CV+Final";
        String name3 = "F:\\cv\\nam\\On-hire client contract (SPB 20.3.18) Clean";
        String html2pdf = "F:\\b.html";
//        this.convertPDF2HTML(name);
//        this.convertDoc2HTML(name2);
//        this.convertDoc2HTML(name3);
        this.convertHTML2PDF(html2pdf);
        return "Greetings from Spring Boot!";
    }

    private void convertPDF2HTML(String fileName) throws Exception{
//        FileInputStream fileInputStream = new FileInputStream(name);
        Document doc = new Document(fileName + ".pdf");
//        // tune conversion parameters
//        HtmlSaveOptions newOptions = new HtmlSaveOptions();
//        newOptions.RasterImagesSavingMode = HtmlSaveOptions.RasterImagesSavingModes.AsEmbeddedPartsOfPngPageBackground;
//        newOptions.FontSavingMode = HtmlSaveOptions.FontSavingModes.AlwaysSaveAsTTF;
//        newOptions.PartsEmbeddingMode = HtmlSaveOptions.PartsEmbeddingModes.EmbedAllIntoHtml;
//        newOptions.LettersPositioningMethod = LettersPositioningMethods.UseEmUnitsAndCompensationOfRoundingErrorsInCss;
//        newOptions.setSplitIntoPages(false);// force write HTMLs of all pages into one output document
//        FileOutputStream fileOutputStream = new FileOutputStream(nameO);
        // Instantiate HTML Save options object
        HtmlSaveOptions newOptions = new HtmlSaveOptions();
        // Enable option to embed all resources inside the HTML
        newOptions.PartsEmbeddingMode = HtmlSaveOptions.PartsEmbeddingModes.EmbedAllIntoHtml;
        // This is just optimization for IE and can be omitted
        newOptions.LettersPositioningMethod = LettersPositioningMethods.UseEmUnitsAndCompensationOfRoundingErrorsInCss;
        newOptions.RasterImagesSavingMode = HtmlSaveOptions.RasterImagesSavingModes.AsEmbeddedPartsOfPngPageBackground;
        newOptions.FontSavingMode = HtmlSaveOptions.FontSavingModes.SaveInAllFormats;
        doc.save(fileName + ".html", newOptions);


    }

    private void convertDoc2HTML(String fileName) throws Exception{
        com.aspose.words.Document doc = new com.aspose.words.Document(fileName + ".docx");
        // output to an OutputStream.
        com.aspose.words.HtmlSaveOptions newOptions = new com.aspose.words.HtmlSaveOptions();
        newOptions.setCssStyleSheetType(CssStyleSheetType.EMBEDDED);
        newOptions.setExportImagesAsBase64(true);
        newOptions.setExportFontResources(false);
        newOptions.setExportXhtmlTransitional(false);
        doc.save(fileName + ".html", newOptions);


    }

    private void convertHTML2PDF(String fileName) throws Exception {
        // Specify the The base path/url for the html file which serves as images database
        HtmlLoadOptions htmloptions = new HtmlLoadOptions();
        // Load HTML file
        Document doc = new Document(fileName, htmloptions);
        // Save HTML file
        doc.save("F:\\b.out.pdf");
    }
}
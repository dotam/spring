/*
 * Copyright (c) 2013 HRBoss
 */

package tam.controller;

import com.aspose.pdf.Document;
import com.aspose.pdf.HtmlLoadOptions;
import com.aspose.pdf.LoadOptions;

public class AsposeHtmlToPdfRenderer {
    public static void main(String[] args) {
//        settingToNotPullDownRemoteResourcesDuringConversion();
        convertHTMLFileToPDF();
    }

    public static void convertHTMLFileToPDF() {
        // Specify the The base path/url for the html file which serves as images database
        String basePath = "F:\\test\\";
        HtmlLoadOptions htmloptions = new HtmlLoadOptions(basePath);
        // Load HTML file
        Document doc = new Document(basePath + "PDFtoHTML.html", htmloptions);
        // Save HTML file
        doc.save("F:\\Web+URL_output.pdf");
    }

    public static void settingToNotPullDownRemoteResourcesDuringConversion() {
        HtmlLoadOptions options = new HtmlLoadOptions();
        options.CustomLoaderOfExternalResources = new LoadOptions.ResourceLoadingStrategy() {
            public LoadOptions.ResourceLoadingResult invoke(String resourceURI) {
                // Creating clear template resource for replacing:
                LoadOptions.ResourceLoadingResult res = new LoadOptions.ResourceLoadingResult(new byte[] {});
                // Return empty byte array in case i.imgur.com server
                if (resourceURI.contains("i.imgur.com")) {
                    return res;
                } else {
                    // Process resources with default resource loader
                    res.LoadingCancelled = true;
                    return res;
                }
            }
        };
        // Do conversion
        Document pdfDocument = new Document("F:\\test\\PDFtoHTML.html", options);
        pdfDocument.save("F:\\out.pdf");
    }

}

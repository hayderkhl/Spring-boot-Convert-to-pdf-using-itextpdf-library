package com.example.rgpdbackend2;

import com.itextpdf.text.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PdfController {

        @GetMapping("/export")
    public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=student" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.GeneratePdf(response);
    }
}

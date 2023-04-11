package com.example.rgpdbackend2;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.example.rgpdbackend2.DrawCharte.drawCharteExample;

public class PdfGenerator {
    public void  GeneratePdf(HttpServletResponse response) throws DocumentException, IOException {
        //Creating the Object of document
        Document document = new Document(PageSize.A4);
        //Getting instance of PdfWriter
        PdfWriter writer = PdfWriter.getInstance(document, response.getOutputStream());
        //open Pdf File
        document.open();
        //Creating font
        // Setting font style and size
        Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontTiltle.setSize(30);
        // Creating Chunk
        Font fontsize0 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontsize0.setSize(40);
        Paragraph paragraph10 = new Paragraph("XXXXX", fontsize0);
        paragraph10.setAlignment(Element.ALIGN_RIGHT);
        Paragraph paragraph11 = new Paragraph("TUNISIE", fontsize0);
        paragraph11.setAlignment(Element.ALIGN_LEFT);
        PdfPCell cell5 = new PdfPCell();
        PdfPCell cell6 = new PdfPCell();
        cell5.addElement(paragraph10);
//        cell6.setMinimumHeight(25);
        cell6.setBorderWidthRight(48);
        cell6.setBorderWidthTop(25);
        cell6.addElement(paragraph11);
        cell5.setBorderColor(BaseColor.WHITE);
        cell6.setBorderColor(BaseColor.WHITE);
//        cell6.setBackgroundColor(new BaseColor(180, 200, 255));
        cell6.setBackgroundColor(BaseColor.RED);
        cell5.setBorder(Rectangle.BOX);
        PdfPTable table2 = new PdfPTable(2);
        table2.setHorizontalAlignment(Element.ALIGN_LEFT);
        table2.addCell(cell5);
        table2.addCell(cell6);
        document.add(table2);

        Font fontTiltle1 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontTiltle.setSize(25);
        Paragraph paragraph3 = new Paragraph("-****-*****-**", fontTiltle);
        paragraph3.setAlignment(Element.ALIGN_CENTER);
        paragraph3.add("\n");
        document.add(paragraph3);
        Chunk chunk1 = new Chunk("contact@********.com", new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.RED));
        Phrase phrase1 = new Phrase();
        phrase1.add(chunk1);
        Paragraph paragraph4 = new Paragraph();
        paragraph4.setAlignment(Element.ALIGN_CENTER);
        paragraph4.setPaddingTop(20f);
        paragraph4.add(chunk1);
        paragraph4.add("\n");
        paragraph4.add("\n");
        document.add(paragraph4);

        Font fontsize = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontsize.setSize(20);
        Paragraph paragraph1 = new Paragraph("   About the Organization", fontsize);
        Paragraph paragraph2 = new Paragraph("You", fontsize);

        paragraph1.setAlignment(Element.ALIGN_LEFT);
        paragraph2.setAlignment(Element.ALIGN_CENTER);
        PdfPCell cell = new PdfPCell();
        PdfPCell cell1 = new PdfPCell();
        cell.addElement(paragraph1);
        cell1.setFixedHeight(50);
        cell1.addElement(paragraph2);
        cell.setBorderColor(BaseColor.WHITE);
        cell1.setBorderColor(BaseColor.WHITE);
        cell.setBorderWidth(1f);
        cell.setBorder(Rectangle.BOX);
        PdfPTable table = new PdfPTable(2);
        table.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(cell);
        table.addCell(cell1);
        document.add(table);

        // -------here I put the icons and the variable inside the two boxs---------
        String dynamicVariable = "  anything";
        // create a paragraph with the image and dynamic variable
        Image icon = Image.getInstance("src/main/resources/static/iconsfirsto.png");
        icon.scaleAbsolute(20, 20); // set the size of the ima
//        icon.setSpacingAfter(5);
        icon.setPaddingTop(3);
//        icon.setSpacingBefore(5);
        Phrase phrase88 = new Phrase();
        Chunk chunk = new Chunk(icon, 3.5f, 3.5f, true);
        Chunk chunk2 = new Chunk(dynamicVariable);
        phrase88.add(chunk);

        phrase88.add(chunk2);


        Image icon2 = Image.getInstance("src/main/resources/static/iconthird.png");
        icon2.scaleAbsolute(20, 20); // set the size of the ima
        icon2.setSpacingAfter(5);
        icon2.setPaddingTop(3);
        icon2.setSpacingBefore(5);
        Paragraph paragraph5 = new Paragraph(phrase88);
//        paragraph5.add(phrase88); // add the icon as a chunk
//        paragraph5.add(new Phrase(dynamicVariable)); // add the sentence as a phrase
        paragraph5.add("               ");
        paragraph5.add(new Chunk(icon2, 3.5f, 3.5f, true)); // add the icon as a chunk
        paragraph5.add(new Phrase(dynamicVariable)); // add the sentence as a phrase
        paragraph5.add("\n");


        String dynamicVariable1 = "  anything";
        // create a paragraph with the image and dynamic variable
        Image icon1 = Image.getInstance("src/main/resources/static/iconsecond.png");
        icon1.scaleAbsolute(20, 20); // set the size of the ima
        icon1.setSpacingAfter(5);
        icon1.setPaddingTop(3);
        icon1.setSpacingBefore(5);
        Paragraph paragraph6 = new Paragraph();
        paragraph6.add(new Chunk(icon1, 1, 3.5f, true)); // add the icon as a chunk
        paragraph6.add(new Phrase(dynamicVariable1)); // add the sentence as a phrase

        // create a paragraph with the image and dynamic variable
        Image icon3 = Image.getInstance("src/main/resources/static/iconfour.png");
        icon3.scaleAbsolute(25, 25); // set the size of the ima
        icon3.setSpacingAfter(5);
        icon3.setPaddingTop(3);
        icon3.setSpacingBefore(5);
        Image icon4 = Image.getInstance("src/main/resources/static/iconfifth.png");
        icon4.scaleAbsolute(25, 25); // set the size of the ima
        icon4.setSpacingAfter(5);
        icon4.setPaddingTop(3);
        icon4.setSpacingBefore(5);
        Paragraph paragraph8 = new Paragraph();
        paragraph8.add(new Chunk(icon3, 3.5f, 3.5f, true)); // add the icon as a chunk
        paragraph8.add(new Phrase(dynamicVariable)); // add the sentence as a phrase
        paragraph8.add("              ");
        paragraph8.add(new Chunk(icon4, 3.5f, 3.5f, true)); // add the icon as a chunk
        paragraph8.add(new Phrase(dynamicVariable)); // add the sentence as a phrase
        class RoundedCornersCell1 implements PdfPCellEvent {
            public void cellLayout(PdfPCell cell, Rectangle rect, PdfContentByte[] canvas) {
                PdfContentByte cb = canvas[PdfPTable.LINECANVAS];
                cb.roundRectangle(rect.getLeft(), rect.getBottom(), rect.getWidth(), rect.getHeight(), 5);
                cb.stroke();
            }
        }

// Create the first box
        PdfPTable box1 = new PdfPTable(1);
        PdfPCell cell3 = new PdfPCell(new Phrase("Box 1"));
        cell3.addElement(paragraph5);
        cell3.addElement(paragraph6);
        cell3.setPaddingTop(3f);
        cell3.setBorder(Rectangle.NO_BORDER);
        cell3.setCellEvent(new RoundedCornersCell1());
        box1.addCell(cell3);
// Create the second box
        PdfPTable box2 = new PdfPTable(1);
        PdfPCell cell4 = new PdfPCell(new Phrase("Box 2"));
        cell4.addElement(paragraph8);
        cell4.setPaddingTop(3f);
        cell4.setBorder(Rectangle.NO_BORDER);
        cell4.setCellEvent(new RoundedCornersCell1());
        box2.addCell(cell4);
// Create the parent table and add the boxes to it
        PdfPTable parentTable = new PdfPTable(2);
        parentTable.setWidthPercentage(100);
        parentTable.setPaddingTop(2.5f);
        parentTable.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        parentTable.addCell(box1);
        parentTable.addCell(box2);
// Add the parent table to the document
        document.add(parentTable);
//-------------------------------------------------------------------------------------
        Paragraph paragraph13 = new Paragraph(" Votre score de conformité", fontsize);
        paragraph13.setAlignment(Element.ALIGN_LEFT);
        PdfPCell cell8 = new PdfPCell();
        cell8.addElement(paragraph13);
        cell8.setBorderColor(BaseColor.WHITE);
        cell8.setBorder(Rectangle.BOX);
        cell8.setPadding(11);
        PdfPTable table5 = new PdfPTable(1);
        table5.setHorizontalAlignment(Element.ALIGN_LEFT);
        table5.addCell(cell8);
        document.add(table5);
        //-------Add charte to our PDF-------------
        float score = 25;
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("slice1",score);
        dataset.setValue("slice2",100 - score);
        JFreeChart chart = drawCharteExample(dataset);
        int width = 145;   /* Width of the image */
        int height = 145;  /* Height of the image */
        BufferedImage bufferedImage = chart.createBufferedImage(width, height);
        ImageIO.write(bufferedImage, "png", new File("pie_chart.png"));
        Image chartImage = Image.getInstance("pie_chart.png");
        chartImage.setBorderColor(BaseColor.WHITE);
        //-----------------------------------test delete it ----
        //-----------------------create the parentTable1 to hold the chart and the text of the chart-------------------------------
        PdfPTable parentTable1 = new PdfPTable(2);
        parentTable1.setWidthPercentage(100);
        float[] columnWidths = {30f, 70f};
        parentTable1.setWidths(columnWidths);
        //************************************
        Paragraph paragraph15 = new Paragraph();
        paragraph15.add(new Chunk(chartImage, 0, 0, true)); // add the icon as a chunk
        PdfPCell cell7 = new PdfPCell(new Phrase("Box 3"));
        cell7.addElement(paragraph15);
        cell7.setBorder(Rectangle.NO_BORDER);
        cell7.setBorderColor(BaseColor.WHITE);
//        cell7.setCellEvent(new RoundedCornersCell1());
        PdfPTable box3 = new PdfPTable(1);
        box3.addCell(cell7);
        box3.setHorizontalAlignment(Element.ALIGN_LEFT);
        //-----------Create the text of the chart-------------------
        //according to the core we will write the title of the paragraph

        Font fontsize1 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontsize1.setSize(15);
        fontsize1.setColor(BaseColor.RED);
        fontsize1.isBold();
        PdfPTable box4 = new PdfPTable(1);
        PdfPCell cell9 = new PdfPCell(new Phrase("Box 4"));
        cell9.setBorder(Rectangle.NO_BORDER);
        cell9.setCellEvent(new RoundedCornersCell1());
        if (score > 0 && score <= 30 ) {
           Paragraph paragraph16 = new Paragraph("the title", fontsize1);
            paragraph16.setAlignment(Element.ALIGN_CENTER);
            cell9.addElement(paragraph16);
        } else if (score > 30 && score <=60) {
            Paragraph paragraph17 = new Paragraph("the title",fontsize1);
            paragraph17.setAlignment(Element.ALIGN_CENTER);
            cell9.addElement(paragraph17);
        } else {
            Paragraph paragraph18 = new Paragraph("the title" ,fontsize1);
            paragraph18.setAlignment(Element.ALIGN_CENTER);
            cell9.addElement(paragraph18);
        }
        //------------------------------------------------------------------------------------
        //--- Method to handle the position of text in table to put the chart and text in same case
        // Paragraph p = new Paragraph("test");
        //p.setFixedPosition(100, 800, 200);
        //document.add(p);
        //-------------------------------------------------------------------------------------
        Paragraph paragraph19 =new Paragraph();
        paragraph19.add("\nCe diagnostic vous donne un aperçu du travail important\n" +
                        "qu'il vous reste à accomplir. Mais pas de panique!\n" +
                        "Parcourons ensemble le détail de vos résultats ainsi\n" +
                        "que la manière dont Mission RGPD peut vous aider pour\n" +
                        "atteindre une conformité optimale simplement et rapidement!\n");
        paragraph19.setAlignment(Element.ALIGN_LEFT);
        cell9.addElement(paragraph19);
        cell9.setPadding(15);
        box4.addCell(cell9);
        //-----------------------------put box3 and box4 side by side ---------
        parentTable1.setPaddingTop(2.5f);
        parentTable1.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        parentTable1.addCell(box3);
        parentTable1.addCell(box4);
        document.add(parentTable1);

        //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
        Paragraph paragraph20 = new Paragraph(" Topic 1",fontsize);
        paragraph20.add("\n");
//        document.add(paragraph20);
        //******create separator line ************

        PdfPCell lineCell = new PdfPCell();
        lineCell.setBorder(Rectangle.BOTTOM);
        lineCell.setBorderWidthBottom(2f);
        lineCell.setPadding(0f);
        lineCell.setPhrase(new Phrase("\n"));
        lineCell.setBorderColorBottom(BaseColor.RED);

        PdfPTable table22 = new PdfPTable(1);
        table22.setWidthPercentage(96);
        table22.addCell(lineCell);

        //****************************************************************

        Paragraph paragraph23 = new Paragraph(new Phrase("\n"));
        paragraph23.add("Bravo Votre organisation a désigné un DPO Mission RGPD est une plateforme qui centralise\n");

        paragraph23.add(" tous les outils utiles pour faciliter la vie du DPO dans l'exercice de ses fonctions :\n" +
                "questionnaires d'audit, registre des incidents, gestion des demandes d'exercice de droits,\n"+
                "etc. Il semble même que ce soit vous l'heureux élu en charge de cette mission, ne vous\n" +
                "inquiétez pas, c'est loin d'être impossible ! Même si vous êtes seul dans cette aventure,\n" +
                "Mission RGPD a tout prévu et vous guidera tout au long de votre démarche de conformité.\n" +
                "Que vous soyez expert ou novice, la plateforme est adaptée à tous les profils et accessible\n" +
                "au plus grand nombre d'utilisateurs\n");
        paragraph23.setAlignment(Element.ALIGN_LEFT);
        paragraph23.add(new Phrase("\n"));

        int i = 3;
        for(i = 0 ; i <= 3 ; i++) {
            document.add(paragraph20);
            document.add(table22);
            document.add(paragraph23);
        }
        //****************************************************************
        document.add(table2);
        document.add(paragraph3);
        document.add(paragraph4);

        //-*------------------------------------------------------*-
        document.close();
    }
}

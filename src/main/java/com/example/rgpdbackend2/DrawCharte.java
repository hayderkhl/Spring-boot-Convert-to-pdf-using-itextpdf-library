package com.example.rgpdbackend2;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.*;


public class DrawCharte {
    public static JFreeChart drawCharteExample(DefaultPieDataset dataset) {

//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createRingChart("", dataset, false, false, false);
        RingPlot plot = (RingPlot) chart.getPlot();
        plot.setSeparatorPaint(Color.white);
        plot.setSeparatorStroke(new BasicStroke(1f));
        plot.setSectionDepth(0.2);
       plot.setLabelGenerator(null);
        //---------------test----------------
        int score = 70;
        TextTitle title = new TextTitle("Total: "+score+"%");
        Font titleFont = new Font("SansSerif", Font.BOLD, 12);
        title.setFont(titleFont);
        title.setPaint(Color.BLACK);
        title.setPosition(RectangleEdge.BOTTOM);
        chart.addSubtitle(title);
        //-----------------------------------
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlinePaint(Color.WHITE);
        plot.setLabelOutlinePaint(Color.WHITE);
        plot.setSectionPaint("slice1",Color.red);
        plot.setSectionPaint("slice2",Color.white);
        return chart;
    }
}

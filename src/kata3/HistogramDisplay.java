package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay () {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    public void execute () {
        setVisible(true);
    }

    private JPanel createPanel () {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    private JFreeChart createChart (DefaultCategoryDataset dataSet) {
        String title = "Histograma JFreeChart";
        String categoryAxisLabel = "Dominios email";
        String valueAxisLabel = "Nº de emails";

        JFreeChart chart = ChartFactory.createBarChart(title, categoryAxisLabel, valueAxisLabel, dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataset () {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset ();

        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(5, "", "gmail.com");
        dataSet.addValue(7, "", "ull.es");
        dataSet.addValue(2, "", "hotmail.com");

        return dataSet;
    }

}

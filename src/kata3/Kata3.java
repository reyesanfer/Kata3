package kata3;

/**
 *
 * @author FernandoSanfielReyes
 */
public class Kata3 {

    public static void main(String[] args) {
        /**/
        Histogram <String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }

}

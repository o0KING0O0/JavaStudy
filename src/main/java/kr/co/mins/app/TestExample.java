package kr.co.mins.app;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class TestExample {
   private DoubleProperty wallHwight;
   private DoubleProperty footingWidth;
   private DoubleProperty footingHwight;
   private DoubleProperty stemWidth;
   private DoubleProperty stemHwight;
   private DoubleProperty hillWidth;
   private DoubleProperty inclinedWidth;
   private DoubleProperty topWidth;
   private DoubleProperty declinedWidth;
   private DoubleProperty toeWidth;

    public TestExample (double wallHeight, double footingWidth, double footingHwight, double stemWidth, double stemHwight, double hillWidth,  double inclinedWidth, double topWidth, double declinedWidth, double toeWidth ){
        this.wallHwight = new SimpleDoubleProperty(wallHeight);
        this.footingWidth = new SimpleDoubleProperty(footingWidth);
        this.footingHwight = new SimpleDoubleProperty(footingHwight);
        this.stemWidth = new SimpleDoubleProperty(stemWidth);
        this.stemHwight = new SimpleDoubleProperty(stemHwight);
        this.hillWidth = new SimpleDoubleProperty(hillWidth);
        this.inclinedWidth = new SimpleDoubleProperty(inclinedWidth);
        this.topWidth = new SimpleDoubleProperty(topWidth);
        this.declinedWidth = new SimpleDoubleProperty(declinedWidth);
        this.toeWidth = new SimpleDoubleProperty(toeWidth);
}
    public double getToeWidth() {
        return toeWidth.get();
    }

    public DoubleProperty toeWidthProperty() {
        return toeWidth;
    }

    public void setToeWidth(double toeWidth) {
        this.toeWidth.set(toeWidth);
    }

    public double getDeclinedWidth() {
        return declinedWidth.get();
    }

    public DoubleProperty declinedWidthProperty() {
        return declinedWidth;
    }

    public void setDeclinedWidth(double declinedWidth) {
        this.declinedWidth.set(declinedWidth);
    }

    public double getTopWidth() {
        return topWidth.get();
    }

    public DoubleProperty topWidthProperty() {
        return topWidth;
    }

    public void setTopWidth(double topWidth) {
        this.topWidth.set(topWidth);
    }

    public double getInclinedWidth() {
        return inclinedWidth.get();
    }

    public DoubleProperty inclinedWidthProperty() {
        return inclinedWidth;
    }

    public void setInclinedWidth(double inclinedWidth) {
        this.inclinedWidth.set(inclinedWidth);
    }

    public double getHillWidth() {
        return hillWidth.get();
    }

    public DoubleProperty hillWidthProperty() {
        return hillWidth;
    }

    public void setHillWidth(double hillWidth) {
        this.hillWidth.set(hillWidth);
    }

    public double getStemHwight() {
        return stemHwight.get();
    }

    public DoubleProperty stemHwightProperty() {
        return stemHwight;
    }

    public void setStemHwight(double stemHwight) {
        this.stemHwight.set(stemHwight);
    }

    public double getStemWidth() {
        return stemWidth.get();
    }

    public DoubleProperty stemWidthProperty() {
        return stemWidth;
    }

    public void setStemWidth(double stemWidth) {
        this.stemWidth.set(stemWidth);
    }

    public double getFootingHwight() {
        return footingHwight.get();
    }

    public DoubleProperty footingHwightProperty() {
        return footingHwight;
    }

    public void setFootingHwight(double footingHwight) {
        this.footingHwight.set(footingHwight);
    }

    public double getFootingWidth() {
        return footingWidth.get();
    }

    public DoubleProperty footingWidthProperty() {
        return footingWidth;
    }

    public void setFootingWidth(double footingWidth) {
        this.footingWidth.set(footingWidth);
    }

    public double getWallHwight() {
        return wallHwight.get();
    }

    public DoubleProperty wallHwightProperty() {
        return wallHwight;
    }

    public void setWallHwight(double wallHwight) {
        this.wallHwight.set(wallHwight);
    }
}

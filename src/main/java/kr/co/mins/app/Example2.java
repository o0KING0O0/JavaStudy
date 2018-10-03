package kr.co.mins.app;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Example2 {
    private DoubleProperty W4;
    private DoubleProperty W5;
    private DoubleProperty W6;
    private DoubleProperty W1;
    private DoubleProperty W2;
    private DoubleProperty W3;
    private DoubleProperty H1;
    private DoubleProperty H2;
    private DoubleProperty H3;
    private DoubleProperty H4;


    public double getH3() {
        return H3.get();
    }

    public double getH4() {
        return H4.get();
    }

    public DoubleProperty h4Property() {
        return H4;
    }

    public void setH4(double h4) {
        this.H4.set(h4);
    }

    public DoubleProperty h3Property() {
        return H3;
    }

    public void setH3(double h3) {
        this.H3.set(h3);
    }

    public Example2 (double W4, double W5, double W1, double W2, double W3, double H1, double H2,  double H4)
      {
          this.W4 = new SimpleDoubleProperty (W4);
          this.W5 = new SimpleDoubleProperty (W5);

          this.W1 = new SimpleDoubleProperty (W1);
          this.W2 = new SimpleDoubleProperty (W2);
          this.W3 = new SimpleDoubleProperty (W3);
          this.H1 = new SimpleDoubleProperty (H1);
          this.H2 = new SimpleDoubleProperty (H2);
          this.H3 = new SimpleDoubleProperty (0);
          this.H4 = new SimpleDoubleProperty (H4);

          this.W6 = new SimpleDoubleProperty(0);



        bind();
      }

      public void bind(){
        W6.bind(W1.add(W2).add(W3).add(W4).add(W5));
        H3.bind(H4.subtract(H1).subtract(H2));
      }

    public double getW4() {
        return W4.get();
    }

    public DoubleProperty w4Property() {
        return W4;
    }

    public void setW4(double w4) {
        this.W4.set(w4);
    }

    public double getW5() {
        return W5.get();
    }

    public DoubleProperty w5Property() {
        return W5;
    }

    public void setW5(double w5) {
        this.W5.set(w5);
    }

    public double getW6() {
        return W6.get();
    }

    public DoubleProperty w6Property() {
        return W6;
    }

    public void setW6(double w6) {
        this.W6.set(w6);
    }

    public double getW1() {
        return W1.get();
    }

    public DoubleProperty w1Property() {
        return W1;
    }

    public void setW1(double w1) {
        this.W1.set(w1);
    }

    public double getW2() {
        return W2.get();
    }

    public DoubleProperty w2Property() {
        return W2;
    }

    public void setW2(double w2) {
        this.W2.set(w2);
    }

    public double getW3() {
        return W3.get();
    }

    public DoubleProperty w3Property() {
        return W3;
    }

    public void setW3(double w3) {
        this.W3.set(w3);
    }

    public double getH1() {
        return H1.get();
    }

    public DoubleProperty h1Property() {
        return H1;
    }

    public void setH1(double h1) {
        this.H1.set(h1);
    }

    public double getH2() {
        return H2.get();
    }

    public DoubleProperty h2Property() {
        return H2;
    }

    public void setH2(double h2) {
        this.H2.set(h2);
    }
}

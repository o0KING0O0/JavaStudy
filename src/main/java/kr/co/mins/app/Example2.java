package kr.co.mins.app;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Example2 {
    private DoubleProperty T1;
    private DoubleProperty T2;
    private DoubleProperty T3;
    private DoubleProperty W1;
    private DoubleProperty W2;
    private DoubleProperty W3;
    private DoubleProperty H1;
    private DoubleProperty H2;

      public Example2 (double T1, double T2, double T3, double W1, double W2, double W3, double H1, double H2)
      {
          this.T1 = new SimpleDoubleProperty (T1);
          this.T2 = new SimpleDoubleProperty (T2);
          this.T3 = new SimpleDoubleProperty (T3);
          this.W1 = new SimpleDoubleProperty (W1);
          this.W2 = new SimpleDoubleProperty (W2);
          this.W3 = new SimpleDoubleProperty (W3);
          this.H1 = new SimpleDoubleProperty (H1);
          this.H2 = new SimpleDoubleProperty (H2);

      }

    public double getT1() {
        return T1.get();
    }

    public DoubleProperty t1Property() {
        return T1;
    }

    public void setT1(double t1) {
        this.T1.set(t1);
    }

    public double getT2() {
        return T2.get();
    }

    public DoubleProperty t2Property() {
        return T2;
    }

    public void setT2(double t2) {
        this.T2.set(t2);
    }

    public double getT3() {
        return T3.get();
    }

    public DoubleProperty t3Property() {
        return T3;
    }

    public void setT3(double t3) {
        this.T3.set(t3);
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

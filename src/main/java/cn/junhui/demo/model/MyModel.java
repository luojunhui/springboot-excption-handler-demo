package cn.junhui.demo.model;

/**
 * MyModel class
 *
 * @author junhui
 * @date 19-4-26
 */
public class MyModel {

    private int a;
    private int b;

    public MyModel() {
    }

    public MyModel(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyModel{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

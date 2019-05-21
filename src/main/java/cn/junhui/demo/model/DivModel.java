package cn.junhui.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * DivModel class
 *
 * @author junhui
 * @date 19-4-26
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class DivModel {
    private int a;
    private int b;
    private int result;


    public DivModel(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "DivModel{" +
                "a=" + a +
                ", b=" + b +
                ", result=" + result +
                '}';
    }
}

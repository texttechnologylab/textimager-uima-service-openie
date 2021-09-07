package org.hucompute.textimager.uima.service.openie;

public class OpenIeExtraction {
    private int begin;
    private int end;
    private double confidence;

    private int beginArg1;
    private int endArg1;
    private String valueArg1;

    private int beginRel;
    private int endRel;
    private String valueRel;

    private int beginArg2;
    private int endArg2;
    private String valueArg2;

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public int getBeginArg1() {
        return beginArg1;
    }

    public void setBeginArg1(int beginArg1) {
        this.beginArg1 = beginArg1;
    }

    public int getEndArg1() {
        return endArg1;
    }

    public void setEndArg1(int endArg1) {
        this.endArg1 = endArg1;
    }

    public String getValueArg1() {
        return valueArg1;
    }

    public void setValueArg1(String valueArg1) {
        this.valueArg1 = valueArg1;
    }

    public int getBeginRel() {
        return beginRel;
    }

    public void setBeginRel(int beginRel) {
        this.beginRel = beginRel;
    }

    public int getEndRel() {
        return endRel;
    }

    public void setEndRel(int endRel) {
        this.endRel = endRel;
    }

    public String getValueRel() {
        return valueRel;
    }

    public void setValueRel(String valueRel) {
        this.valueRel = valueRel;
    }

    public int getBeginArg2() {
        return beginArg2;
    }

    public void setBeginArg2(int beginArg2) {
        this.beginArg2 = beginArg2;
    }

    public int getEndArg2() {
        return endArg2;
    }

    public void setEndArg2(int endArg2) {
        this.endArg2 = endArg2;
    }

    public String getValueArg2() {
        return valueArg2;
    }

    public void setValueArg2(String valueArg2) {
        this.valueArg2 = valueArg2;
    }
}

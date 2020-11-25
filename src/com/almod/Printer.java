package com.almod;

public class Printer implements PrinterMBean {
    private int numberOutput;
    private String text;

    public Printer(int numberOutput, String text) {
        this.numberOutput = numberOutput;
        this.text = text;
    }

    public Printer() {
    }

    @Override
    public void printText(String text) {
        System.out.println(text);
    }

    @Override
    public void printText() {
        for(int i = 1; i <= numberOutput; i++) {
            System.out.println(text + i);
        }
    }

    @Override
    public void printTextNTimes(String text, int number) {
        for(int i = 1; i <= number; i++) {
            System.out.println(text + i);
        }
    }


    public int getNumberOutput() {
        return numberOutput;
    }

    public void setNumberOutput(int numberOutput) {
        this.numberOutput = numberOutput;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

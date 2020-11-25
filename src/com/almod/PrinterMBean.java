package com.almod;

public interface PrinterMBean {
    public void printText(String text);

    public void printTextNTimes(String text, int number);

    public void printText();

    public int getNumberOutput();

    public void setNumberOutput(int numberOutput);

    public String getText();

    public void setText(String text);
}

package com.almod;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        Printer consolePrinter = new Printer(3, "text");

        ObjectName name = new ObjectName("com.almod:type=console_printer");
        mbs.registerMBean(consolePrinter, name);

        System.out.println("Waiting");
        Thread.sleep(Integer.MAX_VALUE);
    }
}

package String_HW.Printer;

import String_HW.Printer.Homework11;

public class Homework11_2 {
    public static void main(String[] args) {
       Homework11 h1 = new Homework11();
       h1.printerSummary();
       h1.print(51,true);
       h1.print(9);
       h1.print(80);
       h1.printerSummary();
       h1.addPaper(18);
        h1.addToner(9);
        h1.printerSummary();
        h1.addPaper(19888);
        h1.addPaper(-112);
        h1.addPaper(8);
        h1.printerSummary();
        h1.print(80);

    }
}

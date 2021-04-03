package String_HW.Printer;
public class Homework11 {

            private int maxToner = 100;
            private int maxPaper = 100;
            private int paperInTray = 100;
            private int toner = 100;


    public void print (int pagesToPrint) {
        if (pagesToPrint > paperInTray) {
            System.out.println("Not enough paper in the tray to print. Please add more paper and try again.");
        } if (toner<=0 || toner<pagesToPrint) {
            System.out.println("Toner level is "+ toner+ " which is not enough to print " + pagesToPrint+ " pages. Please add more toner and try again. \nPlease note: toner lever should be same or grater than number of pages you want to print.");
        } if(pagesToPrint<=0 || pagesToPrint>maxPaper) {
            System.out.println("Please enter valid data");
        } if (pagesToPrint<=paperInTray && pagesToPrint<=toner && pagesToPrint>0) {
            paperInTray = paperInTray -pagesToPrint;
            toner = toner - pagesToPrint;
            System.out.println("Waiting for " +pagesToPrint + " pages to be printed.");
        }
    }


        public void print ( int pagesToPrint, boolean typeTrueForDoubleSided){
            if (pagesToPrint > paperInTray * 2) {
                System.out.println("Not enough paper in the tray to print. Please add more paper and try again.");
            }
              if (toner<=0 || toner<pagesToPrint) {
                System.out.println("Toner level is "+ toner+ " which is not enough to print " + pagesToPrint+ " pages. Please add more toner and try again. \nPlease note: toner lever should be same or grater than number of pages you want to print.");
            } if(pagesToPrint<=0 || pagesToPrint>maxPaper) {
                System.out.println("Please enter valid data");
            } if (pagesToPrint <= paperInTray*2 && typeTrueForDoubleSided && toner>=pagesToPrint && pagesToPrint>0) {
                    paperInTray = paperInTray - pagesToPrint/2 - pagesToPrint%2; //pagesToPrint=51  ---> 100-25-1 = 100-26 = 74
                    toner = toner - pagesToPrint;
                    System.out.println("Waiting for " +pagesToPrint + " pages to be printed." );
                }
             }


            public void addPaper (int NumberSheetOfPaper) {
                if (NumberSheetOfPaper+paperInTray>maxPaper) {
                    int maxPaperYouCanAdd =maxPaper-paperInTray;
                    System.out.println("You can add no more than "+maxPaperYouCanAdd+ " sheets of paper at this time. Please try again.");
                } if(NumberSheetOfPaper<=0) {
                    System.out.println("Please enter valid data.");
                } if (NumberSheetOfPaper+paperInTray<=maxPaper && NumberSheetOfPaper>0) {
                paperInTray = paperInTray +NumberSheetOfPaper;
                System.out.println("You have added "+NumberSheetOfPaper+" paper sheets. Now you have "+paperInTray+" paper sheets in the printer.");
            }
            }

            public void addToner (int NumberOfToner) {
                if (NumberOfToner+toner>maxToner) {
                    int maxTonerYouCanAdd =maxToner-toner;
                    System.out.println("You can add no more than "+maxTonerYouCanAdd+ " toner at this time. Please try again.");
                } if (NumberOfToner<=0) {
                    System.out.println("Please enter valid data.");
                } if(NumberOfToner>0 && NumberOfToner+toner<=maxToner) {
                toner = toner+NumberOfToner;
                System.out.println("You have added "+NumberOfToner+" of toner. Now you have "+toner+" toner in the printer.");
            }
            }


           public void printerSummary() {
            System.out.println("Toner level: " + toner +
            "\nPaper in tray: "+ paperInTray);
             }



            /**
             * Create a Printer
             *
             * double maxToner level = 100;
             * int maxPaper in tray = 100;
             * with 1 page printing, 1 toner is being used
             *
             * print a files which is having 5 pages, print single sided
             * paperInTray = 95
             * toner = 95
             *
             * print a files which is having 5 pages; print double sided
             *      paper-1     pg1,2
             *      paper-2     pg3,4
             *      paper-3     pg5
             *  paper used = 3
             *  toner used = 5
             *
             *  paperInTray = 92
             *  toner = 90
             *
             *
             * 1. Create method 'print' which can be used to print single-sided or double-sided
             *      // If paper or toner is not enough to print, we display error msg saying, Not enough paper or toner
             * 2. Create method 'addPaper' to add papers in the tray
             * 3. Create method 'addToner' to add toner
             * 4. Create method 'printerSummary'
             *          Toner level: YY
             *          Paper in tray: XX
             */

            /**
             * Create object of Printer class.
             * Printer p1 = new Printer();
             *
             * p1.printerSummary();
             *          Toner level: 100
             *          Paper in tray: 100
             *
             * p1.print(10);        // single sided
             *
             * p1.printerSummary();
             *          Toner level: 90
             *          Paper in tray: 90
             *
             *
             * p1.print(10, true);  // double sided
             *
             * p1.printerSummary();
             *          Toner level: 80
             *          Paper in tray: 85
             *
             * p1.print(9, true);
             *
             * p1.printerSummary();
             *          Toner level: 71
             *          Paper in tray: 80
             *
             * p1.print(90);
             *     // If paper or toner is not enough to print, we display error msg saying, Not enough paper or toner
             *
             * p1.print(10);
             *
             * p1.printerSummary();
             *          Toner level: 61
             *          Paper in tray: 70
             *
             *
             * addToner(10)
             *    Toner level: 71
             *
             * addToner(30)
             *      // Invalid toner value
             *
             * addToner(-10)
             *      // Invalid toner value
             *
             */
        }



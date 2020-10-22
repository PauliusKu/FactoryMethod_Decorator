
public class MainTest {
    public static void main(String[] args) {
        ReportFactory reportFactory = new CreditReportFactory();
        Report report = reportFactory.makeReport("123456");

        report.printReportInfo();

        ReportFactory reportFactory2 = new ClientReportFactory();
        Report report2 = reportFactory2.makeReport("654321");

        report2.printReportInfo();
    }
}

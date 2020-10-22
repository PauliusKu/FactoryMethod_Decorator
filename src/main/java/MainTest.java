
public class MainTest {
    public static void main(String[] args) {
        ReportFactory reportFactory = new ClientReportFactory();
        Report report = reportFactory.makeReport("123456");

        report.printReportInfo();
    }
}

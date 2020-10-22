
public class MainTest {
    public static void main(String[] args) {
        ReportFactory reportFactory = new CreditReportFactory();
        Report report = reportFactory.makeReport("123456");

        for (ReportObject s : report.collectInfo()) {
            System.out.println(s.name + ": " + s.value);
        }

        System.out.println(" ");
    }
}

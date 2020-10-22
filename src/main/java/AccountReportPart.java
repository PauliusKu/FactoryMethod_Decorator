import java.util.ArrayList;

public class AccountReportPart extends ReportDecorator{
    final Report report;
    final int accountNumber;

    public AccountReportPart(Report report, int accountNumber){
        this.report = report;
        this.accountNumber = accountNumber;
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    public ArrayList<ReportObject> collectInfo() {
        ArrayList<ReportObject> reportInf = report.collectInfo();

        reportInf.add(new ReportObject("accountNumber", Integer.toString(accountNumber)));
        reportInf.add(new ReportObject("accountCurrency", "EUR"));
        reportInf.add(new ReportObject("accountBalance", "105.21"));
        return reportInf;
    }
}

import java.util.ArrayList;

public class AccountReportPart extends ReportDecorator{
    final Report report;
    final int accountNumber;

    public AccountReportPart(Report report, int accountNumber){
        reportInfo = new ArrayList<>();
        this.report = report;
        this.accountNumber = accountNumber;

        collectInfo();
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    protected void collectInfo() {
        this.reportInfo = report.reportInfo;

        reportInfo.add(new ReportObject("accountNumber", Integer.toString(accountNumber)));
        reportInfo.add(new ReportObject("accountCurrency", "EUR"));
        reportInfo.add(new ReportObject("accountBalance", "105.21"));
    }
}

import java.util.ArrayList;

public class CoBorrowersReportPart extends ReportDecorator{
    final Report report;
    final int coBorrowerId;

    public CoBorrowersReportPart(Report report, int coBorrowerId){
        reportInfo = new ArrayList<>();
        this.report = report;
        this.coBorrowerId = coBorrowerId;

        collectInfo();
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    protected void collectInfo() {
        this.reportInfo = report.reportInfo;

        reportInfo.add(new ReportObject("coBorrowerId", Integer.toString(coBorrowerId)));
        reportInfo.add(new ReportObject("relationType", "child"));
        reportInfo.add(new ReportObject("coBorrowerName", "abcdefg"));
        reportInfo.add(new ReportObject("coBorrowerLastName", "abcdefg"));
    }
}
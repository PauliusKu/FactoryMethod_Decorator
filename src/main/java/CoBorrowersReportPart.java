import java.util.ArrayList;

public class CoBorrowersReportPart extends ReportDecorator{
    final Report report;
    final int coBorrowerId;

    public CoBorrowersReportPart(Report report, int coBorrowerId){
        this.report = report;
        this.coBorrowerId = coBorrowerId;
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    public ArrayList<ReportObject> collectInfo() {
        ArrayList<ReportObject> reportInf = report.collectInfo();

        reportInf.add(new ReportObject("coBorrowerId", Integer.toString(coBorrowerId)));
        reportInf.add(new ReportObject("relationType", "child"));
        reportInf.add(new ReportObject("coBorrowerName", "abcdefg"));
        reportInf.add(new ReportObject("coBorrowerLastName", "abcdefg"));

        return reportInf;
    }
}
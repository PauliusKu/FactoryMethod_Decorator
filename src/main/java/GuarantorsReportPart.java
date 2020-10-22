import java.util.ArrayList;

public class GuarantorsReportPart extends ReportDecorator{
    final Report report;
    final int guarantorId;

    public GuarantorsReportPart(Report report, int guarantorId){
        this.report = report;
        this.guarantorId = guarantorId;
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    public ArrayList<ReportObject> collectInfo() {
        ArrayList<ReportObject> reportInf = report.collectInfo();

        reportInf.add(new ReportObject("guarantorId", Integer.toString(guarantorId)));
        reportInf.add(new ReportObject("relationType", "none"));
        reportInf.add(new ReportObject("guarantorName", "abcdefg"));
        reportInf.add(new ReportObject("guarantorLastName", "abcdefg"));
        return reportInf;
    }
}
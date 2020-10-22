import java.util.ArrayList;

public class GuarantorsReportPart extends ReportDecorator{
    final Report report;
    final int guarantorId;

    public GuarantorsReportPart(Report report, int guarantorId){
        reportInfo = new ArrayList<>();
        this.report = report;
        this.guarantorId = guarantorId;

        collectInfo();
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    protected void collectInfo() {
        this.reportInfo = report.reportInfo;

        reportInfo.add(new ReportObject("guarantorId", Integer.toString(guarantorId)));
        reportInfo.add(new ReportObject("relationType", "none"));
        reportInfo.add(new ReportObject("guarantorName", "abcdefg"));
        reportInfo.add(new ReportObject("guarantorLastName", "abcdefg"));
    }
}
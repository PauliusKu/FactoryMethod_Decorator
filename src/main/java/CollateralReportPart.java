import java.util.ArrayList;

public class CollateralReportPart extends ReportDecorator{
    final Report report;
    final int collateralId;


    public CollateralReportPart(Report report, int collateralId){
        reportInfo = new ArrayList<>();
        this.report = report;
        this.collateralId = collateralId;

        collectInfo();
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    protected void collectInfo() {
        this.reportInfo = report.reportInfo;

        reportInfo.add(new ReportObject("collateralId", Integer.toString(collateralId)));
        reportInfo.add(new ReportObject("collateralType", "House"));
        reportInfo.add(new ReportObject("collateralValue", "121000.00"));
    }
}

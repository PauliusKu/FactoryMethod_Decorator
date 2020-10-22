import java.util.ArrayList;

public class CollateralReportPart extends ReportDecorator{
    final Report report;
    final int collateralId;


    public CollateralReportPart(Report report, int collateralId){
        this.report = report;
        this.collateralId = collateralId;
    }

    @Override
    protected String getReportName() {
        return report.getReportName();
    }

    @Override
    public ArrayList<ReportObject> collectInfo() {
        ArrayList<ReportObject> reportInf = report.collectInfo();

        reportInf.add(new ReportObject("collateralId", Integer.toString(collateralId)));
        reportInf.add(new ReportObject("collateralType", "House"));
        reportInf.add(new ReportObject("collateralValue", "121000.00"));
        return reportInf;
    }
}

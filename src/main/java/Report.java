import java.util.ArrayList;

public abstract class Report {
    private String reportName;
    private String id;
    protected ArrayList<ReportObject> reportInfo;

    public Report(){}

    public Report(String externalId){
        reportName = getReportName();
        id = externalId;

        reportInfo = new ArrayList<>();
        collectInfo();
    }

    protected abstract String getReportName();

    protected void collectInfo(){
        reportInfo.add(new ReportObject("reportName", reportName));
        reportInfo.add(new ReportObject("id", id));
    }

    public final void printReportInfo(){
        for (ReportObject s : reportInfo) {
            System.out.println(s.name + ": " + s.value);
        }

        System.out.println(" ");
    }
}

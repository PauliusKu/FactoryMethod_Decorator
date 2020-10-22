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
    }

    protected abstract String getReportName();

    public ArrayList<ReportObject> collectInfo(){
        reportInfo.add(new ReportObject("reportName", reportName));
        reportInfo.add(new ReportObject("id", id));
        return reportInfo;
    }

    public final void printReportInfo(){
        for (ReportObject s : reportInfo) {
            System.out.println(s.name + ": " + s.value);
        }

        System.out.println(" ");
    }
}

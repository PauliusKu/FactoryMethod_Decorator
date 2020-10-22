import java.util.ArrayList;

public class ClientReport extends Report{
    public ClientReport(String externalId){
        super(externalId);
    }

    @Override
    protected String getReportName() {
        return "ClientReport";
    }

    @Override
    public ArrayList<ReportObject> collectInfo(){
        reportInfo = super.collectInfo();
        reportInfo.add(new ReportObject("name", "abc"));
        reportInfo.add(new ReportObject("lastname", "abc"));
        reportInfo.add(new ReportObject("address", "123"));
        reportInfo.add(new ReportObject("phoneNumber", "321"));
        return reportInfo;
    }
}

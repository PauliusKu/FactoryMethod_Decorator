import java.util.ArrayList;

public class CreditReport extends Report{
    public CreditReport(String externalId){
        super(externalId);
    }

    @Override
    protected String getReportName() {
        return "CreditReport";
    }

    public ArrayList<ReportObject> collectInfo(){
        reportInfo = super.collectInfo();
        reportInfo.add(new ReportObject("number", "123456"));
        reportInfo.add(new ReportObject("type", "commercial loan"));
        reportInfo.add(new ReportObject("customerId", "123456"));
        reportInfo.add(new ReportObject("openAmount", "5000"));
        reportInfo.add(new ReportObject("startDate", "2020.01.01"));
        reportInfo.add(new ReportObject("dueDate", "2030.01.01"));
        reportInfo.add(new ReportObject("yearlyIntRate", "11"));
        return reportInfo;
    }
}

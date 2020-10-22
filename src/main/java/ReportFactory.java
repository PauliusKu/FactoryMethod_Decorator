public abstract class ReportFactory {
    protected Report report;
    protected int id;
    protected String externalId;

    public Report makeReport(String extId){
        externalId = extId;
        mapId();

        return createReport();
    }

    protected abstract Report createReport();

    protected void addCollaterals(){
        report = new CollateralReportPart(report, 10);
    }

    protected void addAccounts(){
        report = new AccountReportPart(report, 123456789);
        report = new AccountReportPart(report, 987654321);
    }

    protected void addCoBorrowers(){
        report = new CoBorrowersReportPart(report, 123456);
    }

    protected void addGuarantors(){
        report = new GuarantorsReportPart(report, 444444);
    }

    private void mapId(){
        id = Integer.parseInt(externalId);
    }
}

public class CreditReportFactory extends ReportFactory {
    @Override
    protected Report createReport() {
        report = new CreditReport(externalId);

        addCollaterals();
        addAccounts();
        return report;
    }
}

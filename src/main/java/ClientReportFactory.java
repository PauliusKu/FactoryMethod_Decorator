public class ClientReportFactory extends ReportFactory {
    @Override
    protected Report createReport() {
        report = new ClientReport(externalId);

        addCollaterals();

        switch (getClientType()){
            case LEGAL:
                createLegal();
                break;
            case PRIVATE:
                createPrivate();
                break;
        }

        return report;
    }

    private ClientType getClientType(){
        return ClientType.LEGAL;
    }

    private void createLegal(){
        addGuarantors();
    }

    private void createPrivate(){
        addCoBorrowers();
    }
}

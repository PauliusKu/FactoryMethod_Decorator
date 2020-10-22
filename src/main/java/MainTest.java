import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class MainTest {
    public static void main(String[] args) {
        ReportFactory reportFactory = new ClientReportFactory();
        Report report = reportFactory.makeReport("123456");

        report.printReportInfo();
//        }
    }
}

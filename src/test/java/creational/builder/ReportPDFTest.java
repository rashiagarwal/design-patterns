package creational.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class ReportPDFTest {

  @Mock
  private Report report;

  @InjectMocks
  private ReportPDF reportPDF;

  @Test
  public void shouldSetReportType() {
    reportPDF.setReportType();

    Mockito.verify(report, times(1)).setType("PDF");
  }

  @Test
  public void shouldSetReportHeader() {
    reportPDF.setReportHeader();

    Mockito.verify(report, times(1)).setHeader("PDF report header");
  }

  @Test
  public void shouldSetReportFooter() {
    reportPDF.setReportFooter();

    Mockito.verify(report, times(1)).setFooter("PDF report footer");
  }
}
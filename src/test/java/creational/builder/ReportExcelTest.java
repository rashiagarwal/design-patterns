package creational.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class ReportExcelTest {
  @Mock
  private Report report;

  @InjectMocks
  private ReportExcel reportExcel;

  @Test
  public void shouldSetReportType() {
    reportExcel.setReportType();

    Mockito.verify(report, times(1)).setType("Excel");
  }

  @Test
  public void shouldSetReportHeader() {
    reportExcel.setReportHeader();

    Mockito.verify(report, times(1)).setHeader("Excel report header");
  }

  @Test
  public void shouldSetReportFooter() {
    reportExcel.setReportFooter();

    Mockito.verify(report, times(1)).setFooter("Excel report footer");
  }
}
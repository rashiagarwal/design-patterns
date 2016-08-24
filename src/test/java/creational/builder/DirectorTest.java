package creational.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DirectorTest {

  @Mock
  private ReportPDF reportPDF;

  @Mock
  private ReportExcel reportExcel;

  private Director director;

  @Test
  public void shouldMakePDFReport() {
    Report report = new Report("pdf report type", "pdf report header", "pdf report footer");
    when(reportPDF.getReport()).thenReturn(report);

    director = new Director(reportPDF);
    Report result = director.makeReport();

    Mockito.verify(reportPDF, times(1)).setReportType();
    Mockito.verify(reportPDF, times(1)).setReportHeader();
    Mockito.verify(reportPDF, times(1)).setReportFooter();
    Mockito.verify(reportPDF, times(1)).getReport();
    assertThat(result.getType(), is("pdf report type"));
    assertThat(result.getHeader(), is("pdf report header"));
    assertThat(result.getFooter(), is("pdf report footer"));
  }

  @Test
  public void shouldMakeExcelReport() {
    Report report = new Report("excel report type", "excel report header", "excel report footer");
    when(reportExcel.getReport()).thenReturn(report);

    director = new Director(reportExcel);
    Report result = director.makeReport();

    Mockito.verify(reportPDF, times(1)).setReportType();
    Mockito.verify(reportPDF, times(1)).setReportHeader();
    Mockito.verify(reportPDF, times(1)).setReportFooter();
    Mockito.verify(reportPDF, times(1)).getReport();
    assertThat(result.getType(), is("excel report type"));
    assertThat(result.getHeader(), is("excel report header"));
    assertThat(result.getFooter(), is("excel report footer"));
  }
}
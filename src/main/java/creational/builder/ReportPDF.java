package creational.builder;

import org.springframework.stereotype.Component;

@Component
class ReportPDF extends ReportBuilder {

  public void setReportType() {
    report.setType("PDF");
  }

  public void setReportHeader() {
    report.setHeader("PDF report header");
  }

  public void setReportFooter() {
    report.setFooter("PDF report footer");
  }
}
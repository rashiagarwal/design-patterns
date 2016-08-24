package creational.builder;

import org.springframework.stereotype.Component;

@Component
class ReportExcel extends ReportBuilder {
  public void setReportType() {
    report.setType("Excel");
  }

  public void setReportHeader() {
    report.setHeader("Excel report header");
  }

  public void setReportFooter() {
    report.setFooter("Excel report footer");
  }
}
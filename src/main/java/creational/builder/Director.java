package creational.builder;

import org.springframework.stereotype.Component;

@Component
class Director {

  private ReportBuilder builder;

  Director(ReportBuilder builder) {
    this.builder = builder;
  }

  Report makeReport() {
    builder.setReportType();
    builder.setReportHeader();
    builder.setReportFooter();

    return builder.getReport();
  }
}

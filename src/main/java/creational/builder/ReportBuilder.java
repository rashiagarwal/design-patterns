package creational.builder;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
abstract class ReportBuilder {

  @Autowired
  protected Report report;

  public abstract void setReportType();

  public abstract void setReportHeader();

  public abstract void setReportFooter();
}
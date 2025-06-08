package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
  private static ExtentReports extent;
  public static synchronized ExtentReports getInstance() {
    if (extent == null) {
    	ExtentSparkReporter html = new ExtentSparkReporter("target/ExtentReport.html");
      extent = new ExtentReports();
      extent.attachReporter(html);
    }
    return extent;
  }
}

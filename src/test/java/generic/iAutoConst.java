package generic;

import com.aventstack.extentreports.ExtentReports;

public interface iAutoConst {
	
	public  ExtentReports EXTENTREPORTS = new ExtentReports();
	public	String REPORT_PATH = "./result/MyReport.html";
	public  String ENV_FOLDER = "./env/";
	public  String CHROME_KEY ="webdriver.chrome.driver";
	public  String GECKO_KEY = "webdriver.gecko.driver";
	public  String SCREENSHOT_FOLDER =  "./screenshot/";                                                        
	public  String IMAGE_FORMAT= ".png";
	public  String SCREENSHOT_FOLDER_FOR_REPORT = "./../screenshot/";
	public  String INPUTTXL_PATH="./data/input.xlsx";

}

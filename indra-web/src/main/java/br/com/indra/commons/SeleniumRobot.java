package br.com.indra.commons;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.indra.utils.DriverInitializer;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class SeleniumRobot{

	
	private static WebDriverWait wait;
	private static File SrcFile;
	

	/**
	 * espera o elemento aparecer na p�gina
	 * 
	 * @param element
	 */
	public static void waitElementAppear(WebElement element) {

		wait = new WebDriverWait(DriverInitializer.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * espera durante 10 secons o elemento na p�gina
	 */
	public static void implicityWait() {

		DriverInitializer.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * tira prints dos testes
	 * 
	 * @param fileWithPath
	 * @throws Exception
	 */
	public static void takeSnapShot() {

		SrcFile = ((TakesScreenshot)DriverInitializer.getDriver()).getScreenshotAs(OutputType.FILE);

	}

}

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Andri\\Katalon Studio\\TAK Batch 9 - Test Mobile Automation\\Data Files\\Todo_2.0_APKPure.apk', 
    false)

Mobile.tap(findTestObject('Object Repository/Page_edit/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Page_edit/android.widget.TextView - Edit'), 0)

Mobile.tap(findTestObject('Page_edit/android.widget.TextView - Edit Category'), 0)

Mobile.tap(findTestObject('page_create_task/android.widget.CheckedTextView - Business'), 0)

Mobile.tap(findTestObject('Page_edit/android.widget.TextView_Btn_save'), 0)

Mobile.verifyElementText(findTestObject('Page_edit/android.widget.TextView - verify cat Business'), 'Business', FailureHandling.OPTIONAL)


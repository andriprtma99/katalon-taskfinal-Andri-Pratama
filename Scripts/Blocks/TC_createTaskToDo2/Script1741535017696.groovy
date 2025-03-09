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

Mobile.tap(findTestObject('Page Awal/android.widget.TextView - Skip'), 10, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('main_menu/android.widget.TextView - Todo'), 0)

Mobile.tap(findTestObject('Page Awal/android.widget.ImageButton - Btn Add Task'), 0)

Mobile.verifyElementVisible(findTestObject('page_create_task/android.widget.TextView - Label Add Task'), 0)

Mobile.sendKeys(findTestObject('page_create_task/android.widget.EditText - Enter task title'), 'Create task 2 automation')

Mobile.sendKeys(findTestObject('page_create_task/android.widget.EditText - Enter your task'), 'My Task')

Mobile.tap(findTestObject('page_create_task/android.widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('page_create_task/Calendar-object/android.view.View - 9'), 0)

Mobile.tap(findTestObject('page_create_task/Calendar-object/android.widget.Button - OKE'), 0)

Mobile.tap(findTestObject('page_create_task/android.widget.EditText - Set Time'), 0)

Mobile.tap(findTestObject('page_create_task/Set Time/android.widget.RadialTime-jam 10'), 0)

Mobile.tap(findTestObject('page_create_task/Set Time/Verrify set time/android.widget.RadioButton - PM'), 0)

Mobile.tap(findTestObject('page_create_task/Set Time/Set Minute/android.widget.RadialTime-Minute-00'), 0)

Mobile.tap(findTestObject('page_create_task/Set Time/android.widget.Button - OKE'), 0)

Mobile.tap(findTestObject('page_create_task/android.widget.TextView - btn_save_task'), 0)


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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://manganshare.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Manganshare/button_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa'), 'U')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1'), 
    'UD')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2'), 
    'UDA')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3'), 
    'UDAN')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4'), 
    'UDANG')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5'), 
    'UDANG ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6'), 
    'UDANG K')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7'), 
    'UDANG KE')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8'), 
    'UDANG KEJ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9'), 
    'UDANG KEJU')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10'), 
    'UDANG KEJU ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10_11'), 
    'UDANG KEJU S')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'UDANG KEJU SP')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'UDANG KEJU SPE')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    'UDANG KEJU SPES')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    'UDANG KEJU SPESI')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'UDANG KEJU SPESIA')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/input_Title_w-full p-2 bg-gray-700 border b_d87dfa_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'UDANG KEJU SPESIAL')

WebUI.click(findTestObject('Object Repository/Page_Manganshare/button_Create Post'))


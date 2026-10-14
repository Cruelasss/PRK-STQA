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

WebUI.navigateToUrl('https://manganshare.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6'), 
    'A')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1'), 
    'AD')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2'), 
    'ADM')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3'), 
    'ADMI')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4'), 
    'ADMIN')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5'), 
    'ADMIN@')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6'), 
    'ADMIN@G')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5'), 
    'ADMIN@')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4'), 
    'ADMIN')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3'), 
    'ADMI')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2'), 
    'ADM')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1'), 
    'AD')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6'), 
    'A')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7'), 
    '')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8'), 
    'a')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9'), 
    'ad')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10'), 
    'adm')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11'), 
    'admi')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'admin')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'admin@')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    'admin@g')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    'admin@gm')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'admin@gma')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'admin@gmai')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    'admin@gmail')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    'admin@gmail.')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'), 
    'admin@gmail.c')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21'), 
    'admin@gmail.co')

WebUI.setText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 mb-4 border border-g_6f13e6_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c'), 
    'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1'), 
    'lnBUteI2ioQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1_2'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1_2_3'), 
    '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1_2_3_4'), 
    'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1_2_3_4_5'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1_2_3_4_5_6'), 
    'qeJ0sjJnwEs=')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1_2_3_4_5_6_7'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/BR Report/Page_Manganshare/input_Login_w-full p-2 border border-gray-6_ca073c_1_2_3_4_5_6_7_8'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/BR Report/Page_Manganshare/button_Login_absolute inset-y-0 right-0 fle_2632f3'))

WebUI.click(findTestObject('Object Repository/BR Report/Page_Manganshare/button_Login'))

WebUI.click(findTestObject('Object Repository/BR Report/Page_Manganshare/button_Report'))

WebUI.click(findTestObject('Object Repository/BR Report/Page_Manganshare/div_Nasi goreng20.341 servingsnasiayam telu_683323'))

WebUI.click(findTestObject('Object Repository/BR Report/Page_Manganshare/li_regarer Nudity'))


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

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_Ingredients_w-full p-2 bg-gray-700_9a1d75'), 'T')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_T'), 'TE')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TE'), 'TEP')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEP'), 'TEPU')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPU'), 'TEPUN')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUN'), 'TEPUNG')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG'), 'TEPUNG ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG_1'), 'TEPUNG 1')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1'), 'TEPUNG 1K')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1K'), 'TEPUNG 1KG')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KG'), 'TEPUNG 1KG\n')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KG_1'), 'TEPUNG 1KG\nN')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGN'), 'TEPUNG 1KG\n')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KG_1'), 'TEPUNG 1KG\nB')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGB'), 'TEPUNG 1KG\nBU')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBU'), 'TEPUNG 1KG\nBUM')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUM'), 'TEPUNG 1KG\nBUMB')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMB'), 'TEPUNG 1KG\nBUMBU')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU'), 'TEPUNG 1KG\nBUMBU ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU_1'), 'TEPUNG 1KG\nBUMBU M')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU M'), 'TEPUNG 1KG\nBUMBU MA')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MA'), 'TEPUNG 1KG\nBUMBU MAS')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MAS'), 'TEPUNG 1KG\nBUMBU MASA')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASA'), 'TEPUNG 1KG\nBUMBU MASAK')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAK'), 'TEPUNG 1KG\nBUMBU MASAKO')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKO'), 'TEPUNG 1KG\nBUMBU MASAKO\n')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKO_1'), 'TEPUNG 1KG\nBUMBU MASAKO\nB')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOB'), 'TEPUNG 1KG\nBUMBU MASAKO\nBO')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBO'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON_1'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON C')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON C'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CA')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CA'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CAB')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CAB'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE_1'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE 2'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2 ')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE 2_1'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2 S')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE 2 S'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2 SE')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE 2 SE'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2 SEN')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE 2 SEN'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2 SEND')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE 2 SEND'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2 SENDO')

WebUI.setText(findTestObject('Object Repository/Page_Manganshare/textarea_TEPUNG 1KGBUMBU MASAKOBON CABE 2 SENDO'), 'TEPUNG 1KG\nBUMBU MASAKO\nBON CABE 2 SENDOK')

WebUI.click(findTestObject('Object Repository/Page_Manganshare/button_Create Post'))


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

WebUI.navigateToUrl('https://diwanstaging.rhc.jo/identity/connect/authorize/callback?client_id=dashboards_services&redirect_uri=https%3A%2F%2Fdiwanstaging.rhc.jo%2FServices%2Fsignin-oidc&response_type=code%20id_token&scope=openid%20profile%20offline_access%20email%20integration_bus_api&response_mode=form_post&nonce=638131748292400724.YjQyNWYyNDEtYmZkYy00ZTdiLTg2ZjYtNDVjMDY3OTY3MmExNDUwMjY4YmMtMGY2Yi00ZjdlLTkwM2MtMGMyOTc4NTI4NWZk&state=CfDJ8MYF9nVjHJhNqAm-N66FrYscQN4fUy1G0MYoZAcJ17cqQYkv0L-fs8eJrEE6cg4FiD9R_OEPe9pn7u0dzPV--0F3uLmU3xYhZ8ckrP9nA1MDEKsktMPbgGDGJVLNjHKpL2HG_yTXLRJc4As6gAVX36BqK80-dTQsoWvSeP8k30CTRjiPEctYEG4ZtK2bTAVnEksa_I3IY5OukeScz2gIJ7YQDNapY1lj69OJ8BntEDRyJ6wJ0YxuNLVH-szax6HZbeF2t3ajK58W4BN00bd6wfYFbnBYFb4rn8etaCYq09reza9bPpQOSfbwnvIlJTg2qjNTy4EWBuQ_K1L5PE_8fRs')

WebUI.click(findTestObject('Object Repository/div_202120202019201820172016201520142013201_ea8a60'))

WebUI.click(findTestObject('Object Repository/span_'))

WebUI.click(findTestObject('Object Repository/span__1'))

WebUI.setText(findTestObject('Object Repository/textarea__Notes'), 'test')

WebUI.click(findTestObject('Object Repository/i__icon-paperplane'))

WebUI.click(findTestObject('Object Repository/button_'))


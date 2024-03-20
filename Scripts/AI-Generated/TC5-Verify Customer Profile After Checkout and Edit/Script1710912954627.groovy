import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://stackoverflow.com"

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

"Step 2: Click on link"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

"Step 3: Click on span  -> Navigate to page '*/single-ticket/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/span_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object_1'))

"Step 4: Click on svg 'EditIcon'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_single_ticket/svg_editicon'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/single-ticket/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single_ticket/svg_editicon'))

"Step 5: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_single_ticket/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/single-ticket/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single_ticket/div_object'))

"Step 6: Enter input value in input field 'tip amount'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_single_ticket/input_tip_amount'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/single-ticket/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_single_ticket/input_tip_amount'), input_tip_amount)

"Step 7: Click on button 'Save'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_single_ticket/button_save_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/single-ticket/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single_ticket/button_save_1'))

"Step 8: Click on button 'Checkout'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_single_ticket/button_checkout'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/single-ticket/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single_ticket/button_checkout'))

"Step 9: Click on button 'Checkout'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_single_ticket/button_checkout'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/single-ticket/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single_ticket/button_checkout'))

"Step 10: Click on button 'Ok' -> Navigate to page ''"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_single_ticket/button_ok'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/single-ticket/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single_ticket/button_ok'))

"Step 11: Click on link"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

"Step 12: Click on link  -> Navigate to page 'customer/profile/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object_1'))

"Step 13: Click on button 'scrollable-auto-tab-2'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_customer_profile/button_scrollable_auto_tab_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/customer/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_customer_profile/button_scrollable_auto_tab_2'))

"Step 14: Click on button 'scrollable-auto-tab-1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_customer_profile/button_scrollable_auto_tab_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/customer/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_customer_profile/button_scrollable_auto_tab_1'))

"Step 15: Click on button 'scrollable-auto-tab-3'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_customer_profile/button_scrollable_auto_tab_3_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/customer/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_customer_profile/button_scrollable_auto_tab_3_1'))

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Customer Profile After Checkout and Edit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}

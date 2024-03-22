import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://stackoverflow.com/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Click on link  -> Navigate to page 'aktion/wir-raeumen-auf'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

"Step 3: Click on button 'Filtern & Sortieren'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/button_filtern_sortieren'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/aktion/wir-raeumen-auf?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/button_filtern_sortieren'))

"Step 4: Click on header"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/h3_object_4'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/aktion/wir-raeumen-auf?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/h3_object_4'))

"Step 5: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/aktion/wir-raeumen-auf?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/div_object_1'))

"Step 6: Click on div 'filter-accordion'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/div_filter_accordion'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/aktion/wir-raeumen-auf?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/div_filter_accordion'))

"Step 7: Click on button '8 ARTIKEL ANZEIGEN' -> Navigate to page 'aktion/wir-raeumen-auf/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/button_18_artikel_anzeigen'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/aktion/wir-raeumen-auf?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/button_18_artikel_anzeigen'))

"Step 8: Click on image"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/img_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/aktion/wir-raeumen-auf/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/img_object'))

"Step 9: Click on link 'IN DEN WARENKORB\n+ kostenlose D\xe4mmung und Fu\xdfleisten w\xe4hlen' -> Navigate to page 'viewdata/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/hyperlink_in_den_warenkorb_kostenlose_d_mmung_un'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/aktion/wir-raeumen-auf/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_aktion_wir_raeumen_auf/hyperlink_in_den_warenkorb_kostenlose_d_mmung_un'))

"Step 10: Click on button 'checkout'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/button_checkout'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_viewdata/button_checkout'))

"Step 11: Click on button 'openGuestAccountForm'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/button_openguestaccountform'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_viewdata/button_openguestaccountform'))

"Step 12: Click on label"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/label_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_viewdata/label_object_1'))

"Step 13: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/input_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_viewdata/input_object_2'))

"Step 14: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_viewdata/input_object'))

"Step 15: Click on input field 'billing FirstName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/input_billing_firstname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_viewdata/input_billing_firstname'))

"Step 16: Enter input value in input field 'billing FirstName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/input_billing_firstname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_viewdata/input_billing_firstname'), input_billing_firstname)

"Step 17: Enter input value in input field 'billing LastName' -> Navigate to page 'INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de DE/-/EUR/ViewCheckoutAddressBook-EditAddress'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/input_billing_lastname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_viewdata/input_billing_lastname'), input_billing_lastname)

"Step 18: Click on link 'collapseEditNewAddressBTN'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/hyperlink_collapseeditnewaddressbtn'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/hyperlink_collapseeditnewaddressbtn'))

"Step 19: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_object'))

"Step 20: Enter input value in input field 'newaddress FirstName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_firstname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_firstname'), input_newaddress_firstname)

"Step 21: Enter input value in input field 'newaddress LastName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_lastname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_lastname'), input_newaddress_lastname)

"Step 22: Enter input value in input field 'newaddress Address1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_address1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_address1'), input_newaddress_address1)

"Step 23: Enter input value in input field 'newaddress PostalCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_postalcode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_postalcode'), input_newaddress_postalcode)

"Step 24: Enter input value in input field 'newaddress City' -> Navigate to page 'viewdata/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_city'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/input_newaddress_city'), input_newaddress_city)

"Step 25: Click on button 'continue' -> Navigate to page 'INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de DE/-/EUR/ViewCheckoutAddressBook-EditAddress'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_viewdata/button_continue_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/viewdata/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_viewdata/button_continue_1'))

"Step 26: Click on label  -> Navigate to page 'INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de DE/-/EUR/ViewCheckoutAddressBook-UseAsShipToAddress'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/label_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-EditAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/label_object'))

"Step 27: Click on div  -> Navigate to page 'INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de DE/-/EUR/ViewUserAccount-ProcessLogin'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/INTERSHOP/web/WFS/LaminatDEPOT-ConsumerDE-Site/de_DE/-/EUR/ViewCheckoutAddressBook-UseAsShipToAddress?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_INTERSHOP_web_WFS_LaminatDEPOT_ConsumerDE_Site_de_DE_EUR/div_object'))

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC169-Verify Order Placement and Account Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}

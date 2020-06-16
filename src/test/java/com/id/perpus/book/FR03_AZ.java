/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.id.perpus.book;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.id.perpus.PerpustakaanWebAppApplication;
import com.id.perpus.api.controller.auth.AuthController;
import com.id.perpus.common.ComboModel;
import com.id.perpus.common.Common;

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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:application.properties")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
/**
 *
 * @author azra
 */
public class FR03_AZ {
    public void test(){

        WebUI.openBrowser('')

        WebUI.navigateToUrl('http://localhost:8081/PerpustakaanWebApp/login')

        WebUI.setText(findTestObject('Object Repository/Page_Sistem Perpustakaan POLBAN/input_User Name_username'), 'januar@email.com')

        WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sistem Perpustakaan POLBAN/input_Password_password'), 'aeHFOx8jV/A=')

        WebUI.click(findTestObject('Object Repository/Page_Sistem Perpustakaan POLBAN/button_LOGIN'))

        WebUI.click(findTestObject('Object Repository/Page_Perpustakaan/a_User Management'))

        WebUI.setText(findTestObject('Object Repository/Page_Perpustakaan/input_Name_name'), 'azra')

        WebUI.click(findTestObject('Object Repository/Page_Perpustakaan/button_Search'))

        WebUI.click(findTestObject('Object Repository/Page_Perpustakaan/div_User Data ManagementNameNIMNIPStatus-- _cede08'))

        WebUI.setText(findTestObject('Object Repository/Page_Perpustakaan/input_Name_name'), 'januar')

        WebUI.click(findTestObject('Object Repository/Page_Perpustakaan/button_Search'))

        WebUI.click(findTestObject('Object Repository/Page_Perpustakaan/span_USER PROFILE'))

        WebUI.click(findTestObject('Object Repository/Page_Perpustakaan/a_LOG OUT'))

        WebUI.closeBrowser()


    }
}

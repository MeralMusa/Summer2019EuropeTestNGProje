package com.cybertek.tests.day15_pom_tests;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;
/*VERIFY RADIO BUTTONS
    Open browser
    Login as driver
    Go to Activities->Calendar Events
    Click on create calendar events
    Click on repeat
    Verify that repeat every days is checked
    verify that repeat weekday is not checked
    * */
public class RepeatOptionsTests extends TestBase {
    @Test
    public void RepeatRadioButtonTest(){
        //Login as driver
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
        //Go to Activities->Calendar Events
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");
        //Click on create calendar events
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        //if you getting error
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();
        //Click on repeat
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        createCalendarEventsPage.repeat.click();
        //Verify that repeat every days is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(),"Verify days rb is selected");
        //verify that repeat weekday is not checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"Verify weekdays rb is not selected");
    }
}
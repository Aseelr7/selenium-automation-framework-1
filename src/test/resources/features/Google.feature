Feature: Navigating to TekSchool website through google

  Given User is in the Google homepage
  When user clicks on the searchbar
  Then user enters the keyword TekSchool and clicks on the search button
  Then user clicks on the first link
  Then user should be able to see the TekSchool home page
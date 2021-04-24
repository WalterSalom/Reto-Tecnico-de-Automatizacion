@stories
Feature: Reto Utest
  As a user, I want to be part of the Utest community
  @scenario1
  Scenario: Fill out the registration form
    Given than walter wants to be part of the utest community

    When he fills out the registration form
      | strName | strLastName | strEmail               | strMonth | strDay | strYear | strLanguage | strCity | strZip | strCountry| strComputer | strVersion      | strComputerLanguage | strMobile| strModel | strSystem   | strPassword   | strPasswordConfirm|
      | Walter  | Salom       | samir_wssg@hotmail.com | June     | 4      | 1998    | Spanish     | Cucuta  | 540003 | Colombia  | Windows     | 10 Professional | Spanish             | Apple    | iPhone 8 | iOS 14.4.2  | Walter.453622 | Walter.453622     |

    Then he completes the registration process
      | strWelcome |
      | The last step|

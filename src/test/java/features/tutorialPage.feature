@TutorialPage
Feature: Tutorial Page

  @Check @Components
  Scenario Outline: Check Tutorial Page Components
    Given Enes is opened LcWaikiki App
    Then should see TvTutorial
    Then should see "<text>" text
    Then should see "<title>" title
    Then should see "<desc>" title description
    Then should see "<button>" button
    Examples:
      | text            | title           | desc                                | button |
      | Yeniliği Keşfet | PRATİK ALT MENÜ | Yenilenen alt menü ile kategorilere | Atla   |

  @DragDrop
  Scenario Outline: Check Drag Drop TvTutorial
    Given Enes is opened LcWaikiki App
    When drag and drop TvTutorial
    Then should see "<title>" title
    Examples:
      | title             |
      | KATEGORİ GÖRÜNÜMÜ |

  @Skip
  Scenario Outline: Click Skip Button
    Given Enes is opened LcWaikiki App
    When click Skip button
    Then should see Home Page
    Examples:
      | title             |
      | KATEGORİ GÖRÜNÜMÜ |





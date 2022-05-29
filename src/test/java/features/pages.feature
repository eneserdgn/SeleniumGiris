@PagesPage
Feature: Pages Page

  @Check @UploadAndDownload
  Scenario Outline: Check Upload and Download Page
    Given Enes is "<page>" page
    When click "<menu>" menu
    Then should see "<pageName>" Page
    Examples:
      | page     | menu                | pageName            |
      | Elements | Upload and Download | Upload and Download |

  @ChooseFile @UploadAndDownload
  Scenario Outline: Check choose file button on Upload and Download Page
    Given Enes is at "<page>" under "<underPage>" page
    When pick "<file>" using choose file button
    Then should see "<filePath>" file path
    Examples:
      | page     | underPage           | file                           | filePath             |
      | Elements | Upload and Download | /Users/vision/Desktop/enes.png | C:\fakepath\enes.png |

  @Check @Links
  Scenario Outline: Check Links Page
    Given Enes is "<page>" page
    When click "<menu>" menu
    Then should see "<pageName>" Page
    Examples:
      | page     | menu  | pageName |
      | Elements | Links | Links    |

  @Content @Links
  Scenario Outline: Check content on Links Page
    Given Enes is at "<page>" under "<underPage>" page
    When click "<link>" following links
    Then should see "<response>" response code
    Examples:
      | page     | underPage | link       | response |
      | Elements | Links     | Created    | 201      |
      | Elements | Links     | No Content | 204      |
      | Elements | Links     | Moved      | 301      |
      | Elements | Links     | Forbidden  | 403      |


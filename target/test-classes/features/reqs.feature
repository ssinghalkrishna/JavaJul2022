@reqs
  Feature: Reqs

    @reqs1 @smoke @sanity @regression
      Scenario: Search on Careers
        Given I open careers page
        When I search for "Principal Automation Engineer"
        Then I verify that position city is "San Francisco"
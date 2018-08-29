Feature: TransferMoney

Scenario Outline:
Given user logs into "<System>" using "<User>" and "<Pass>"
When he clicks on "<link>"
And navigates to "<page>"

Examples:
|System|User|Pass|link|page|
|core|aa|aa|tm|pg|
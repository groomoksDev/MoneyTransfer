# MoneyTransfer
For look how it work you have 2 ways:
1 - download jar
2 - run idea
a. GET - in browser type: localhost:4567/getAccountMoneyInfo/1 - Return 0.0
b. POST - need use curl: curl -d "fromId=3&toId=1&sum=100" " localhost:4567/sendMoney", then look how many money on account 1, and you will see
localhost:4567/getAccountMoneyInfo/1 - Return 100.0


import scripts.Chapter_5.Exercises.Ex02.BankAccount

var bankAccount = new BankAccount(120)

bankAccount.deposit(20)
assert( bankAccount.bal == 140.0 )
bankAccount.withdraw(40)
assert( bankAccount.bal == 100.0 )

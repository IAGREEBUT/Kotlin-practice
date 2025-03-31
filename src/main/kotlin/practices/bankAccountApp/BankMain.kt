package practices.bankAccountApp

fun main(){

    val myAccount = BankAccount("yujeong", 1835.23)

    myAccount.deposit(20.10)
    myAccount.displayTransactionHistory()
    myAccount.withdraw(20000.0)
    myAccount.withdraw(123.12)
    myAccount.displayTransactionHistory()

}
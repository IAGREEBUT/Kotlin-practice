package practices.bankAccountApp

class BankAccount(var accountHolder: String, var balance: Double) { //외부 접근 가능 값들
    private val transactionHistory = mutableListOf<String>()//private 외부에서 접근불가능, 내부에서만 접근 가능

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("deposit : $${amount}, total : $balance")
    }

    fun withdraw(amount: Double) {
        if (balance < amount) {
            println("you don't have the funds to withdraw $$amount. " +
                    "currently have $$balance")
        } else {
            balance -= amount
            transactionHistory.add("withdraw : $${amount}, total : $balance")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }
}
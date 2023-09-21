open class MobileMoneyAccount(val accountnumber:String, var balance:Double){
    fun deposit(amount:Double){
        balance +=amount

    }
    open fun widhdraw(amount: Double){

        if (balance>=amount){
            balance -=amount
        }else{
            println("Insufficient balance")
        }

    }
    fun checkBalance():Double{

        return balance

    }

}
class MpesaAccount(
    accountnumber: String,
    balance: Double,
    val phoneNumber:String
):MobileMoneyAccount(accountnumber,balance){

    fun sendmoney(recipient:MpesaAccount,amount: Double){

        if (balance>=amount){
            balance -=amount
            recipient.deposit(amount)
            println("sent $amount KES to ${recipient.phoneNumber}")
        }else{
            println("insufficient amount")
        }

    }

    override fun widhdraw(amount: Double) {
        if (balance>=amount +10.0){
            balance -=amount +10.0
            println("Withdrew $amount KES (Charges 10 KES Fee)")
        }else{
            println("Insuufficient balance")
        }

    }

}

fun main(args: Array<String>) {
    val erick=MpesaAccount("123456",1000.0,"25472345454")
    val joan=MpesaAccount("74747",500.0,"25476543")
    erick.sendmoney(joan,200.0)

    println("Erick balance : ${erick.checkBalance()} KES")
    println("Joan Balance : ${joan.checkBalance()} KES")

    erick.widhdraw(300.0)
    println("Erick's balance : ${erick.checkBalance()} KES")
}

fun main() {

    var numberPurchases = 0

    while (true) {

        print("Введите сумму покупки:")
        val sum: Double = readLine()?.toDouble() ?: return
        val discount0 = sum *100
        val discount100 = (sum - 100) *100
        val discount5 = (sum - (sum * 5 / 100)) *100
        val discountSum = if (sum > 10_001) discount5
        else if ((1001 < sum) && (sum <= 10_000)) discount100
        else discount0
        val discountSumRub: Double = discountSum / 100

        println("Сумма покупки со скидкой (если скидка предоставляется): $discountSumRub")

        numberPurchases += 1

        val discontMeloman = discountSum - (discountSum * 1 / 100)
        val finalSum = if (numberPurchases > 2) discontMeloman else discountSum
        val finalSumRub = finalSum / 100

        println("Сумма покупки со скидкой для постоянных клиентов (если скидка предоставляется): $finalSumRub")
        println()


    }
}
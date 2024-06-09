package com.example.calculator_hojeong

fun main() {
    var calculatorName = "호정의 계산기 Lv2"

    var calc = Calculation()

    println("연산을 진행할 첫 번째 값을 입력해주세요.")
    var num1 = readLine()!!.toInt()
    println("연산을 진행할 두 번째 값을 입력해주세요.")
    var num2 = readLine()!!.toInt()
    var num3 = 0

    var additionResult : Int = calc.add(num1, num2)
    var subtractionResult : Int = calc.subtract(num1, num2)
    var multiplicationResult : Int = calc.multiply(num1, num2)
    var divisionResult : Int = calc.divide(num1, num2)
    var remainderResult : Int = calc.remain(num1, num2)
    var calculationResult : Int = 0
    var calculationResultX : Int = 0
    var moreCalculationOption : Int = 0
    var cnt : Int = 0

    println("어떤 연산을 진행하실래요?(1(더하기)/2(빼기)/3(곱하기)/4(나누기)/5(나머지) 중 입력)")
    var calculationOption = readLine()!!.toInt()
//    var moreCalculationOption = 0

    if (calculationOption == 1){
        calculationResult = additionResult
        num3 = 0
    } else if (calculationOption == 2){
        calculationResult = subtractionResult
        num3 = 0
    } else if (calculationOption == 3){
        calculationResult = multiplicationResult
        num3 = 1
    } else if (calculationOption == 4){
        calculationResult = divisionResult
        num3 = 1
    } else if (calculationOption == 5) {
        calculationResultX = remainderResult
    } else {
        calculationResult = 99999999
        println("입력값이 잘못되었습니다.")
    }

    while (num3 != -1) {
        if (calculationOption == 1 || moreCalculationOption == 1) {
            println("더하기 연산을 수행합니다.")
            calculationResult += num3
            println(calculationResult)
            println("추가 연산을 진행하시려면 1~5 중 하나를 입력하세요.(1(더하기)/2(빼기)/3(곱하기)/4(나누기)/5(나머지))/-1(종료))")
            moreCalculationOption = readLine()!!.toInt()
            if (moreCalculationOption == -1){
                break
            }
            calculationOption = 0
            println("추가 연산하려는 숫자를 입력하세요.(-1을 입력하면 종료)")
            num3 = readLine()!!.toInt()
        } else if (calculationOption == 2 || moreCalculationOption == 2) {
            println("빼기 연산을 수행합니다.")
            calculationResult -= num3
            println(calculationResult)
            println("추가 연산을 진행하시려면 1~5 중 하나를 입력하세요.(1(더하기)/2(빼기)/3(곱하기)/4(나누기)/5(나머지)/-1(종료))")
            moreCalculationOption = readLine()!!.toInt()
            if (moreCalculationOption == -1){
                break
            }
            calculationOption = 0
            println("추가 연산하려는 숫자를 입력하세요.(-1을 입력하면 종료)")
            num3 = readLine()!!.toInt()
        } else if (calculationOption == 3 || moreCalculationOption == 3) {
            println("곱하기 연산을 수행합니다.")
            calculationResult *= num3
            println(calculationResult)
            println("추가 연산을 진행하시려면 1~5 중 하나를 입력하세요.(1(더하기)/2(빼기)/3(곱하기)/4(나누기)/5(나머지)/-1(종료))")
            moreCalculationOption = readLine()!!.toInt()
            if (moreCalculationOption == -1){
                break
            }
            calculationOption = 0
            println("추가 연산하려는 숫자를 입력하세요.(-1을 입력하면 종료)")
            num3 = readLine()!!.toInt()
        } else if (calculationOption == 4 || moreCalculationOption == 4) {
            println("나누기 연산을 수행합니다.")
            calculationResult /= num3
            println(calculationResult)
            println("추가 연산을 진행하시려면 1~5 중 하나를 입력하세요.(1(더하기)/2(빼기)/3(곱하기)/4(나누기)/5(나머지)/-1(종료))")
            moreCalculationOption = readLine()!!.toInt()
            if (moreCalculationOption == -1){
                break
            }
            calculationOption = 0
            println("추가 연산하려는 숫자를 입력하세요.(-1을 입력하면 종료)")
            num3 = readLine()!!.toInt()
        } else if (calculationOption == 5 || moreCalculationOption == 5) {
            println("나머지 연산을 수행합니다.")
            if (cnt == 0){
                println(calculationResultX)
            } else {
                calculationResult %= num3
                println(calculationResult)
            }
            println("추가 연산을 진행하시려면 1~5 중 하나를 입력하세요.(1(더하기)/2(빼기)/3(곱하기)/4(나누기)/5(나머지)/-1(종료))")
            moreCalculationOption = readLine()!!.toInt()
            if (moreCalculationOption == -1){
                break
            }
            calculationOption = 0
            println("추가 연산하려는 숫자를 입력하세요.(-1을 입력하면 종료)")
            num3 = readLine()!!.toInt()
            cnt += 1
        } else {
            println("옵션값이 잘못되었습니다.")
        }
    }
}

class Calculation {
    fun add(a: Int, b: Int) : Int {
        return a + b
    }
    fun subtract(a:Int, b: Int) : Int {
        return a - b
    }
    fun multiply(a: Int, b: Int) : Int {
        return a * b
    }
    fun divide(a: Int, b: Int) : Int {
        return a / b
    }
    fun remain(a: Int, b:Int) : Int {
        return a % b
    }
}

function discountcalculator(discount){
    return function (price){
        return price-price*discount/100;
    }
}
let ten = discountcalculator(10)
let twentyFive = discountcalculator(25)

console.log(ten(1000))
console.log(twentyFive(8525))
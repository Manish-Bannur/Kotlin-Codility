//String Padding-----------------------------
console.log("String Padding-----------Start--------------------");
var myString = "Lowes";
console.log(JSON.stringify(myString.padStart(10)));
console.log(JSON.stringify(myString.padEnd(10)));
console.log("String Padding-----------End--------------------");
console.log("\n\n");

Excercise

//Exponential Operator-----------------------------
console.log("Exponential Operator  (**) -----------Start--------------------");
var threeToPowerThree = 3 ** 3;
console.log(threeToPowerThree);
var threeToPowerFour = 3 ** 4;
console.log(threeToPowerFour);
console.log("Exponential Operator-----------End--------------------");
console.log("\n\n");

//Object Values and entries Operator-----------------------------
console.log("Object Values and entries Operator) ----------Start-----------------");
var person = {name:"Jhon Doe", age:98, favoriteColor: "Red"};

//Object Values
var arrayOfValues = Object.values(person);
console.log(arrayOfValues);

// fromentries - 2019 ES10

//Object Entries
var arrayOfEntries = Object.entries(person);
console.log(arrayOfEntries);
console.log("Object Values and entries Operator) ----------End-----------------");
console.log("\n\n");


//Trailing commas in function parameter lists and calls-----------------------------
function trailingComas(str1,str2,){
    console.log("str1: "+str1+ " \nStr2: " + str2);
}
console.log(trailingComas("String1","String2",));
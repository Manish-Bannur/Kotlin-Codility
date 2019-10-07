// Spread operator, remove the properties in new object----------------Start---------------------
const user = {
    firstName: 'Ratnakar',
    lastName: 'J',
    twiter: 'RAJ',
    city:'Bangalore',
    email:'rj@gmail.com',
    password:'werdellnfw'
}
const {password, ...userWithoutPwd} = user;
console.log(password);
console.log(userWithoutPwd);
/*
const {email,password, ...remainingProperties} = user;
console.log(email);
console.log(password);
console.log(remainingProperties);
*/
// Spread operator, remove the properties in new object----------------End---------------------
console.log("\n\n");

// Spread operator, arrays------------------------------Start------------------------------
const prime = [2,3,5,7,11];
const [fisrt,second,...rest] = prime;
console.log(fisrt);
console.log(second);
console.log(rest);
// Spread operator, arrays------------------------------End------------------------------
console.log("\n\n");

// Regular Expressions----------------------------------Start----------------------------

// 1. s (dotAll) flag for regular expressions
console.log("s (dotAll) flag for regular expressions");
console.log(/foo.bar/.test('foo\nbar')); //normal . dot means should match everything  but was not working for new line character
console.log(/foo.bar/s.test('foo\nbar')); // now with s and .  dot it matches new line character also.
console.log("\n\n");


// 2. RegExp named capture groups
console.log("RegExp named capture groups");
console.log("old way of capturing");
const regexold = /([0-9]{4})-([0-9]{2})-([0-9]{2})/;
const results_old = regexold.exec('2018-07-12');
console.log(results_old[1]); // prints 2018
console.log(results_old[2]); // prints 07
console.log(results_old[3]); // prints 12

console.log("new way of capturing");
const regexnew = /(?<year>[0-9]{4})-(?<month>[0-9]{2})-(?<day>[0-9]{2})/;
const results_new = regexnew.exec('2018-07-12');
console.log(results_new.groups.year);  // prints 2018
console.log(results_new.groups.month); // prints 07
console.log(results_new.groups.day);   // prints 12


// ES 2018

//Promise.prototype.finally
fetch('http://website.com/files')
    .then(data => data.json())
    .catch(err => console.error(err))
    .finally(() => console.log('processed!'))

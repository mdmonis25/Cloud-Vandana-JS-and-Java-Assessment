let str = "This is a sunny day";
let ans = str.split(" ").map(element => {
    return element.split("").reverse().join(" ");
});
console.log(ans);
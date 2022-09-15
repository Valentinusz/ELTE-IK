let tomb = [11, 42, 33, 36, 27, 48, 11, 7, 16, 29]
let originalDiv = document.querySelector("#original")
let t1div = document.querySelector("#t1")
let t2div = document.querySelector("#t2")
let t3div = document.querySelector("#t3")
let t4div = document.querySelector("#t4")
let t5div = document.querySelector("#t5")
let t6div = document.querySelector("#t6")
let t7div = document.querySelector("#t7")

// a. Válogasd ki azokat az értékeket, amikor fagyott!
let task1 = tomb.filter(e => e <= 0);
t1div.innerHTML = task1;

// b. Mindegyik hőmérséklet érték végére fűzd oda a C szöveget!
let task2 = tomb.map(e => e = e + "C");
t2div.innerHTML = task2;

// c. Add meg a legmagasabb hőmérséklet értéke!
let task3 = Math.max(...tomb);
t3div.innerHTML = task3;

// d. Add meg, hányszor ment a hőmérséklet 20 fok alá!
let task4 = tomb.filter(e => e < 20).length;
t4div.innerHTML = task4;

// e. Döntsd el, van-e 40 fok fölötti érték!
let task5 = tomb.some(e => e > 40);
t5div.innerHTML = (task5 ? "Van" : "Nincs");

// f. Döntsd el, hogy mindegyik hőmérsékletérték pozitív-e!
let task6 = tomb.every(e => e > 0);
t6div.innerHTML = (task6 ? "Igen" : "Nem");

// g. Add meg az első olyan értéket, amikor 10 fok fölé ment a hőmérséklet!
let task7 = tomb.find(e => e > 10);
t7div.innerHTML = task7;
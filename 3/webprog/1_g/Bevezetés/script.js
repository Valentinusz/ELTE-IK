// kiiratás konzolra (inspect-nél található) (konzol teljes értékű interpreter)
console.log("Hello világ!");

// ; elhagyható
// a vezérlési szerkezetek nagyon hasonlóak a c alapú nyelvekben megismert formájukhoz
/*
for (let index = 0; index < array.length; index++) {
    const element = array[index]   
}
*/

// típusrendszer gyenge, automatikus típuskonverzió
console.log("asd" + 2) //string lesz

// + túlterhelt operátor: konkatenáció, összeadás 
console.log("asd" + "asd")

// változó deklarálás var/let (akár elhagyható, let a preferált)
let nev = "Monke";

console.log(nev);

// megkeresi az első .title osztállyal rendelkező taget
let title = document.querySelector(".title");
//minden ilyen tag a querySelectorAll-al gyűjthető ki

//title változó értékében elmenetettük a taget
console.log(title);

title.innerHTML = nev;
console.log(title.innerHTML);
console.log(title.classList);

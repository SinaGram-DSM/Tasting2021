let intro = document.getElementById("intro");

let introMent = document.getElementById("IntroMent");

let Btn = document.getElementById("Btn");

let CPicture = document.getElementById("Character");

let Ment = document.getElementById("Ment");

window.addEventListener('scroll',function(){
    IntroSize();
    SecondAnimation();
})

function IntroSize(){
    console.log(window.scrollY)
    intro.style.width = window.scrollY  + "%"; 
    introMent.style.color = `rgb(${window.scrollY},${window.scrollY},${window.scrollY})`;
    Btn.style.opacity = window.scrollY / 100;
    if(window.scrollY > 100){
        Btn.style.opacity = 1 - window.scrollY/500;
    }
}

function SecondAnimation(){
    CPicture.style.marginLeft = window.scrollY/1.8 + "px";
    Ment.style.opacity = window.scrollY / 2000;
    Ment.style.fontSize = window.scrollY / 200 + "vmin"
}
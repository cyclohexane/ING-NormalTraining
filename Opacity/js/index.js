window.onload = function() {
    var oDiv = document.getElementById('div1');
    oDiv.onmouseover = function() {
        startMove(100);
    }
    oDiv.onmouseout = function() {
        startMove(30);
    }
}
var timer = null;
var alpha = 30;

function startMove(Target) {
    var oDiv = document.getElementById('div1');
    if (timer) clearInterval(timer);
    timer = setInterval(function() {
        var speed;
        if (alpha > Target) {
            speed = -10;
        } else {
            speed = 10;
        }
        if (alpha == Target) {
            clearInterval(timer);
        } else {
            alpha = alpha + speed;
            oDiv.style.filter = "alpha(opacity=" + alpha + ")";
            oDiv.style.opacity = alpha * 0.01;
        }
    }, 30);

}
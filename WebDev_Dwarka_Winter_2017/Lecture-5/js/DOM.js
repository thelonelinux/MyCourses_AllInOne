/**
 * Created by aayusharora on 12/28/17.
 */

window.onload = function() {
    var element = document.getElementById('node1');
    var input = document.getElementById('inp');
    console.log(element);


    function getValue() {

        var x = input.value;
        element.innerHTML = '<p>'+x+ '</p>';
    }

    window.a = getValue;

}


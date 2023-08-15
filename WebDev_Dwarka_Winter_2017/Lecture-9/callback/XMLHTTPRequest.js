/**
 * Created by aayusharora on 1/7/18.
 */

var URL = 'http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22'
function NetworkCall(data) {
    var callObject = new XMLHttpRequest();

    callObject.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            console.log(typeof(this.responseText));
        }
    };

    callObject.open("GET", URL , true);
    callObject.send();
}

NetworkCall(function(result){
    console.log(result['coord'].lon);


});
/**
 * Created by aayusharora on 12/31/17.
 */
window.onload = function() {
    var km = document.getElementById('km');
    var wt = document.getElementById('wt');
    var btn = document.getElementById('btn');
    var result = document.getElementById('result');

    function totalPrice() {
        // Input
        var kmValue = km.value;
        var wtValue = wt.value;

        // Calling
       var price = kmPrice.calculatePrice(kmValue) +
                        timePrice.calculatePrice(wtValue);

       // Output
       result.innerHTML = price;
    }

    window.totalPrice = totalPrice;
}


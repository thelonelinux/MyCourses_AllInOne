/**
 * Created by aayusharora on 12/31/17.
 */

var timePrice = (function(){
    "use strict";
    var price = {};

    function calculatePrice(time) {
        var total;
        if(time<=15) {
            total =0;
        }
        else if (time <= 30) {
            total = 10*(time-15);
        }

        else {
            total = 150 + 15*(time-30);
        }

        return total;
    }

    price.calculatePrice = calculatePrice;


    return price;
})();
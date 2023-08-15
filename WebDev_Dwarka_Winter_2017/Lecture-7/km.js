/**
 * Created by aayusharora on 12/31/17.
 */
var kmPrice = (function(){
    "use strict";


    var price = {};

    function calculatePrice(km) {
        var total;
        if(km <= 5) {
            total = km * 20;
        }
        else if (km<= 20) {
            total = (km-5)*40  + 100;
        }

        else {
           total = (km-20)*50 + 700;
        }
      return total;
    }

    price.calculatePrice = calculatePrice;


    return price;

})();
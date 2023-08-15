/**
 * Created by aayusharora on 1/6/18.
 */
//
// This defaultly is an object, this.a is not assigned
// When no use strict var a = 7 => this.,a

var a = "7";

function checkCount() {
    count();
}

function count() {

    let a = 5;

    "use strict";

    function main() {

        console.log("Inside Main ",this);
        console.log(this.a);
    }


    main();
}

checkCount();


//     function a() {
//        "use strict";
//         let ab = 6;
//         console.log(this);
//     }
//
//     a()
//
// b();

//
// checkCount();
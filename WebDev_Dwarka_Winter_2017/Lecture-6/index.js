/**
 * Created by aayusharora on 12/30/17.
 */
// WINDOW
function parent() {

    // closure
    var x = 2;
    var y = 5;
    var functionArray = [];
    function child1(){

        function child3(){
            console.log("new Child3");
        }

        functionArray[3] = child3;
        //console.log("Child Value", x+y);
    }

    function child2(){

        console.log("Child Value", x+y);
    }

    function child3(){

        console.log("Old Child3");
    }

    functionArray[0] = child1;
    functionArray[1] = child2;
    functionArray[2] = child3;

    //child3();
    return functionArray;
}

var y = parent();
y[0](); // Assign new Child 3 to index 3
y[2]();  // To execute old child3
y[3]();   // To execute new Child3



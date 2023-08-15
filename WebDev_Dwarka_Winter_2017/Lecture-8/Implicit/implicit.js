/**
 * Created by aayusharora on 1/6/18.
 */

var fruit = {
    name: "Apple",
    taste: "sweet",
    update: function(name) {
        this.name = name;
        console.log(this);
    }
}

var car = {
    name: "M",
    taste: "sweet",
    update: function(name) {
        this.name = name;
        console.log(this);
    }
}
function getFruit() {
    //console.log(fruit.name);
    fruit.update("Kiwi");
    car.update("BMW");
}

// function update(name) {
//     fruit.name = name;
//     console.log(fruit);
// }
// update("Kiwi");
getFruit();
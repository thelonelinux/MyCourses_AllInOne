/**
 * Created by aayusharora on 1/7/18.
 */


// function add(data) {
//     console.log("Adding Numbers")
//     data(function(a,b){
//         console.log(a+b);
//     })
// }
//
// add(function(done){
//     done(2,3);
// });

function imageTransform(filter){
    console.log("We have collected the images");
    filter(function(){
        console.log("Enhancement ....")
    })

}


imageTransform(function(enhancement){
    console.log("Doing Filtering....");
    setTimeout(function(){

        console.log("Filtering")
    }, 5000);
    enhancement();
    console.log("Enhancement is done...");
});
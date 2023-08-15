/**
 * Created by aayusharora on 1/7/18.
 */


function phoneCall(otp) {
    console.log("Can we order pizza");
    console.log("I need your otp");
    console.log("Wait 1 second")
    otp();
    console.log("Wait 2.... second")
}

phoneCall(function(){
    console.log("Recieved Otp");
    setTimeout(function(){

        console.log("Payment is done");

    }, 1000)


   console.log("Still Waiting");
});
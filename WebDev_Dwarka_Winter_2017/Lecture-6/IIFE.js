/**
 * Created by aayusharora on 12/30/17.
 */

// Immediately Invoked Function Expression

    // Module called Blog containing two functions
var blog = (function(){
    "use strict";
    var userEnteries = {};
    function main() {
        function profileDetails(){
            // This is a private function
            let name = "Aayush";
            let email = "aayush@codingblocks.com";

            return [name, email];
        }

        function blogEnteries() {
            // This is a public function
            let post = ["Hello ", "Fake", "No sure"];
            return post;
        }

        return [profileDetails, blogEnteries];
    }


     var enteries = main();
     userEnteries.blog = enteries[1];
     return userEnteries;

})();


console.log(blog.blog());

blogEnteries();
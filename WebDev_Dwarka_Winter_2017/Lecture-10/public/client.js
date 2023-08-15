$(function(){
	"use strict";
    let input = $('#inp');
    let btn = $('#btn');

    btn.on('click', function(){
    	let value = input.val();
        let url = `todos?todo=${value}`;
        let result = $('#result'); 
        $.ajax({ 
        	    'type': 'GET',
        	    'url': url,
        	    'success': function(data){
                 result.append(data.todo);  
        } })


    })

})
	

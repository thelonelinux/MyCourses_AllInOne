/**
 * Created by aayusharora on 1/28/18.
 */
$(document).ready(function(){

let btn = $('#btn');
let result = $('#result');

function addTodo() {
    let data = $('#inp').val();
    $.post({'url': '/add',
             'data': {'data': data},
             'success': function(res){
               // console.log(res);
               // result.append(res + '\n');
                console.log(res);
             }
      });


}

function getList() {

   $.ajax({'url': '/todolist',
           'success': function(data){
               display(data);
           }})
} 

function display(data) {
   let li = "";
	result.text(" ");
	data.forEach((item,index)=>{
	    li += `<li onclick="deleteItem(this)" id=${index}>${item}</li>`;
	  
	})

	result.append(li);
}

// @param id
function deleteItem(el) {

   $.post({'url': '/delete', 
   	      'data': {'id': el.id},
   	       'success': function(data){
   	       	   display(data);
   	       }})
}

window.deleteItem = deleteItem;



btn.on('click', function(){
	addTodo();
})



});
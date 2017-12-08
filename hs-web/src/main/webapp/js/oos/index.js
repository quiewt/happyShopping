$(function(){
    getAllMenus();
})

function getAllMenus(){
    var content = $('#content');
    $.post(HTTP_URL+'getAllMenus',function(data){
        $.each(data,function(i,n){
            $('#content').append('<div><label>name:'+n.name+'</label><label>description:'+n.description+'</label>' +
                '<label>price:'+n.price+'</label></label></div>');
        });
    });
}

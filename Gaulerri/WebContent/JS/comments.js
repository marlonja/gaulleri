$(document).ready(function(){
    $('#button').click(function(){
        var firstAdd = $('input[name=commentsName]').val();
        var secondAdd = $('textarea[name=commentsText]').val();
        var sum = '<p>' + firstAdd + ':</p>' + '<p><em>' + secondAdd + '</em></p>';
        var datum = '<p>' + Date(); + '</p>'
        
        $('.list').append('<div class="item">' + datum + '<br>' + sum + '<hr></div>');
        $('#commentsName').val('');
        $('#commentsText').val('');
        
        $.post("comment", {"commentsName": firstAdd, "commentsText": secondAdd })
        .done(function(){
        	console.log("works")
        }).fail(function(){
        	console.log("fail");
        });
    });

   
});

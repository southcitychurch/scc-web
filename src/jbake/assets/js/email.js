
function buildRequestData() {
    return {
        from:'Mailgun Sandbox <postmaster@sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org>',
        to: $('#personEmail').val(),
        subject: 'Hello from ' + $('#personName').val(),
        text: $('#questions').val()
    };
}

function buildAjaxConf() {
    var errorFuncObj = function (xhr, ajaxOptions, thrownError) {
       console.log("Request failed with status" + xhr.status);
       console.log(thrownError);
    };
    var basicAuthFuncObj = function(xhr) {
        xhr.setRequestHeader ("Authorization", "Basic " + btoa("api:key-2a3c50e54d7747aec34a27feb1a9e35c"));
    };
    var successFuncObj = function(data) {
        console.log(data);
        $("#myModal").modal();
    };
    var theData = buildRequestData()
    return {
        type: "POST",
        url: "https://api.mailgun.net/v3/sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org/messages",
        crossDomain: true,
        error:  errorFuncObj,
        success: successFuncObj,
        beforeSend: basicAuthFuncObj,
        data: theData
     };
}

$( document ).ready(function() {
    $("#sendEmailBtn").click(function(){
        $.ajax(buildAjaxConf());
    });
});


function buildRequestData() {
    return {
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
    var successFuncObj = function(data) {
        console.log(data);
        $("#myModal").modal();
    };
    var theData = buildRequestData()
    return {
        type: "GET",
        url:"/email",
        error:  errorFuncObj,
        success: successFuncObj,
        data: theData
     };
}

$( document ).ready(function() {
    $("#sendEmailBtn").click(function(){
        $.ajax(buildAjaxConf());
    });
});

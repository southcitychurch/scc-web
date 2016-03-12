$( document ).ready(function() {
    //https://medium.com/@mariusc23/send-an-email-using-only-javascript-b53319616782#.716pmd482
    //https://mandrillapp.com/api/docs/messages.html
    var requestData = {
        "key": "MvLSH6-M1BNq8w4VGlaekw",
        "message": {
            "html": "<p>Example HTML content</p>",
            "text": "Example text content",
            "subject": "example subject",
            "from_email": "luistrigueiros@gmail.com",
            "from_name": "Luis Trigueiros",
            "to": [
                {
                    "email": "luistrigueiros@gmail.com",
                    "name": "Recipient Name",
                    "type": "to"
                }
            ],
            "headers": {
                "Reply-To": "luistrigueiros@gmail.com"
            },
            "auto_text": null,
            "auto_html": null
            },
        "async": false
    };

    var ajaxConfObj = {
        type: "POST",
        url: "https://mandrillapp.com/api/1.0/messages/send.json",
        data: requestData
     };
    var doneFuncObj = function(response) {
        console.log(response);
     };
    var clickFuncObj = function() {
        $.ajax(ajaxConfObj).done(doneFuncObj);
     };
    $('#sendEmailBtn').click(clickFuncObj);
});

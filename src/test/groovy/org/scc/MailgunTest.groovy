package org.scc

import groovyx.net.http.HTTPBuilder

class MailgunTest {
    //@Test()
    void shouldBeAbleToSendEmail() {

        HTTPBuilder http = new HTTPBuilder('https://api.mailgun.net/v3/sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org/messages')
        http.auth.basic 'api', 'key-2a3c50e54d7747aec34a27feb1a9e35c'
        def response = http.post(query: [
                from:'Mailgun Sandbox <postmaster@sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org>',
                to:'luistrigueiros <luistrigueiros@gmail.com>',
                subject: 'Hello luistrigueiros',
                text:'Congratulations luistrigueiros, you just sent an email with Mailgun!  You are truly awesome!'
        ])
        println response
        assert response
    }
}

package org.scc

import groovyx.net.http.HTTPBuilder
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class EmailController {

    final static Logger logger = LoggerFactory.getLogger(EmailController.class);

    @Value('${apiKey}')
    private String apiKey;

    @RequestMapping("/email")
    @ResponseBody
    String sendEmail(@RequestBody Email email) {
        logger.debug("Email request received $email")
        HTTPBuilder http = new HTTPBuilder('https://api.mailgun.net/v3/sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org/messages')
        http.auth.basic 'api', apiKey
        def response = http.post(query: [
                from:'Mailgun Sandbox <postmaster@sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org>',
                to: "dave@southcitychurch.org;info@southcitychurch.org;$email.to",
                subject: email.subject,
                text: email.text
        ])
        logger.debug(response.toString())
        return "Thank you for your email"
    }

}

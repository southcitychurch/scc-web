package org.scc

import groovyx.net.http.HTTPBuilder
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class EmailController {

    final static Logger logger = LoggerFactory.getLogger(EmailController.class);

    @RequestMapping("/email")
    @ResponseBody
    String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        logger.debug("To=[$to], subject=[$subject] text=[$text]")
        HTTPBuilder http = new HTTPBuilder('https://api.mailgun.net/v3/sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org/messages')
        http.auth.basic 'api', 'key-2a3c50e54d7747aec34a27feb1a9e35c'
        def response = http.post(query: [
                from:'Mailgun Sandbox <postmaster@sandbox1f1c8a6d340244db94f21f52fc273de8.mailgun.org>',
                to: to,
                subject: subject,
                text:text
        ])
        logger.debug(response.toString())
        return "Thank you for your email"
    }

}

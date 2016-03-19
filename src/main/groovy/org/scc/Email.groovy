package org.scc

import groovy.transform.Canonical

@Canonical
class Email {
    String to
    String subject
    String text
}

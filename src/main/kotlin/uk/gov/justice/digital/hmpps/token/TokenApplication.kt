package uk.gov.justice.digital.hmpps.token

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TokenApplication

fun main(args: Array<String>) {
  runApplication<TokenApplication>(*args)
}


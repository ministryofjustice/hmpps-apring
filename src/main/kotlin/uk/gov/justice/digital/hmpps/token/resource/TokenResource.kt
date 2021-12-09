package uk.gov.justice.digital.hmpps.token.resource

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@Validated
@RequestMapping("/token", produces = [MediaType.APPLICATION_JSON_VALUE])
class TokenResource() {

  @PostMapping("verify")
  fun verifyToken(
    @RequestHeader(HttpHeaders.AUTHORIZATION) bearerToken: String,
  ): String =
    throw ResponseStatusException(HttpStatus.BAD_REQUEST, """{request: "its a bad request}""")
}


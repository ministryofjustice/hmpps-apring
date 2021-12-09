package uk.gov.justice.digital.hmpps.token.resource

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.Test

class TokenResourceTest : IntegrationTest() {


  @Test
  fun `verify token parse exception`() {
    webTestClient.post().uri("/token/verify")
      .headers(setAuthorisation())
      .bodyValue("not a jwt")
      .exchange()
      .expectStatus().isBadRequest
      .expectBody()
      .jsonPath("$").value<HashMap<String, Any>> {
        assertThat(it).contains(entry("error", "Bad Request"))
      }
  }
}
